package com.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
@WebServlet("/cookie.do")
public class CookieServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        创建一个cookie对象   （"a"---名称,"cookietest"--内容）--相当于键值对  String类型的
        Cookie cookie=new Cookie("a","cookietest");
        //        设置cookie存储时间---持久存储 存在硬盘中   时间小于零存储在浏览器中（默认）
        cookie.setMaxAge(60*60*24*7);
//        将这个对象响应到浏览器上 （浏览器默认时间 浏览器关闭）
        resp.addCookie(cookie);

    }
}
