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
import java.util.List;


/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */

@WebServlet("/list.do")   //显示页面地址栏尾部  即接受信息的页面名
public class UserWeb extends HttpServlet {
    private IUserService service = new UserServiceImpl();

    @Override
    public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<User> lists = null;
        String text=req.getParameter("text");
        if (text==null){
            lists=service.getUsers();
        }else {
            lists=service.getUsers(text);
            for (User u:lists
                 ) {
                System.out.println(u);
            }
        }




        //        将获取的数据在页面上显示  转发

//        转fh发之前需要绑定值  （键，值） 将值放在req.setAttribute作用域上
        req.setAttribute("lists", lists);
//        通过 转发出去   通过req.getRequestDispatcher（）方法 设置转发的页面
        req.getRequestDispatcher("WEB-INF/list.jsp").forward(req, resp);


        }
    }

