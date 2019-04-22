package com.web;

import com.pojo.User;
import com.service.IUserService;
import com.service.UserServiceImpl;

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
@WebServlet("/dologin.do")
public class DoLoginServlet extends HttpServlet {
    private IUserService service = new UserServiceImpl();  //连接逻辑处理层

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//       将账号密码存储起来
        String usname = req.getParameter("usname");
        String psw = req.getParameter("psw");
//通过创建对象调用逻辑处理层中的方法
        User user = service.getUserByUsername(usname, psw);
        Cookie cookie = new Cookie("uaname", user.getUname());
        cookie.setMaxAge(60 * 60 * 24 * 7);
        Cookie cookie1 = new Cookie("pword", user.getPassword());
        cookie.setMaxAge(60 * 60 * 24 * 7);
        resp.addCookie(cookie);
        resp.addCookie(cookie1);
        resp.sendRedirect("list.do");

    }
}
