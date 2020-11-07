package io.pragra.learning.jdbcapp.mapper;

import io.pragra.learning.jdbcapp.domain.Blog;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomMapper implements RowMapper<Blog> {
    @Override
    public Blog mapRow(ResultSet resultSet, int i) throws SQLException {
        return null;
    }
}
