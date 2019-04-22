package com.text;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */

//插入数据
public class Insert {
    public static void main(String[] args) {
        Connection conn = getConnection("root", "1234");  //获取数据库连接
        insert(conn);
        closeAll(conn); //释放数据库连接
    }


//    插入数据的方法
    public static void insert(Connection conn){

        try {
            String sql="insert into tb2(id,pidname,pum)"+"values(null,'打野','20')";
            Statement stm=conn.createStatement();
            int count=stm.executeUpdate(sql);
            System.out.println("向表中插入了"+count+"条数据");
            conn.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }


//    数据连接
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
