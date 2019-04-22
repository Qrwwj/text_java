package com.service;

import com.pojo.User;

import java.util.List;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public interface IUserService {
    public List<User> getUsers();

    public List<User> getUsers(String test);
//声明添加数据的构造方法
    public int insert(User user);

    public int delete(int id);

    public User getUsersById(int id);

    public int update(User user);
    public User getUserByUsername(String usname,String psw);


}
