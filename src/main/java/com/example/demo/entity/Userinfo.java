package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Userinfo {
    private long id;
    private long user_id;
    private String address;
    private String type;
    private User users;
}
