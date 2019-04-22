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
//接收前端页面处理后的请求
@WebServlet("/doadd.do")
public class DoAddServlet extends HttpServlet {
    //    将接收到的数据放到数据库中
    private IUserService service = new UserServiceImpl();  //导入业务层

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        接收处理后的数据
        String uname = req.getParameter("uname");
        String password = req.getParameter("password");
        String phone = req.getParameter("phone");
        int sex = Integer.parseInt(req.getParameter("sex"));
        User user = new User();
        user.setPhone(phone);
        user.setPassword(password);
        user.setUname(uname);
        user.setSex(sex);
//        调用service层中的insert方法获取user对象 通过声明一个变量来表示发生变化的数量
        int result = service.insert(user);
//重定向 把数据在初始页面显示
        resp.sendRedirect("list.do");


    }
}
