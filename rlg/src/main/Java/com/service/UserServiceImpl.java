package com.service;

import com.dao.IUserDao;
import com.dao.UserDaoImpl;
import com.pojo.User;

import javax.servlet.http.Cookie;
import java.util.List;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public class UserServiceImpl implements IUserService {
    IUserDao dao = new UserDaoImpl();

    @Override
    public List<User> getUsers() {
        return dao.getUsers();
    }

    @Override
    public List<User> getUsers(String test) {
        return dao.getUsers(test);
    }

    @Override
    public int insert(User user) {
//        调用dao层中的insert方法 获取user对象
        return dao.insert(user);
    }

    @Override
    public int delete(int id) {
        return dao.delete(id);
    }

    @Override
    public User getUsersById(int id) {
        return dao.getUsersById(id);
    }

    @Override
    public int update(User user) {
        return dao.update(user);
    }

    @Override
    public User getUserByUsername(String usname,String psw) {
        User u=null;
        User user=dao.getUserByUsername(usname,psw);
//        条件判断   判断用户是否存在
        if (user!=null){
            if (user.getPassword().equals(psw)){
                u=user;
            }
    }
        return u;
    }

}
