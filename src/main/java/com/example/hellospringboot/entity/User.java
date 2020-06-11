package com.example.hellospringboot.entity;

import java.io.Serializable;

/**
 * @Author ls
 * @Date 2020/06/11 16:07:16
 * @Description
 * @Version 1.0
 **/
public class User implements Serializable {
    private static final long serialVersionUID = 1084911469173662824L;
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
