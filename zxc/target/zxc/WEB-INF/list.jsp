<%--
  Created by IntelliJ IDEA.
  User: wwj
  Date: 2019/3/7
  Time: 19:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>

<form method="post" action="list.do" enctype="multipart/form-data">
    <input type="file" name="file"><br>
    <input type="submit" value="上传">
</form>
</body>
</html>
