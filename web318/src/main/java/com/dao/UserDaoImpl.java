package com.dao;

import com.pojo.User;
import com.utils.JDBCUtil;
import com.utils.RowMap;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public class UserDaoImpl implements IUserDao
{
    @Override
    public User getUserByUsername(String username) {
        return JDBCUtil.QueryOne("select * from user where username=?", new RowMap<User>() {
            @Override
            public User RowMapping(ResultSet rs) {
                User user = new User();
                try {
                    user.setUsername(rs.getString("username"));
                    user.setPassword(rs.getString("password"));
                    user.setQuestion(rs.getString("question"));
                    user.setAnswer(rs.getString("answer"));
                    user.setEmail(rs.getString("email"));
                    user.setPhone(rs.getString("phone"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return user;
            }
        }, username);
    }

    @Override
    public int insert(User user) {
        return JDBCUtil.executeUpdate("insert into user(username,password,phone,email,question,answer,role,createtime,updatetime) values(?,?,?,?,?,?,?,?,?)",
                user.getUsername(),user.getPassword(),user.getPhone(),user.getEmail(),user.getQuestion(),user.getAnswer(),1,new Date(),new Date());
    }

    @Override
    public List<User> getAll() {
        return JDBCUtil.executeQuery("select * from user", new RowMap<User>() {
            @Override
            public User RowMapping(ResultSet rs) {
                User user = new User();
                try {

                    user.setUsername(rs.getString("username"));
                    user.setPassword(rs.getString("password"));
                    user.setQuestion(rs.getString("question"));
                    user.setAnswer(rs.getString("answer"));
                    user.setEmail(rs.getString("email"));
                    user.setPhone(rs.getString("phone"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return user;
            }
        }, null);
    }


    @Override
    public User getUserByUsernameAndPassword(String username,String password) {
        return JDBCUtil.QueryOne("select * from user where username=? and password=? ", new RowMap<User>() {
            @Override
            public User RowMapping(ResultSet rs) {
                User user = new User();
                try {
                    user.setUsername(rs.getString("username"));
                    user.setPassword(rs.getString("password"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return user;
            }
        }, username,password);
    }

    @Override
    public int updatePasswordByUsername(String username,String password) {
        return JDBCUtil.executeUpdate("update user set password=? where username=?",password,username);
    }


}
