package com.article.demo.service.impl;

import com.article.demo.bean.*;
import com.article.demo.dao.ArticleMapper;
import com.article.demo.dao.C_SiteMapper;
import com.article.demo.dao.C_TypeMapper;
import com.article.demo.dao.CommentMapper;
import com.article.demo.service.ArticleService;
import com.user.demo.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
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
    private HttpServletRequest request;



    /**
     * 文章列表
     * @return
     */
    @Override
    public List<Article> selectArticle() {
        ArticleExample articleExample = new ArticleExample();
        List<Article> articles = articleMapper.selectByExample(articleExample);
        //遍历每一个文章
        for (int i = 0; i < articles.size() ; i++) {
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
     * @param comment
     * @throws Exception
     */
    @Override
    public void submitcomment(Comment comment) throws Exception {
        //获取当前用户ID
        User user = (User) request.getSession().getAttribute("user");
        //设置当前评论的作者
        comment.setUid(user.getUid());
        //获取系统当前时间设置评论时间
        comment.setCommenttime(new Date());
        comment.setText(comment.getText().replaceAll(",",""));
        commentMapper.insert(comment);
        articleMapper.uodPageviews(comment.getAid());
    }

    /**
     * 发布新动态
     * @param article
     * @throws Exception
     */
    @Override
    public void submitarticle(Article article) throws Exception {
        ArticleExample articleExample = new ArticleExample();
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
     * @return
     */
    @Override
    public List<C_Site> selectsite() {
        C_SiteExample c_siteExample = new C_SiteExample();
        return c_siteMapper.selectByExample(c_siteExample);
    }

    /**
     * 查询文章类型列表
     * @return
     */
    @Override
    public List<C_Type> selecttype() {
        C_TypeExample c_typeExample = new C_TypeExample();
        return c_typeMapper.selectByExample(c_typeExample);
    }

    /**
     * 查询热门文章
     * @return
     */
    @Override
    public List<Article> selecthostArticle() {
        return articleMapper.selecthostArticle();
    }

    /**
     * 删除我的文章
     * @param aid
     * @throws Exception
     */
    @Override
    public void deletearite(Integer aid) throws Exception {
        articleMapper.deleteByPrimaryKey(aid);
        CommentExample commentExample = new CommentExample();
        commentExample.createCriteria().andAidEqualTo(aid);
        commentMapper.deleteByExample(commentExample);

    }

    /**
     * 删除我的评论
     * @param cid
     * @throws Exception
     */
    @Override
    public void deletecomment(Integer cid) throws Exception {
       commentMapper.deleteByPrimaryKey(cid);
    }
}
