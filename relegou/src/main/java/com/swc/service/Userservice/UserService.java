package com.swc.service.Userservice;

import com.swc.pojo.User;

import java.util.List;

public interface UserService {
    public List<User> getusers();
    public int insert(User user);
    public int update(User user);
    public int delete(int id);
    public User getUserByUsername(String username);
    public User getUserByUsernameAndPassword(String username,String password);
    public User selectone(int id);
}
