package com.service;

import com.dao.IUserDao;
import com.dao.UserDaoImpl;
import com.pojo.User;

import java.util.List;

public class UserServiceImpl implements IUserService {

    private IUserDao dao = new UserDaoImpl();
    @Override
    public User getUserByUsername(String username) {
        return dao.getUserByUsername(username);
    }

    @Override
    public int insert(User user) {

        return dao.insert(user);

    }

    @Override
    public List<User> getAll() {
        return dao.getAll();
    }

    @Override
    public User getUserByUsernameAndPassword(String username,String password) {
        return dao.getUserByUsernameAndPassword(username,password);
    }

    @Override
    public int updatePasswordByUsername(String username, String password) {
        return dao.updatePasswordByUsername(username,password);
    }


}
