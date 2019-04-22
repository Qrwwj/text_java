<%--
  Created by IntelliJ IDEA.
  User: wwj
  Date: 2019/3/1
  Time: 19:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>修改</title>
</head>
<body>
<form method="post" action="doupdate.do">
    id:<input type="text" name="id" value="${user.id}" readonly="readonly"></br>
    用户名：<input type="text" name="uname" value="${user.uname}"/></br>
    密 码: <input type="password" name="password" value="${user.password}"/></br>
    phone: <input type="text" name="phone" value="${user.phone}"/></br>
    sex:<label>男：<input type="radio" value="1" name="sex" <c:if test="${user.sex==1}"> checked="checked"</c:if>> </label>
    <label>女：<input value="0" type="radio" name="sex" <c:if test="${user.sex==0}"> checked="checked"</c:if>> </label><br>
    <input type="submit" value="修改">
</form>

</body>
</html>
