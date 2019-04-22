package com.text;

import java.sql.*;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public class TransCash {
    public static void main(String[] args) {

        Connection conn = getConnection("root", "1234");  //获取数据库连接

        tranCash(conn);   //方法名调用数据库连接
        closeAll(conn); //释放数据库连接
    }

//  转账
    public static void tranCash(Connection conn){
        Statement st=null;
        try {
            conn.setAutoCommit(false);  //关闭自动提交
            String sql="update tb3 set price=2100 where id=5";
            st=conn.createStatement();
            st.executeUpdate(sql);
            sql="update tb3 set price=2300 where id=6";
            st.executeUpdate(sql);  //执行上面两条语句  价格会调换
            conn.commit();  //提交事务
            System.out.println("价格发生改变！");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if (st!=null){
                    st.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
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
