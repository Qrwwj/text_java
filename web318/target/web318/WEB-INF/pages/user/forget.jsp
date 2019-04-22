<%--
  Created by IntelliJ IDEA.
  User: wwj
  Date: 2019/3/19
  Time: 20:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<form action="doForget.do" method="post">
    用户名：<input type="text" name="username" value="${user.username}" readonly="readonly"><br>
    问题：<input type="text" name="question" value="${user.question}" readonly="readonly"><br>
    答案：<input type="text" name="answer" ><br>
    <input type="submit" value="修改">
    ${message}

</form>--%>
<%--js 引入 路径   全路径--%>
<form id="fm">
    用户名：<input type="text" name="username" value="${user.username}" id="username" readonly="readonly"><br>
    问题：<input type="text" name="question" value="${user.question}" readonly="readonly"><br>
    答案：<input type="text" name="answer" ><br>
    <input type="button" value="修改" id="btn">
    <span id="message"></span>
</form>
<script src="static/js/jquery-3.3.1.min.js"></script>
<script>
    $(function () {
        $("#btn").click(function () {
            var totals = $("#fm").serialize();
            $.ajax({
                url:"doforget.do",
                type:"post",
                data:totals,
                success:function (result) {
                    if(result=="1"){
                        $("#message").text("输入有误")
                    }else  if(result=="2"){
                        $("#message").text("问题不一致")
                    }else if(result=="3"){
                        $("#message").text("答案错误")
                    }else{
                        alert("问题正确 请修改密码")
                        console.log($("#username").val())
                        window.location.href="http://localhost:8080/web318/updatepassword.do?username="+$("#username").val();

                        // window.location.href="http://localhost:8080/web318/updatepassword.do?username="+$("#username").val()
                    }
                }
            })
        })
    })
</script>
</body>
</html>
