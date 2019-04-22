package com.dao;

import com.pojo.User;
import com.utiles.JdbcUtil;
import com.utiles.RowMap;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public class UserDaoImpl implements IUserDao {

//    调用工具类中方法 查看数据库中数据
    @Override
    public List<User> getUsers() {
        return JdbcUtil.executeQuery("select * from user", new RowMap<User>() {
            @Override
            public User RowMapping(ResultSet rs) {
//                创建User类的对象  方便调用User类中的成员变量
                User user = new User();
                try {
                    user.setId(rs.getInt("id"));
                    user.setUname(rs.getString("uname"));
                    user.setPassword(rs.getString("password"));
                    user.setPhone(rs.getString("phone"));
                    user.setSex(rs.getInt("sex"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }

                return user;
            }
        }, null);
    }

//    模糊查询concat('%',?,'%')
    @Override
    public List<User> getUsers(String test) {
        return JdbcUtil.executeQuery("select * from user where uname like concat('%',?,'%')", new RowMap<User>() {
            @Override
            public User RowMapping(ResultSet rs) {
                User user=new User();
                try {
                    user.setUname(rs.getString("uname"));
                    user.setPassword(rs.getString("password"));
                    user.setPhone(rs.getString("phone"));
                    user.setSex(rs.getInt("sex"));
                    user.setId(rs.getInt("id"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return user;
            }
        }, test);
    }


    //   重写添加数据的方法
    @Override
    public int insert(User user) {
//        调用工具类中的方法并将数据添加到数据库中
        return JdbcUtil.executeUpdate("insert into user(uname,password,phone,sex) values(?,?,?,?)",
                user.getUname(),user.getPassword(),user.getPhone(),user.getSex());
    }

    @Override
    public int delete(int id) {
        return JdbcUtil.executeUpdate("delete from user where id=?",id);
    }

    @Override
    public User getUsersById(int id) {
        return JdbcUtil.queryOne("select * from user where id=?", new RowMap<User>() {
            @Override
            public User RowMapping(ResultSet rs) {
                User user=new User();
                try {
                    user.setUname(rs.getString("uname"));
                    user.setPassword(rs.getString("password"));
                    user.setPhone(rs.getString("phone"));
                    user.setSex(rs.getInt("sex"));
                    user.setId(rs.getInt("id"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return user;
            }
        }, id);
    }

    @Override
    public int update(User user) {
        return JdbcUtil.executeUpdate("update user set uname=?,password=?,phone=?,sex=? where id=?",
                user.getUname(),user.getPassword(),user.getPhone(),user.getSex(),user.getId());
    }

    @Override
    public User getUserByUsername(String usname,String psw) {
        return JdbcUtil.queryOne("select * from user where uname=?", new RowMap<User>() {
            @Override
            public User RowMapping(ResultSet rs) {
                User user=new User();
                try {
                    user.setUname(rs.getString("uname"));
                    user.setPassword(rs.getString("password"));
                    user.setPhone(rs.getString("phone"));
                    user.setSex(rs.getInt("sex"));
                    user.setId(rs.getInt("id"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return user;
            }
        }, usname);
    }

}
