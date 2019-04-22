package com.wwj.pojo;


import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Integer id;
    private String username;
    private String password;
    private String email;
    private String phone;
    private String question;
    private String answer;
    private Integer role;
    private Date createTime;
    private Date updateTime;

    public User() {
    }

    public User(String username, String password, String email, String phone, String question, String answer, Integer role, Date createTime, Date updateTime) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.question = question;
        this.answer = answer;
        this.role = role;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }
}
