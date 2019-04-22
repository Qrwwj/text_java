<%--
  Created by IntelliJ IDEA.
  User: wwj
  Date: 2019/3/22
  Time: 22:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="doupdatepassword.do">
    用户名：<input type="text" name="username" value="${user.username}" id="username" readonly="readonly"><br>
    新密码：<input type="password" name="password"><br>
    输入密码：<input type="password" name="psd"><br>
    <input type="submit" value="修改" >
    ${message}
</form>

</body>
</html>
