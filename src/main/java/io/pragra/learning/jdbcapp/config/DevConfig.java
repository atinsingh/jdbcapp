package io.pragra.learning.jdbcapp.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@Profile("dev")
public class DevConfig {


    @Bean
    DataSource dataSource(){
     DriverManagerDataSource dataSource
             = new DriverManagerDataSource();
     dataSource.setUsername("sa");
     dataSource.setPassword("");
     dataSource.setUrl("jdbc:h2:file:~/data/appdb");
     return dataSource;
    }



}
