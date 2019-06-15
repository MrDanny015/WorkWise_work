package com.article.demo.controlller;

import com.article.demo.bean.Article;
import com.article.demo.bean.Comment;
import com.article.demo.service.ArticleService;
import com.msgbean.Receipt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 丹尼 文章模块 控制层
 */
@Controller
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    /**
     * 社交平台主页
     * @param model
     * @return
     */
    @RequestMapping("index.html")
    public String selectArticle(Model model){
        List<Article> articles = articleService.selectArticle();
        model.addAttribute("ArticleList",articles);
        return "index";
    }

    /**
     * 评论文章
     * @param comment
     * @return
     */
    @ResponseBody
    @RequestMapping("submitcomment")
    public Boolean submitcomment(Comment comment){
        try {
            articleService.submitcomment(comment);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }





}
