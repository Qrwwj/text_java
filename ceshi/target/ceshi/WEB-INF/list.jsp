
<%--
  Created by IntelliJ IDEA.
  User: wwj
  Date: 2019/3/11
  Time: 21:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>首页</title>
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
<table>
    <thead>
    <tr>
        <th>id</th>
        <th>sname</th>
        <th>sage</th>
        <th>dept</th>
        <th>sex</th>
        <th>password</th>
        <th>action</th>
    </tr>
    <tbody>
    <c:forEach items="${list}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.sname}</td>
            <td>${user.sage}</td>
            <td>${user.dept}</td>
            <c:if test="${user.sex==1}">
                <td>男</td>
            </c:if>
            <c:if test="${user.sex==0}">
                <td>女</td>
            </c:if>
            <td>${user.password}</td>
            <td><a href="update.do?id=${user.id}">修改</a>&nbsp;|&nbsp;<a href="delete.do?id=${user.id}">删除</a></td>
        </tr>
    </c:forEach>
    </tbody>
    </thead>
</table>
</body>
</html>
