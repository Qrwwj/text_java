package service;

import dao.IUserDao;
import dao.UserDaoImpl;
import pojo.User;

import java.util.List;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public class UserServiceImpl implements IUserService {

    //    创建IUserDao对象 与dao层产生连接
    IUserDao dao =new UserDaoImpl();
    @Override
    public List<User> getUsers() {
        return dao.getUsers();
    }

    @Override
    public List<User> getUsers(String text) {
        return null;
    }

    @Override
    public User getUsersById(int id) {
        return dao.getUsersById(id);
    }
}
