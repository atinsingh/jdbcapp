package io.pragra.learning.jdbcapp.dao;

import io.pragra.learning.jdbcapp.domain.Blog;
import io.pragra.learning.jdbcapp.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Slf4j
public class BlogDao {

    private UserDao userDao;
    private JdbcTemplate template;

    public BlogDao(UserDao userDao, JdbcTemplate template) {
        this.userDao = userDao;
        this.template = template;
    }

    public Blog createBlog(Blog blog) {
        User user = userDao.getUser(blog.getUserId());
        if (user != null) {

        }else {

        }
        return null;
    }

    public List<Blog> getAllBlog() {
        return template.query("SELECT * FROM BLOGS", new BeanPropertyRowMapper<Blog>(Blog.class));
    }
}
