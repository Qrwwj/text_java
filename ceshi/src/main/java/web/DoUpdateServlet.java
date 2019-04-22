package web;

import pojo.User;
import service.IUserService;
import service.UserServiceImpl;

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
    private IUserService service=new UserServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int id = Integer.parseInt(req.getParameter("id"));
        String sanme = req.getParameter("sname");
        String password = req.getParameter("password");
        int sage = Integer.parseInt(req.getParameter("sage"));
        String dept = req.getParameter("dept");
        int sex = Integer.parseInt(req.getParameter("sex"));

        User user = new User();
        user.setId(id);
        user.setPassword(password);
        user.setSex(sex);
        user.setDept(dept);
        user.setSage(sage);
        user.setSname(sanme);
        resp.sendRedirect("list.do");

    }
}
