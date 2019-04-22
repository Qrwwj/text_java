package com.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
@WebServlet("/getcookie.do")
public class GetCookiesServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        通过req获取存储在页面的信息存贮到数组中
        Cookie[] cookies = req.getCookies();
        Map<String, Cookie> maps = getcookie(cookies);
        if (maps.containsKey("uname")) {
            Cookie c = maps.get("uname");
            if (c.getValue().equals("root")) {
                resp.sendRedirect("list.do");

            } else {
                resp.sendRedirect("login.do");
            }
        }

        if (cookies == null) {
            resp.sendRedirect("login.do");
        }

//        通过循环遍历数组中的信息输出出来
//        for (Cookie c:cookies
//             ) {
//            System.out.println(c.getName());
//            System.out.println(c.getValue());
//        }


    }

    //    声明一个方法  把cookie数组 转成map集合 可以根据cookie的key找到cookie信息
    public static Map<String, Cookie> getcookie(Cookie[] cookies) {
        Map<String, Cookie> maps = new HashMap<>();
        if (cookies != null) {
            for (Cookie c : cookies
                    ) {
                maps.put(c.getName(), c);
            }
        }
        return maps;
    }

    }
