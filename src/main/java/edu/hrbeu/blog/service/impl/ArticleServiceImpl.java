package edu.hrbeu.blog.service.impl;

import edu.hrbeu.blog.entity.Article;
import edu.hrbeu.blog.mapper.ArticleMapper;
import edu.hrbeu.blog.mapper.UserMapper;
import edu.hrbeu.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public List<Article> findAll() {
        return articleMapper.findAll();
    }

    @Override
    public Article findArticleById(Integer id) {
        return articleMapper.findArticleById(id);
    }
}
