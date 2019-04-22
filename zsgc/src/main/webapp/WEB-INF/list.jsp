<%--
  Created by IntelliJ IDEA.
  User: wwj
  Date: 2019/3/14
  Time: 22:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>数据展示</title>
</head>
<style>

</style>
<body>
<table>
    <thead>
    <tr>
        <th>num</th>
        <th>name</th>
        <th>sex</th>
        <th>age</th>
        <th>password</th>
        <th>date</th>
    </tr>
    </thead>
</table>
<tbady>
    <c:forEach items="${list}" var="user">
    <tr>
        <td>${user.num}</td>
        <td>${user.name}</td>
        <c:if test="${user.sex=1}">
            <td>男</td>
        </c:if>
        <c:if test="${user.sex=0}">
            <td>女</td>
        </c:if>
        <td>age</td>
        <td>password</td>
        <td>date</td>
    </tr>
    </c:forEach>
</tbady>
</body>
</html>