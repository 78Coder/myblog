package edu.hrbeu.blog.service;

import edu.hrbeu.blog.entity.Article;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ArticleService {

    List<Article> findAll();

    Article findArticleById(Integer id);


}
