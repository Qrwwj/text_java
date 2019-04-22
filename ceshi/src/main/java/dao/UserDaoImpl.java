package dao;

import pojo.User;
import utils.JDBCUtils;
import utils.RowMap;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public class UserDaoImpl implements IUserDao {
//    查询全部
    @Override
    public List<User> getUsers() {
        return JDBCUtils.executeQuery("select * from student", new RowMap<User>() {
            @Override
            public User RowMapping(ResultSet rs) {
                User user=new User();
                try {
                    user.setId(rs.getInt("id"));
                    user.setSname(rs.getString("sname"));
                    user.setSage(rs.getInt("sage"));
                    user.setDept(rs.getString("dept"));
                    user.setSex(rs.getInt("sex"));
                    user.setPassword(rs.getString("password"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return user;
            }
        },null);
    }
//模糊查询
    @Override
    public List<User> getUsers(String text) {
        return null;
    }

    @Override
    public User getUsersById(int id) {
        return JDBCUtils.queryOne("select * from student where id=?", new RowMap<User>() {
            @Override
            public User RowMapping(ResultSet rs) {
                User user=new User();
                try {
                    user.setId(rs.getInt("id"));
                    user.setSname(rs.getString("sname"));
                    user.setSage(rs.getInt("sage"));
                    user.setDept(rs.getString("dept"));
                    user.setSex(rs.getInt("sex"));
                    user.setPassword(rs.getString("password"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return user;
            }
        },id);
    }
}
