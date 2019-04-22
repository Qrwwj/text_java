package com.text;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public class Delete {
    public static void main(String[] args) {

//        获取数据连接
        Connection conn=getConnection("root","1234");
//        调用删除数据的方法
        delete(conn);
//        释放数据库连接
        closeAll(conn);
    }

//    声明一个删除数据的方法
public static void delete(Connection conn){
//        确定要删除数据的位置
        String sql="delete from tb2 where id=6";
        try {
            Statement st=conn.createStatement();
            int count=st.executeUpdate(sql);
            System.out.println("从表中删除了"+count+"条数据");

//            判断语句 判断数据是否为空 不是 关闭数据库连接 是程序继续执行

            if (st !=null){
                st.close();
            }
        }catch (SQLException e){
            e.getErrorCode();
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
