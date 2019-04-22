<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: wwj
  Date: 2019/3/12
  Time: 8:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>删除</title>
</head>
<body>
<form method="post" action="doupdate.do">
    id:<input type="text" name="id" value="${user.id}" readonly="readonly"><br>
    用户名：<input type="text" name="sname" value="${user.sname}"><br>
    密码：<input type="text" name="password" value="${user.password}"><br>
    sage:<input type="text" name="sage" value="${user.sage}"><br>
    dept:<input type="text" name="dept" value="${user.dept}"><br>
    sex:<label>男：<input type="radio" value="1" name="sex" <c:if test="${user.sex==1}">checked="checked"</c:if>></label>
    <label>女：<input type="radio" value="0" name="sex" <c:if test="${user.sex==0}">checked="checked"></c:if>></label><br>
    <input type="submit" value="修改">
</form>
</body>
</html>
