package com.itdr.jdbc.text;


import java.sql.*;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public class Text {
    public static void main(String[] args) {

//        为了让外部资源进行访问  把变量拿出来
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
//        注册驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");

//         建立驱动
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wzry", "root", "1234");

//         创建对象
             st = con.createStatement();
//         执行sql语句
            String sql = "select*from tb2";
//            st.executeUpdate(sql);
//         处理结果
             rs = st.executeQuery(sql);
            while (rs.next()) {
                System.out.println("id:" + rs.getInt("id") + "pidname:" +
                        rs.getString("pidname") + "pum" +
                        rs.getInt("pum"));
            }
//         释放资源


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            try {
                if (st != null) {
                    st.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        try {
            if (con != null) {
                con.close();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
