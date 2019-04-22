<%--
  Created by IntelliJ IDEA.
  User: wwj
  Date: 2019/3/5
  Time: 18:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<form method="post" action="dologin.do">
    用户名：<input type="text" name="usname"><br>
    密码：  <input type="password" name="psw"><br>
    <input type="submit" value="登录">
    <%--点击登录  发送请求到指定页面action="dologin.do"--%>
</form>
</body>
</html>
