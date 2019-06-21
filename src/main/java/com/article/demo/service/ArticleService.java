package com.article.demo.service;

import com.article.demo.bean.*;

import java.util.List;

/**
 * @author 丹尼 文章模块 业务接口
 */
public interface ArticleService {

    /**
     * 查询文章表
     *
     * @param
     * @return
     */
    List<Article> selectArticle();

    /**
     * 提交评论
     *
     * @param comment
     * @throws Exception
     */
    void submitcomment(Comment comment) throws Exception;

    /**
     * 发布文章
     *
     * @param article
     * @throws Exception
     */
    void submitarticle(Article article) throws Exception;

    /**
     * 查询地址下拉框
     *
     * @return
     */
    List<C_Site> selectsite();

    /**
     * 查询文章类型下拉框
     *
     * @return
     */
    List<C_Type> selecttype();

    /**
     * 查询热门文章
     *
     * @return
     */
    List<Article> selecthostArticle();

    /**
     * 删除我的文章
     *
     * @param aid
     * @throws Exception
     */
    void deletearite(String aid) throws Exception;

    /**
     * 删除我的评论
     *
     * @param aid
     * @throws Exception
     */
    void deletecomment(String aid) throws Exception;

    /**
     * 我的点赞👍
     * @return
     */
    List<C_Record> selectLike();

    /**
     * 点赞
     * @param aid
     * @throws Exception
     */
    void likeed(String aid) throws Exception;

    /**
     * 取消赞
     * @param aid
     * @throws Exception
     */
    void likeout(String aid) throws Exception;


}
