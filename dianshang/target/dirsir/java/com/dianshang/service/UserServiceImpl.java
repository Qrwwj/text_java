package com.dianshang.service;

import com.dianshang.dao.UserDao;
import com.dianshang.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description:
 */
@Service
public class UserServiceImpl implements IUserService {
    @Resource  /*依赖注入 控制反转*/
    private UserDao dao;

    @Override
    public List<User> getuser(String username) {
        return dao.getuser(username);
    }

    @Override
    public int insert(User user) {
        return dao.insert(user);
    }

    @Override
    public int update(User user) {
        return dao.update(user);
    }

    @Override
    public int delete(Integer id) {
        return dao.delete(id);
    }

    @Override
    public User getUserByUsername(String username) {
        return dao.getUserByUsername(username);
    }

    @Override
    public User getUserByUsernameAndPassword(String username, String password) {
        return dao.getUserByUsernameAndPassword(username,password);
    }


}
