package com.article.demo.service;

import com.article.demo.bean.Article;
import com.article.demo.bean.Comment;

import java.util.List;

/**
 * @author 丹尼 文章模块 业务接口
 */
public interface ArticleService {

    /**
     * 查询文章表
     * @param
     * @return
     */
    List<Article> selectArticle();

    /**
     * 提交评论
     * @param comment
     * @throws Exception
     */
    void submitcomment(Comment comment) throws Exception;
}
