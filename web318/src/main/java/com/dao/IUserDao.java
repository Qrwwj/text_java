package com.dao;

import com.pojo.User;

import java.util.List;

public interface IUserDao {
    public User getUserByUsername(String username);
    public int insert(User user);
    public List<User> getAll();
    public User getUserByUsernameAndPassword(String username,String password);
    public int updatePasswordByUsername(String username, String password);


}
