package com.utils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCUtil {
    private static final String URL="jdbc:mysql://127.0.0.1:3306/shopping?useUnicode=true&characterEncoding=utf8";
    private static final String USER="root";
    private static final String PSW = "1234";
    /*加载驱动 因为 只需要加载一次 static{}*/
    static{
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    /*连接*/
    public static Connection getConnection(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL,USER,PSW);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
    //public static int delete(){
    //int result=0;
    //Connection conn = getConnection();
    //String sql = "delete from brand where id=?";
    //try {
    //PreparedStatement pstmt = conn.prepareStatement(sql);
    //pstmt.setInt(1,2);
//            result= pstmt.executeUpdate();
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return result;
    //}
    public static int executeUpdate(String sql,Object... objs){
        int result=0;
        Connection conn = getConnection();
        PreparedStatement pstmt=null;
        try {
            pstmt = conn.prepareStatement(sql);
            if(objs!=null){
                for(int i=0;i<objs.length;i++){
                    pstmt.setObject(i+1,objs[i]);
                }
            }
            result= pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(null,pstmt,conn);
        }
        return result;
    }

    public static <T> List<T> executeQuery(String sql, RowMap<T> rowMap, Object... objs){
        List<T> lists = new ArrayList<>();
        Connection conn = getConnection();
        PreparedStatement pstmt=null;
        ResultSet rs = null;
        try {
            pstmt = conn.prepareStatement(sql);
            if(objs!=null){
                for(int i=0;i<objs.length;i++){
                    pstmt.setObject(i+1,objs[i]);
                }
            }
            rs= pstmt.executeQuery();
            while (rs.next()){
                T t = rowMap.RowMapping(rs);
                lists.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(rs,pstmt,conn);
        }
        return lists;
    }
    public static <T> T QueryOne(String sql, RowMap<T> rowMap, Object... objs){
        T t = null;
        Connection conn = getConnection();
        PreparedStatement pstmt=null;
        ResultSet rs = null;
        try {
            pstmt = conn.prepareStatement(sql);
            if(objs!=null){
                for(int i=0;i<objs.length;i++){
                    pstmt.setObject(i+1,objs[i]);
                }
            }
            rs= pstmt.executeQuery();
            while (rs.next()){
                t = rowMap.RowMapping(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(rs,pstmt,conn);
        }
        return t;
    }
    public static int queryCount(String sql, Object... objs){
        int result =0;
        Connection conn = getConnection();
        PreparedStatement pstmt=null;
        ResultSet rs = null;
        try {
            pstmt = conn.prepareStatement(sql);
            if(objs!=null){
                for(int i=0;i<objs.length;i++){
                    pstmt.setObject(i+1,objs[i]);
                }
            }
            rs= pstmt.executeQuery();
            while (rs.next()){
               result= rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(rs,pstmt,conn);
        }
        return result;
    }

    public static void close(ResultSet rs,PreparedStatement pstmt,Connection conn){

        try {
            if(rs!=null) {
                rs.close();
            }
            if(pstmt!=null){
                pstmt.close();
            }
            if(conn!=null){
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
