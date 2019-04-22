<%--
  Created by IntelliJ IDEA.
  User: wwj
  Date: 2019/3/1
  Time: 12:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加</title>
</head>
<body>
<%--action---处理后的地址即 操作完成后跳转的地址 method="post"---防止信息在地址栏显示--%>
<form method="post" action="doadd.do">
    <%--不同type 类型不一样--%>
    用户名:<input type="text" name="uname" /><br>
    密码:<input type="password" name="password" /><br>
    phone:<input type="text" name="phone" /><br>
    sex:<label>男：<input type="radio" value="1" name="sex"> </label>  <label>女：<input value="0" type="radio" name="sex"> </label><br>
    <input type="submit" value="添加">
    <%--点击添加后 跳转到action="doadd.do" 规定的页面--%>
</form>
</body>
</html>
