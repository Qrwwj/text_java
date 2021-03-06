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
@WebServlet("/update.do")
public class UpdateServlet extends HttpServlet {
    private IUserService service = new UserServiceImpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//     获取数据
        int id = Integer.parseInt(req.getParameter("id"));
//      将需要修改的id对应的数据显示出来
        User user = service.getUsersById(id);
        if (user != null) {
            req.setAttribute("user", user);
            req.getRequestDispatcher("WEB-INF/update.jsp").forward(req, resp);
        }


    }
}
