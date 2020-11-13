package io.pragra.learning.jdbcapp.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.Instant;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    private int id;
    private String userName;
    private String userPass;
    private Date createDate;
}
