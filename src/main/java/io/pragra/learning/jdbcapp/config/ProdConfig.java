package io.pragra.learning.jdbcapp.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

@Configuration
@Profile("prod")
public class ProdConfig {
    private String userName;
    private String pass;
    private String url;
    private String driverClassName;


}
