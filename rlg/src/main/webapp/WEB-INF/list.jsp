<%@ page import="java.util.List" %>
<%@ page import="com.pojo.User" %><%--
  Created by IntelliJ IDEA.
  User: wwj
  Date: 2019/2/28
  Time: 20:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>商城</title>
</head>
<style>

    tr, td, th, thead, tbody, table {
        border: solid 1px black;
        padding: 10px 5px;
        border-collapse: collapse;
    }
    ul{
      list-style: none;
    }
    ul li{
        border: solid 1px #000000;
        width: 50px;
        height: 20px;
        float: left;
        text-align: center;
        line-height: 20px;

    }
    ul li a{
        text-decoration: none; /* //去下划线*/
        color: red;   /* 字体颜色*/
        display: block;   /* 设置鼠标悬停*/
    }
</style>
<body>
<ul>
    <li><a>上一页</a></li>
    <li><a href="list.do?pagenum=1">首页</a></li>
    <li><a>1</a></li>
    <li><a>2</a></li>
    <li><a>3</a></li>
    <li><a>4</a></li>
    <li><a>5</a></li>
    <li><a>尾页</a></li>
    <li><a>下一页</a></li>
</ul>
<form method="post" action="">
    <input type="text" name="text" value=""><input type="submit" value="搜索">
</form>
<%--向后台发送添加数据的请求 --%>
<a href="add.do">添加</a>

<table>
    <thead>
    <tr>
        <th>id</th>
        <th>uname</th>
        <th>password</th>
        <th>phone</th>
        <th>sex</th>
        <th>action</th>

    </tr>
    </thead>
    <tbody>
    <c:forEach items="${lists}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.uname}</td>
            <td>${user.password}</td>
            <td>${user.phone}</td>
                <%--类似if--%>
            <c:if test="${user.sex==1}">
                <td>男</td>
            </c:if>
            <c:if test="${user.sex==0}">
                <td>女</td>
            </c:if>
                <%--类似if else--%>
                <%--<c:choose>--%>
                <%--<c:when test="${user.sex==0}">--%>
                <%--<td>女</td>--%>
                <%--</c:when>--%>
                <%--<c:otherwise>--%>
                <%--<td>男</td>--%>
                <%--</c:otherwise>--%>
                <%--</c:choose>--%>

            <td><a href="update.do?id=${user.id}">修改</a>&nbsp;|&nbsp;<a href="delete.do?id=${user.id}">删除</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>


</body>
</html>
