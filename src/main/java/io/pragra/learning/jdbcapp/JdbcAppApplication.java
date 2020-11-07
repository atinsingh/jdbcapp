package io.pragra.learning.jdbcapp;

import io.pragra.learning.jdbcapp.dao.UserDao;
import io.pragra.learning.jdbcapp.domain.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.Instant;

@SpringBootApplication
public class JdbcAppApplication {

    private UserDao userDao;

    public JdbcAppApplication(UserDao userDao) {
        this.userDao = userDao;
    }

    public static void main(String[] args) {
        SpringApplication.run(JdbcAppApplication.class, args);
    }

    @Bean
    CommandLineRunner runner() {
        return args -> {
            User user = new User(1,"John Doe", "djh8iehjhsjs", Instant.now());
            userDao.createUser(user);
        };
    }

}
