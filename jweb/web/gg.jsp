<%--
  Created by IntelliJ IDEA.
  User: wwj
  Date: 2019/2/26
  Time: 14:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--jsp 就是一个servlet--%>
hello world
<%
    /*
    * 作用域
    * pageContext 只在当前页面
    * request 一次请求
    * session 一次会话
    * servletContext 服务器
    *
    * */
    pageContext.setAttribute("pageContext", "pageContext");
    request.setAttribute("request", "request");
    session.setAttribute("session","session");
    application.setAttribute("application","application");

//    request.getRequestDispatcher("h.jsp").forward(request, response);、
        response.sendRedirect("h.jsp");
%>
</body>
</html>
