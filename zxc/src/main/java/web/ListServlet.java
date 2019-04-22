package web;

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
@WebServlet("/list.do")
@MultipartConfig
public class ListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/list.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//创建一个接收上传文件的类
        Part part=req.getPart("file");
        String count=part.getSubmittedFileName().substring(part.getSubmittedFileName().lastIndexOf("."));

//        判断
        if (!count.equals(".txt")){
            req.setAttribute("message","文件格式错误！");
            req.getRequestDispatcher("WEB-INF/page.jsp").forward(req,resp);
        }else {

            File file=new File("E:\\3.7\\"+part.getSubmittedFileName());
            InputStream is=req.getInputStream();
            FileOutputStream os=new FileOutputStream("file");
            byte arr[]=new byte[1024];
            int a=is.read(arr);
            if (a!=-1){
                os.write(arr);
                a=is.read(arr);
            }
            is.close();
            os.close();
            req.setAttribute("message","文件上传成功！");
            req.getRequestDispatcher("WEB-INF/page.jsp").forward(req,resp);

        }
    }
}
