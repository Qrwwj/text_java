<%--
  Created by IntelliJ IDEA.
  User: wwj
  Date: 2019/3/19
  Time: 17:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--action="dologin.do" 表示将请求发送给dologin.do做处理--%>
<form id="fm">
    用户名： <input type="text" name="username" id="uname"><br>
    密码: <input type="password" name="password"><br>
    <input type="button" value="登录" id="btn"> <a href="register.do">注册账号</a><br>
    <a href="forget.do?uname=" id="forget">忘记密码</a>
    <span id="message"></span>
</form>
<script src="static/js/jquery-3.3.1.min.js"></script>
<script>
   $(function () {
       $("#btn").click(function () {
           var totals=$("#fm").serialize();
           $.ajax({
               url:"dologin.do",
               type:"post",
               data:totals,
               async:false,
               success:function (result) {
                   if (result==1){
                       alert("请输入用户名！")
                       // $("#message").text("请输入用户名！")
                   } else if (result==2){
                       alert("用户不存在！")
                       // $("#message").text("用户不存在！")
                   } else if (result==3){
                       alert("账号或密码错误！")
                      uname=$("#uname").val()
                       $("#forget").attr("href","forget.do?uname="+uname)
                       // $("#message").text("账号或密码不存在！")
                   } else {
                       alert("登录成功")
                       window.location.href="http://localhost:8080/web318/list.do"
                   }
               }
           })
       })
   })
</script>
</body>
</html>
