package com.fjs.backoffice.model;

import java.util.Date;

public class User {

    private int id;
    private String username;
    private String password;
    private String email;
    private String phone;
    private String device_list;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDevice_list() {
        return device_list;
    }

    public void setDevice_list(String device_list) {
        this.device_list = device_list;
    }

    public User() {
    }

    public User(int id, String username, String password, String email, String phone, String device_list) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.device_list = device_list;
    }
}