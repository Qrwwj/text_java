package utils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public class JDBCUtils {
    //    连接数据库
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/ceshi?useUnicode=true&characterEncoding=utf8";
    private static final String USER = "root";
    private static final String PWD = "1234";

    //    执行注册驱动方法体
    static {
        try {
//            注册驱动
            new com.mysql.jdbc.Driver();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    //专门定义一个方法 创建链接
    //按着自己的需求 封装方法 给自己使用

    //    声明一个获取数据库连接的方法
    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PWD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    //    声明关闭数据库连接释放资源的方法（有参构造方法）
    public static void close(ResultSet rs, PreparedStatement pstmt, Connection conn) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (pstmt != null) {
            try {
                pstmt.close();
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

    //定义方法 增删改
    public static int executeUpdate(String sql, Object... obj) {
//声明一个变量  记录放生变化的行数
        int a = 0;
//        获取连接
        Connection conn = getConnection();
//        声明一个PreparedStatement引用   方便后边获取对象
        PreparedStatement pstmt = null;
        try {
//            获取对象  执行预编译执行语句sql 通过PreparedStatement pstmt与执行语句返回的对象
            pstmt = conn.prepareStatement(sql);
            if (obj != null) {
                for (int i = 0; i < obj.length; i++) {
                    pstmt.setObject(i + 1, obj[i]);
                }
            }
            a = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(null, pstmt, conn);
        }
        return a;
    }
    //查看数据的方法
    public static <T> List<T> executeQuery(String sql, RowMap<T> rm, Object... obj) {
        List<T> lists = new ArrayList<T>();
        Connection conn = conn = getConnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            pstmt = conn.prepareStatement(sql);
            if (obj != null) {
                for (int i = 0; i < obj.length; i++) {
                    pstmt.setObject(i + 1, obj[i]);
                }
            }
            rs = pstmt.executeQuery();
            while (rs.next()) {
                T t = rm.RowMapping(rs);
                lists.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(rs, pstmt, conn);
        }
        return lists;
    }

    //    查询一个数据
    public static <T> T queryOne(String sql, RowMap<T> rm, Object... obj) {
        T t = null;
        Connection conn = getConnection();
        PreparedStatement pstmt = null;
        try {
            pstmt = conn.prepareStatement(sql);
            if (obj != null) {
                for (int i = 0; i < obj.length; i++) {
                    pstmt.setObject(i + 1, obj[i]);
                }
            }
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                t = rm.RowMapping(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return t;
    }

    public static <T> int executeCount(String sql, Object... obj) {
        int a = 0;
        Connection conn = null;
        PreparedStatement pstmt = null;
        conn = getConnection();
        try {
            pstmt = conn.prepareStatement(sql);
            if (obj != null) {
                for (int i = 0; i < obj.length; i++) {
                    pstmt.setObject(i + 1, obj[i]);
                }
            }
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                a = rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return a;
    }
}
