<%--
  Created by IntelliJ IDEA.
  User: 张兵鑫
  Date: 2019/3/31
  Time: 23:07
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
        <button type="button" class="button border-yellow" onclick="window.location.href='#add'"><span class="icon-plus-square-o"></span><a href="addaddress.do"> 添加地址</a></button>
    </div>
    <table class="table table-hover text-center">
        <tr>
            <th width="5%">ID</th>
            <th width="10%">名称</th>
            <th width="10%">ParentId</th>
        </tr>
        <c:forEach  items="${address}" var="address">
            <tr>
                <td>${address.id}</td>
                <td>${address.name}</td>
                <td>${address.parentId}</td>
                <td><div class="button-group"> <a class="button border-main" href="updateaddress.do?id=${address.id}"><span class="icon-edit"></span> 修改</a> <a class="button border-red" href="javascript:void(0)" id="del" onclick="del(${address.id})"><span class="icon-trash-o"></span> 删除</a> </div></td>
            </tr>
        </c:forEach>
    </table>
</div>
<script type="text/javascript">
    function del(id){
        if(confirm("您确定要删除吗?")){
            window.location.href="http://localhost:8080/swc/deleteaddress.do?id="+id+""
        }else {
            window.location.href="http://localhost:8080/swc/addresslist.do"
        }
    }
</script>
</div>
</body>
</html>
