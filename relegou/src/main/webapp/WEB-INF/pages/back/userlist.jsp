<%--
  Created by IntelliJ IDEA.
  User: 张兵鑫
  Date: 2019/3/29
  Time: 19:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="renderer" content="webkit">
    <title></title>
    <link rel="stylesheet" href="static/css/pintuer.css">
    <link rel="stylesheet" href="static/css/admin.css">
    <script src="static/js/jquery-3.3.1.min.js"></script>
    <script src="static/js/pintuer.js"></script>
</head>
<body>
<div class="panel admin-panel">
    <div class="panel-head"><strong class="icon-reorder"> 用户列表</strong></div>
    <div class="padding border-bottom">
        <button type="button" class="button border-yellow" onclick="window.location.href='#add'"><span class="icon-plus-square-o"></span><a href="adduser.do"> 添加用户</a></button>
    </div>
    <table class="table table-hover text-center">
        <tr>
            <th width="5%">ID</th>
            <th width="10%">名称</th>
            <th width="10%">密码</th>
            <th width="10%">邮箱</th>
            <th width="10%">电话</th>
            <th width="10%">问题</th>
            <th width="10%">答案</th>
            <th width="10%">权限</th>
            <th width="15%">操作</th>
        </tr>
        <c:forEach  items="${user}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.username}</td>
            <td>${user.password}</td>
            <td>${user.email}</td>
            <td>${user.phone}</td>
            <td>${user.question}</td>
            <td>${user.answer}</td>
            <td>${user.role}</td>
            <td><div class="button-group"> <a class="button border-main" href="update.do?id=${user.id}"><span class="icon-edit"></span> 修改</a> <a class="button border-red" href="javascript:void(0)" id="del" onclick="del(${user.id})"><span class="icon-trash-o"></span> 删除</a> </div></td>
        </tr>
        </c:forEach>
    </table>
</div>
<script type="text/javascript">
    function del(id){
        if(confirm("您确定要删除吗?")){
            window.location.href="http://localhost:8080/swc/delete.do?id="+id+""
        }else {
            window.location.href="http://localhost:8080/swc/userlist.do"
        }
    }
</script>
</div>
</body>
</html>
