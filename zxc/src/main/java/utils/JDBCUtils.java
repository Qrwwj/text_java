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
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/student?userUnicode=ture&characterEncoding=utf8";
    private static final String USER = "root";
    private static final String PSW = "1234";

    //    执行注册驱动的方法体
    static {
        try {
            //    注册驱动
            new com.mysql.jdbc.Driver();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //    声明一个连接数据库的方法
    private static Connection getconnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PSW);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    //声明关闭数据库释放资源的方法
    private static void close(ResultSet rs, PreparedStatement pre, Connection conn) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (pre != null) {
            try {
                pre.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.commit();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    //    声明增删改的方法
    private static int executeUpdate(String sql, Object... obj) {
//        声明一个变量记录发生变化的行数
        int count = 0;
//       获取连接  这里的getconnection与上边连接数据库方法的方法名相同
        Connection conn = getconnection();

        PreparedStatement pre = null;
        try {
            pre = conn.prepareStatement(sql);
//            这里需要判断？ "？"的个数从1开始  数组下标从零开始 所以这里i+1表示第一个？
            if (obj != null) {
                for (int i = 0; i < obj.length; i++) {
                    pre.setObject(i + 1, obj[i]);
                }
            }
            count = pre.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(null, pre, conn);
        }
        return count;
    }

    //    声明查询数据的方法
    private static <T> List<T> executeQuery(String sql, RowMap<T> rm, Object... obj) {
//   创建list对象
        List<T> list = new ArrayList<>();
//        获取数据库连接
        Connection conn = getconnection();
//      从这里开始不明白
        PreparedStatement pre = null;
        ResultSet rs = null;

        try {
            pre = conn.prepareStatement(sql);
            //        判断"？"  即操作数据
            if (obj != null) {
                for (int i = 0; i < obj.length; i++) {
                    pre.setObject(i + 1, obj[i]);
                }
            }
            rs = pre.executeQuery();
            while (rs.next()) {
                T t = rm.RowMapping(rs);
                list.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(rs, pre, conn);
        }
        return list;
    }

    //    声明查询一条数据的方法
    public static <T> T executeOne(String sql, RowMap<T> rowMap, Object... objects) {
        T t = null;
//        获取数据库连接
        Connection conn = getconnection();
        PreparedStatement pre = null;
        try {
            pre = conn.prepareStatement(sql);
            if (objects != null) {
                for (int i = 0; i < objects.length; i++) {
                    pre.setObject(i + 1, objects[i]);
                }
                ResultSet rs = pre.executeQuery();
                while (rs.next()) {
                    t = rowMap.RowMapping(rs);

                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return t;
    }
}
