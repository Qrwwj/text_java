package com.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
//通过访问页面地址尾 /login.do 访问jsp页面
@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        转发请求 并跳转到指定jsp页面"WEB-INF/login.jsp"
        req.getRequestDispatcher("WEB-INF/login.jsp").forward(req,resp);
    }
}
