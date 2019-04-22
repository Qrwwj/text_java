package com.text;


import java.sql.*;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public class Text_Jdbc {
    public static void main(String[] args) {
        try{
//            注册
            Class.forName("com.mysql.jdbc.Driver");

//            创建连接
            String url="jdbc:mysql://localhost:3306/wzry";
            String user="root";
            String passwore="1234";
            String que="select*from tb2";

//            获取数据库连接
            Connection coon=DriverManager.getConnection(url,user,passwore);

//            构造一个Statement对象来执行sql语句
            Statement st=coon.createStatement();
            ResultSet rs=st.executeQuery(que);

            while(rs.next()){
                System.out.println("id："+rs.getString("id")+
                        "类型："+rs.getString("pidname")+"数量："+rs.getString("pum"));
            }
            if(rs !=null){
                //关闭记录集
                rs.close();   //此处需要try-catch
            }
            //关闭声明的对象
            if(st !=null){
                st.close();    //此处需要try-catch
            }

        //关闭连接
        if(coon !=null){
            coon.close();   //此处需要try-catch
        }
    }catch(Exception e){
            e.printStackTrace();
        }
    }
}
