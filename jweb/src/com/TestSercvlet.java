package com;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */


/*
 * servlet 生命周期
 * 创建一个类继承 HttpServlet       
 * init    初始化
 * service  入口
 * destroy
 *
 * */
public class TestSercvlet extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws SecurityException {
        System.out.println("init"); //初始化 第一次的时候执行  随后不会打印  初始化的是本类中的对象  （单列模式--一个类只有一个对象）
//        System.out.println(config.getServletName());    //标签中server name 的名字
//        System.out.println(config.getInitParameter("a"));

        /*
        * 服务器已启动就创建对象
        * 配置文件中加  <load-on-startup></load-on-startup>  设置优先级 数越小优先级越高
        * */

    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        request ----请求对象----从浏览器带过来的信息
//        response----响应对象----从服务器响应到浏览器的信息---流

//        后台
//        String str = "Hello world";  //当内容为中文时 需要设置编码集（两种形式// ）
////        resp.setCharacterEncoding("utf-8");  或者  resp.setContentType("text/html;charset=utf-8")
//        PrintWriter writer = resp.getWriter();
////        writer.print(str);
//        writer.print("<div style='width:100px;height:100px;border:solid 1px #000'>123</div>");  //显示一个标签
//
//        System.out.println(req.getContextPath());   //获取文件名
//        System.out.println(req.getScheme());        //获取地址前缀名 http
//        System.out.println(req.getServerName());    //获取服务器名称
//        System.out.println(req.getServerPort());    //获取本地端口号    如果是80的话全路径不用写端口号
////        获取全路径
//        System.out.println(req.getScheme() + "://" + req.getServerName() + ":" + req.getServerPort() + req.getContextPath());
//        System.out.println(req.getRequestURI());  //查看地址后缀（后两位）
//        System.out.println(req.getRequestURL());  //查看全地址 包括自己设置的
//        System.out.println(req.getCharacterEncoding());   //查看页面编码集
////-----------------------------------------------------------
//        System.out.println(resp.getCharacterEncoding());   //Response编码集
//        System.out.println(resp.getContentType());           //Response编码集

//        ---------------------------------------------------------------

        /*
         * jsp ----页面显示 jsp自动拼接
         *
         * */
//servlet-----逻辑处理          jsp--------显示页面
//        接收前台参数  实现页面跳转

        /*
        * 重定向  重新找到页面去显示
        * 重定向后 地址栏的地址会发生变化
        * 相当于发送两次请求     会有两个request和response对象
        * 相当于浏览器的行为
        * 重定向 可以重定向到外网
        * response 进行的响应
        * 重定向 定向的是地址
        *
        * */
//
//        resp.sendRedirect("http://www.baidu.com");
//        resp.sendRedirect("gg.jsp");

//        String str="hello world";   //不能用流传递  因为会覆盖原页面中的内容
        /*
        * 转发-----获取转发器   把request和response对象转交给jsp
        * 相当于一次请求
        * request行为
        * 地址栏上的地址不会发生改变
        * 转发 只能在项目内
        * 转发 转发的是文件
        *
        * */
//        req.setAttribute("key",str);
////        获取转发器 跳转页面
//        req.getRequestDispatcher("gg.jsp").forward(req,resp);

    }

}
