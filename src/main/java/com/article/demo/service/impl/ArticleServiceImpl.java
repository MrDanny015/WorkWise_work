package com.article.demo.service.impl;

import com.article.demo.bean.*;
import com.article.demo.dao.*;
import com.article.demo.service.ArticleService;
import com.user.demo.bean.User;
import com.utils.IDCodeload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * @author 丹尼 文章模块 业务实现
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    @Autowired
    private CommentMapper commentMapper;

    @Autowired
    private C_TypeMapper c_typeMapper;

    @Autowired
    private C_SiteMapper c_siteMapper;

    @Autowired
    private C_RecordMapper c_recordMapper;

    @Autowired
    private HttpServletRequest request;


    /**
     * 文章列表
     *
     * @return
     */
    @Override
    public List<Article> selectArticle() {
        ArticleExample articleExample = new ArticleExample();
        List<Article> articles = articleMapper.selectByExample(articleExample);
        //遍历每一个文章
        for (int i = 0; i < articles.size(); i++) {
            //存放每个文章的评论数据
            CommentExample commentExample = new CommentExample();
            commentExample.createCriteria().andAidEqualTo(articles.get(i).getAid());
            List<Comment> comments = commentMapper.selectByExample(commentExample);
            articles.get(i).setCtexts(comments);
            //初始化文章评论数
            articles.get(i).setComcount(comments.size());
        }
        return articles;
    }

    /**
     * 评论文章
     *
     * @param comment
     * @throws Exception
     */
    @Override
    public void submitcomment(Comment comment) throws Exception {
        //获取当前用户信息
        User user = (User) request.getSession().getAttribute("user");
        //设置当前评论的作者
        comment.setUid(user.getUid());
        //获取系统当前时间设置评论时间
        comment.setCommenttime(new Date());
        comment.setText(comment.getText().replaceAll(",", ""));
        comment.setCid("CO"+IDCodeload.genItemId());
        commentMapper.insert(comment);
        //浏览量加一
        articleMapper.uodPageviews(comment.getAid());
    }

    /**
     * 发布新动态
     *
     * @param article
     * @throws Exception
     */
    @Override
    public void submitarticle(Article article) throws Exception {
        ArticleExample articleExample = new ArticleExample();
        //生成文章id
        article.setAid("AR"+IDCodeload.genItemId());
        //设置发布时间（当前系统时间）
        article.setCreattime(new Date());
        //初始化阅读量
        article.setPageviews(0);
        //初始化点赞量
        article.setPraise(0);
        //添加文章
        articleMapper.insert(article);
    }

    /**
     * 查询地址列表
     *
     * @return
     */
    @Override
    public List<C_Site> selectsite() {
        C_SiteExample c_siteExample = new C_SiteExample();
        return c_siteMapper.selectByExample(c_siteExample);
    }

    /**
     * 查询文章类型列表
     *
     * @return
     */
    @Override
    public List<C_Type> selecttype() {
        C_TypeExample c_typeExample = new C_TypeExample();
        return c_typeMapper.selectByExample(c_typeExample);
    }

    /**
     * 查询热门文章
     *
     * @return
     */
    @Override
    public List<Article> selecthostArticle() {
        return articleMapper.selecthostArticle();
    }

    /**
     * 删除我的文章
     *
     * @param aid
     * @throws Exception
     */
    @Override
    public void deletearite(String aid) throws Exception {
        articleMapper.deleteByPrimaryKey(aid);
        CommentExample commentExample = new CommentExample();
        commentExample.createCriteria().andAidEqualTo(aid);
        commentMapper.deleteByExample(commentExample);

    }

    /**
     * 删除我的评论
     *
     * @param cid
     * @throws Exception
     */
    @Override
    public void deletecomment(String cid) throws Exception {
        commentMapper.deleteByPrimaryKey(cid);
    }

    /***
     * 查询我的点赞
     * @return
     */
    @Override
    public List<C_Record> selectLike() {
        //获取当前用户信息
        User user = (User) request.getSession().getAttribute("user");
        //查询属于当前用户点过赞的文章
        List<C_Record> c_records = c_recordMapper.selectmyLike(user.getUid());
        return c_records;
    }

    /**
     * 文章点赞
     * @param aid
     * @throws Exception
     */
    @Override
    public void likeed(String aid) throws Exception {
        //获取当前用户信息
        User user = (User) request.getSession().getAttribute("user");
        C_Record c_record = c_recordMapper.selectlikestuats(aid, user.getUid());

        if (c_record!=null && !c_record.equals("")){
            c_recordMapper.selectlikestuatsed(c_record.getRid());
            //文章表 此文章点赞量加一
            articleMapper.updLikeed(aid);
            //浏览量加一
            articleMapper.uodPageviews(aid);
        }else {
            //生成点赞ID
            String rid = "LI"+IDCodeload.genItemId();
            //添加文章ID 当前用户ID 当前系统时间 数据ID在数据库自增生成
            c_recordMapper.insert(new C_Record(rid,aid,user.getUid(), new Date(),1));
            //文章表 此文章点赞量加一
            articleMapper.updLikeed(aid);
            //浏览量加一
            articleMapper.uodPageviews(aid);
        }

    }

    /**
     * 文章取消赞
     * @param aid
     * @throws Exception
     */
    @Override
    public void likeout(String aid) throws Exception {
        //获取当前用户信息
        User user = (User) request.getSession().getAttribute("user");
        C_Record c_record = c_recordMapper.selectlikestuats(aid, user.getUid());
        c_recordMapper.selectlikestuatsout(c_record.getRid());
        //文章表 此文章点赞量减一
        articleMapper.updLikeout(aid);
    }


}
