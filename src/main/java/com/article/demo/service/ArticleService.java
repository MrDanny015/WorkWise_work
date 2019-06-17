package com.article.demo.service;

import com.article.demo.bean.Article;
import com.article.demo.bean.C_Site;
import com.article.demo.bean.C_Type;
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

    /**
     * 发布文章
     * @param article
     * @throws Exception
     */
    void submitarticle(Article article) throws Exception;

    /**
     * 查询地址下拉框
     * @return
     */
    List<C_Site> selectsite();

    /**
     * 查询文章类型下拉框
     * @return
     */
    List<C_Type> selecttype();

    /**
     * 查询热门文章
     * @return
     */
    List<Article> selecthostArticle();

    /**
     * 删除我的文章
     * @param aid
     * @throws Exception
     */
    void deletearite(Integer aid)throws Exception;

    /**
     * 删除我的评论
     * @param aid
     * @throws Exception
     */
    void deletecomment(Integer aid)throws Exception;
}
