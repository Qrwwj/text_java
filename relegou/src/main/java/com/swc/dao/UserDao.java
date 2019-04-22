package com.swc.dao;

import com.swc.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    public List<User> getusers();
    public int insert(User user);
    public int update(User user);
    public int delete(int id);
    public User getUserByUsername(String username);
    public User getUserByUsernameAndPassword(@Param("username")String username,@Param("password")String password);
    public User selectone(int id);
}
