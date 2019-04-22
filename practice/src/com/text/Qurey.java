package com.text;

import java.sql.*;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */


//查询数据 结果到这显示  倒序
public class Qurey {
    public static void main(String[] args) {

        Connection conn = getConnection("root", "1234");  //获取数据库连接

        qurey(conn);   //方法名调用数据库连接
        closeAll(conn); //释放数据库连接
    }

//    查询数据 定义qurey方法
    public static void qurey(Connection conn) {
        String sql = "select*from prop";
        try {
            Statement st = conn.createStatement(); //也可以使用PreparedStatement来做
            ResultSet rs = st.executeQuery(sql);  //执行sql语句并返还结束
            rs.afterLast();    //先跳转到最后一行
            while (rs.previous()) {    //遍历遍历结果集，向上一行
                System.out.println("名字：" + rs.getString("pname") + "价格:" + rs.getString("price") +
                        "攻击:" + rs.getString("adhurt"));

            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                if (st != null) {
                    try {
                        st.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    if (conn != null) {
                        try {
                            conn.close();
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


//    数据库连接
    public static Connection getConnection(String user, String password) {
        Connection conn = null;  //声明连接对象
        String driver = "com.mysql.jdbc.Driver";  //驱动程序类名
        String url = "jdbc:mysql://localhost:3306/wzry";  //数据库地址

        try {
            Class.forName(driver); //注册（加载）驱动程序
            conn = DriverManager.getConnection(url, user, password);  //获取数据库连接
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }


    //    释放数据库连接
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
