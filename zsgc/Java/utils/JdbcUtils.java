package utils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public class JdbcUtils {
    //连接数据库
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/demo?userUnicode=turecharacterEncoding=utf8";
    private static final String USER = "root";
    private static final String PSW = "1234";

    //    注册驱动  声明为静态方法 先运行
    static {
        try {
            new com.mysql.jdbc.Driver();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //声明连接数据库的方法
    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PSW);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    //声明关闭数据库的方法  resultSet 获取查询后的结果集  PreparedStatement 执行sql语句 Connection连接数据库
    public static void closeAll(ResultSet rs, PreparedStatement psm, Connection conn) {
//        判断三个方法是否为空  为空说明没有调用不用刻意关闭 不为空的话需要关闭 并且三者之间关闭时存在优先级关系
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (psm != null) {
            try {
                psm.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    //    声明增删改的方法   返回值类型定义为int类型为了方便记录发生改变的数字
//    Object...objects 表示可以传多个参数 方便简洁
    public static int executeUpdate(String sql, Object... objects) {
//声明一个变量记录发生变化的条数
        int count = 0;
//        创建连接
        Connection conn = getConnection();
//       声明preparedStatement的对象 方便执行sql语句
        PreparedStatement psm = null;
        try {
            psm = conn.prepareStatement(sql);
//            判断传入的参数数量 即"?"---占位符的个数
            if (objects != null) {
                for (int i = 0; i < objects.length; i++) {
//                    通过对象psm调用setObject（）方法 获取占位符数量  占位符的下标是从1开始的 所以这里i+1
                    psm.setObject(i + 1, objects[i]);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeAll(null, psm, conn);
        }
        return count;
    }

    //    声明查询数据的方法  这里用到泛型 方便接收传入的参数（用到泛型无需考虑类型）
    public static <T> List<T> executeQuery(String sql, RowMap<T> rowMap, Object... objects) {
//创建一个集合  存储查询后的结果
        List<T> list = new ArrayList<T>();
//       连接数据库
        Connection conn = getConnection();
//        声明preparedStatement的对象 方便执行sql语句
        PreparedStatement psm = null;
//        声明ResultSet的对象 方便查看查询后的结果
        ResultSet rs = null;
//        判断参数个数
        try {
            psm = conn.prepareStatement(sql);
            if (objects != null) {
                for (int i = 0; i < objects.length; i++) {
                    psm.setObject(i + 1, objects[i]);
                }
            }
//            通过ResultSet的对象rs查看查询后的结果集
            rs = psm.executeQuery();
            while (rs.next()) {
//                通过泛型创建一个对象 获取查询后的结果集并将其存储到集合中
                T t = rowMap.RowMapping(rs);
                list.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeAll(rs, psm, conn);
        }
        return list;
    }

    //        声明查询一条语句的方法
    public static <T> T eQueryOne(String sql, RowMap<T> rowMap, Object... objects) {
//        直接声明一个集合对象 接收查询到的数据
        T t = null;
//        创建连接
        Connection conn=getConnection();
//        声明ResultSet的对象 方便查看查询后的结果
        PreparedStatement psm=null;
        ResultSet rs=null;
        try {
            psm=conn.prepareStatement(sql);
            if (objects!=null){
                for (int i=0;i<objects.length;i++){
                    psm.setObject(i+1,objects[i]);
                }
            }
            rs=psm.executeQuery();
            while (rs.next()){
                t=rowMap.RowMapping(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return t;
    }
//    声明一个记录数据条数的方法
    public static<T> int executeCount(String sql,Object...objects){
        int count=0;
        Connection conn=getConnection();
        PreparedStatement psm=null;
        ResultSet rs=null;
        try {
            psm=conn.prepareStatement(sql);
            if(objects!=null){
                for (int i=0;i<objects.length;i++){
                    psm.setObject(i+1,objects[i]);
                }
            }
            rs=psm.executeQuery();
            while (rs.next()){
                count=rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            closeAll(rs,psm,conn);
        }
        return count;
    }
}
