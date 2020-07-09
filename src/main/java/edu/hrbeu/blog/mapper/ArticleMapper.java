package edu.hrbeu.blog.mapper;

import edu.hrbeu.blog.entity.Article;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ArticleMapper {

    @Select("select * from article order by article_create_time desc")
    List<Article> findAll();

    @Select("select * from article where article_id = #{id}")
    Article findArticleById(Integer id);
}
