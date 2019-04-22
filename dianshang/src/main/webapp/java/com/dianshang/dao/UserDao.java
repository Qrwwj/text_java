package com.dianshang.dao;

import com.dianshang.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description:
 */
public interface UserDao {
    public List<User> getuser(@Param("username") String username);
    public int insert(User user);
    public int update(User user);
    public int delete(Integer id);
    public User getUserByUsername(String username);
    public User getUserByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

}
