package crud.dao;

import crud.pojo.User;

import java.util.List;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description:
 */
public interface UserDao {
    public User getUserByUsername(String username);
    public int insert(User user);
    public List<User> getAll();
    public User getUserByUsernameAndPassword(String username,String password);
    public int updatePasswordByUsername(String username,String password);
}
