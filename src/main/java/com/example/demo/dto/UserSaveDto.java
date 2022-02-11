package com.example.demo.dto;

import lombok.Data;

@Data
public class UserSaveDto {
    private long id;
    private String username;
    private String name;
    private String password;
    private String createTime;
    private String updateTime;
}
