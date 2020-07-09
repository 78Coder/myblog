package edu.hrbeu.blog.controller.admin;

import edu.hrbeu.blog.entity.Article;
import edu.hrbeu.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping("/articlelist.do")
    @ResponseBody
    public ModelAndView articlelist(){
        List<Article> articles = articleService.findAll();
        ModelAndView mv = new ModelAndView();
        mv.addObject("articles",articles);
        mv.setViewName("main");
        return mv;
    }


    @RequestMapping("/article.do/{id}")
    @ResponseBody
    public ModelAndView article(@PathVariable Integer id){
        ModelAndView mv = new ModelAndView();
        Article article = articleService.findArticleById(id);
        mv.addObject("article",article);
        mv.setViewName("article");
        return mv;
    }






}
