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
//接收前端页面传过来的请求，并进行处理
@WebServlet("/add.do")
public class AddServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
//通过转发来实现页面的跳转  "WEB-INF/add.jsp"---页面跳转地址
        req.getRequestDispatcher("WEB-INF/add.jsp").forward(req, resp);
    }
}
