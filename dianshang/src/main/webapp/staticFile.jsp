<%--
  Created by IntelliJ IDEA.
  User: wwj
  Date: 2019/3/26
  Time: 20:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%--绝对路径--%>
<%
    String staticfil="http://localhost:8080/web325/static";
    pageContext.setAttribute("staticfile",staticfil);
%>
<%--地址栏--%>
<%
    String path="";
    if (request.getServerPort()==80){
        path=request.getScheme()+"://"+request.getServerName()+request.getContextPath();
    }else {
        path=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath();
    }
     pageContext.setAttribute("path",path);
%>