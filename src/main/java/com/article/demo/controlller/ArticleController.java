package com.article.demo.controlller;

import com.article.demo.bean.Article;
import com.article.demo.bean.C_Site;
import com.article.demo.bean.C_Type;
import com.article.demo.bean.Comment;
import com.article.demo.service.ArticleService;
import com.msgbean.Receipt;
import com.user.demo.bean.User;
import com.user.demo.bean.UserExample;
import com.user.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 丹尼 文章模块 控制层
 */
@Controller
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @Autowired
    private UserService userService;

    /**
     * 社交平台主页
     * @param model
     * @return
     */
    @RequestMapping("index.html")
    public String selectArticle(Model model){
        //文章集合
        List<Article> articles = articleService.selectArticle();
        //人气榜集合
        List<User> users = userService.selectHosts();
        //热门文章集合
        List<Article> articleshost = articleService.selectArticle();

        //存入model用于前台div遍历
        model.addAttribute("userhost",users);
        model.addAttribute("ArticleList",articles);
        model.addAttribute("articleshost",articleshost);
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

    /**
     * 发布新动态
     * @param article
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping("submitarticle")
    public Receipt submitarticle(Article article){
        Receipt receipt = new Receipt();
        try {
            articleService.submitarticle(article);
            receipt.setFlag(true);
        } catch (Exception e) {
            e.printStackTrace();
            receipt.setFlag(false);
        }
        return receipt;
    }

    /**
     * 查询地址列表
     * @return
     */
    @ResponseBody
    @RequestMapping("selectsite")
    public Map<String,Object> selectsite(){
        HashMap<String, Object> map = new HashMap<>();
        List<C_Site> selectsite = articleService.selectsite();
        //返回map，，我返回的map包含了两个属性：data：集合，total：集合记录数量，所以后边会有data.data的写法。。。
        map.put("data",selectsite);
        map.put("total",selectsite.size());
        return map;
    }

    /**
     * 查询文章类型列表
     * @return
     */
    @ResponseBody
    @RequestMapping("selecttype")
    public Map<String,Object> selecttype(){
        HashMap<String, Object> map = new HashMap<>();
        List<C_Type> selecttype = articleService.selecttype();
        //返回map，，我返回的map包含了两个属性：data：集合，total：集合记录数量，所以后边会有data.data的写法。。。
        map.put("data",selecttype);
        map.put("total",selecttype.size());
        return map;
    }

    /**
     * 删除我的文章
     * @return
     */
    @RequestMapping("deletearite")
    @ResponseBody
    public Boolean deletearite(Integer aid){
        try {
            articleService.deletearite(aid);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 删除我的评论
     * @return
     */
    @RequestMapping("deletecomment")
    @ResponseBody
    public Boolean deletecomment(Integer cid){
        try {
            articleService.deletecomment(cid);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
