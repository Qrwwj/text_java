package dao;

import pojo.User;

import java.util.List;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public interface IUserDao {
    public List<User> getUsers();
    public List<User> getUsers(String text);
    public User getUsersById(int id);
}
