<%--
  Created by IntelliJ IDEA.
  User: wwj
  Date: 2019/3/19
  Time: 19:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--
注册 用Ajax注册   提高用户的体验度
--%>
<form id="fm">
    用户名:<input type="text" name="username" id="uname"><span id="tishi" style="color:red;">*</span><span id="mess"></span><br>
    密码:<input type="password" name="password"><span>*</span><br>
    邮箱:<input type="text" name="email" placeholder="6-9邮箱"><span style="color: red">*</span><br>
    电话:<input type="text" name="phone"><span>*</span><br>
    问题:<input type="text" name="question"><span>*</span><br>
    答案:<input type="text" name="answer"><span>*</span><br>
    <input type="button" value="注册" id="btn">
</form>
<script src="static/js/jquery-3.3.1.min.js"></script>
<script>
    $(function () {
        $("#uname").blur(function () {
            /*对象进行方法调用
            * 内置ajax对象 XMLHttpRequest
            * */
            $.ajax({
                url:"dousername.do",
                type:"post",
                data:{"uname":$("#uname").val()},
                success:function (result) {
                    if(result=="1"){
                        $("#mess").text("请输入用户名").css({"color":"red"});
                    }else if(result=="2"){
                        $("#mess").text("可以注册").css({"color":"green"});
                        $("#tishi").removeAttr("style").text("")
                    }else if(result=="3")  {
                        $("#mess").text("用户已存在").css({"color":"red"});
                    }
                }
            });
        });
        $("#btn").click(function () {
            /*获取表单中的输入值
            * 通过ajax进行注册功能
            *
            * */
            var totals=$("#fm").serialize();
            console.log(totals)
            $.ajax({
                url:"doregister.do",
                type:"post",
                data:totals,
                success:function (result) {
                    if(result=="1"){
                        alert("注册成功")
                        window.location.href="http://localhost:8080/web318/login.do";
                    }
                }

            });
        });
    });
</script>
</body>
</html>
