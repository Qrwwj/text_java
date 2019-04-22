package com.web;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
@WebServlet("/upload.do")
@MultipartConfig
public class UpLoadServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/upload.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        获取文件名称   Parameter接收参数
//        System.out.println(req.getParameter("file"));

//  part在servlet中做文件接收的类
        Part part = req.getPart("file");
//    获取 <input type="file" name="file"> 中的name
        System.out.println(part.getName());
//         获取上传文件名
        System.out.println(part.getSubmittedFileName());

        //        判断接收到的文件   .lastIndexOf(".") 将最后一个点出现的下标打印出来
        String filesuf=part.getSubmittedFileName().substring(part.getSubmittedFileName().lastIndexOf("."));
//        判断接收到的文件
        if (!filesuf.equals(".jpg")&&!filesuf.equals(".png")){
            req.setAttribute("massage","格式不正确！");
            req.getRequestDispatcher("WEB-INF/page.jsp").forward(req,resp);

        }else {
            //        将文件存储在文件夹中
            File file = new File("E:\\3.6\\" + part.getSubmittedFileName());
//        获取字节流
            InputStream is = part.getInputStream();
//        创建一个输出流
            FileOutputStream os = new FileOutputStream(file);
//        把接受到的字节流存放在数组中  1k=1024
            byte[] b = new byte[1024];
//        把传上的来的字节流读出来   定义一个变量记录读取数据的次数
            int count = is.read(b);  //读取的初始值
//        读完文件后需要关闭 通过循环判断什么时候关闭   循环
            while (count != -1) {
                os.write(b);
//            更新初始值
                count = is.read(b);
            }
//        关闭流
            os.close();
            is.close();
            req.setAttribute("massage","上传成功！");
            req.getRequestDispatcher("WEB-INF/page.jsp").forward(req,resp);

        }
        }


}
