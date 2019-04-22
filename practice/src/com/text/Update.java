package com.text;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public class Update {
    public static void main(String []args) {

//        获取数据库连接
        Connection conn = getConnection("root", "1234");
//        调用更新数据库数据的方法
        update(conn);
//        释放数据库连接
        closeAll(conn);
    }

    //    声明一个方法用来更新数据库中的数据
    public static void update(Connection conn) {
//        更新数据的语句   string sql="update 表名 set 列名=数值 where 条件"
        String sql = "update tb3 set price=2300 where id=10";


//        创建Statement 对象
        try {
            Statement st = conn.createStatement();
            int a = st.executeUpdate(sql);   //执行sql语句
            System.out.println("成功修改" + a + "条语句");
//            判断运行结果是否为空  不为空关闭数据库连接

            if (st != null) {
                st.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //    声明一个方法连接数据库
    public static Connection getConnection(String user, String password) {

//        声明连接对象
        Connection conn = null;
//        声明一个变量接收驱动程序类名
        String driver = "com.mysql.jdbc.Driver";
//        创建连接
        String url = "jdbc:mysql://localhost:3306/wzry";

        try {
            Class.forName(driver); //注册驱动
//            获取数据库连接
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    //    声明一个方法释放数据库连接
    public static void closeAll(Connection conn) {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
