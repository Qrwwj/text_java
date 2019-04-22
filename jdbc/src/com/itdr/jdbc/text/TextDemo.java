package com.itdr.jdbc.text;

import com.itdr.jdbc.utils.JDBCUTIL1;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.*;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public class TextDemo {
    @Test
    public void text() {

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

@Test
 public void jdbcText1(){

//        创建对象
    try {
        Connection con=JDBCUTIL1.getconn();
        String sql="insert into tab2 values(null,'辅助',25)";
       PreparedStatement ps= con.prepareStatement(sql);
       int row=ps.executeUpdate();
        System.out.println("成功插入"+row+"行");
        JDBCUTIL1.closeAll(con,ps);
    } catch (Exception e) {
        e.printStackTrace();
    }

}
}


