package com.fjs.backoffice.mapper;


import com.fjs.backoffice.model.User;

public interface UserMapper {

    public void register(User user);

    public User findUserById(int id);
}
