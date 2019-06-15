package com.article.demo.service.impl;

import com.article.demo.bean.Article;
import com.article.demo.bean.ArticleExample;
import com.article.demo.bean.Comment;
import com.article.demo.bean.CommentExample;
import com.article.demo.dao.ArticleMapper;
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
    private HttpServletRequest request;

    /**
     * 文章列表
     * @return
     */
    @Override
    public List<Article> selectArticle() {
        ArticleExample articleExample = new ArticleExample();
        List<Article> articles = articleMapper.selectByExample(articleExample);
        for (int i = 0; i < articles.size() ; i++) {
            CommentExample commentExample = new CommentExample();
            commentExample.createCriteria().andAidEqualTo(articles.get(i).getAid());
            List<Comment> comments = commentMapper.selectByExample(commentExample);
            articles.get(i).setCtexts(comments);
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
        //设置当前评论的用于
        comment.setUid(user.getUid());
        //获取系统当前时间设置评论时间
        comment.setCommenttime(new Date());
        comment.setText(comment.getText().replaceAll(",",""));
        commentMapper.insert(comment);
        articleMapper.uodPageviews(comment.getAid());
    }
}
