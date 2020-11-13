package io.pragra.learning.jdbcapp.dao;

import io.pragra.learning.jdbcapp.domain.Blog;
import io.pragra.learning.jdbcapp.domain.User;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
@Slf4j
@AllArgsConstructor
public class BlogDao {

    private UserDao userDao;
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;


    public Blog createBlog(Blog blog) {
        /*
        BLOG_NAME CHAR(255),
    BLOG_CATEGORY INT,
    BLOG_TEXT CHAR(5000)
         */
        String sql =
                "INSERT INTO BLOGS VALUES( :userId, :blogName,:blogCategory,:blogText)";

        SqlParameterSource source = new BeanPropertySqlParameterSource(blog);

        namedParameterJdbcTemplate.update(sql, source);
        return blog;
    }

}
