package com.web;

import com.pojo.User;
import com.service.IUserService;
import com.service.UserServiceImpl;

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
@WebServlet("/doupdate.do")
public class DoUpdateServlet extends HttpServlet {
    private IUserService service = new UserServiceImpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String uname = req.getParameter("uname");
        String password = req.getParameter("password");
        String phone = req.getParameter("phone");
        int id = Integer.parseInt(req.getParameter("id"));
        int sex = Integer.parseInt(req.getParameter("sex"));

        User user = new User();
        user.setUname(uname);
        user.setPassword(password);
        user.setPhone(phone);
        user.setSex(sex);
        user.setId(id);
        service.update(user);
        resp.sendRedirect("list.do");
    }
}
