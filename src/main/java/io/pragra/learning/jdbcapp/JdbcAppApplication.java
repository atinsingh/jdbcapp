package io.pragra.learning.jdbcapp;

import io.pragra.learning.jdbcapp.dao.BlogDao;
import io.pragra.learning.jdbcapp.dao.UserDao;
import io.pragra.learning.jdbcapp.domain.Blog;
import io.pragra.learning.jdbcapp.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.Instant;

@Slf4j
@SpringBootApplication
public class JdbcAppApplication {

    private UserDao userDao;
    private BlogDao blogDao;


    public JdbcAppApplication(UserDao userDao, BlogDao blogDao) {
        this.userDao = userDao;
        this.blogDao = blogDao;
    }

    public static void main(String[] args) {
        SpringApplication.run(JdbcAppApplication.class, args);
    }

    @Bean
    CommandLineRunner runner() {
        return args -> {
            User user = new User(2,"Ashimit", "sddds32", Instant.now());
            userDao.createUser(user);

            Blog blog = new Blog(3,4,"Learning Angular",2,"Reference Documentation\n" +
                    "For further reference, please consider the following sections:");
            //userDao.deleteUser(2);
            blogDao.createBlog(blog);
        };
    }

}
