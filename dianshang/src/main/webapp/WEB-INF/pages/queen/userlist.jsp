<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@include file="/staticFile.jsp"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="renderer" content="webkit">
    <title></title>
    <link rel="stylesheet" href="${staticfile}/css/pintuer.css">
    <link rel="stylesheet" href="${staticfile}/css/admin.css">
    <script src="${staticfile}/js/jquery.js"></script>
    <script src="${staticfile}/js/pintuer.js"></script>
    <script src="${staticfile}/js/jquery-3.3.1.min.js"></script>
</head>
<body>
<div class="panel admin-panel">

    <div class="panel-head"><strong class="icon-reorder"> 用户信息列表</strong></div>
    <div class="padding border-bottom">
    <div>
        <input value="${username}" type="text" placeholder="请输入搜索关键字" id="keywords" class="input"
               style="width:250px; line-height:17px;display:inline-block"/>
        <a id="search" class="button border-main icon-search"> 搜索</a>
    </div>
    </div>
    <table class="table table-hover text-center">
        <tr>
            <th width="5%">id</th>
            <th width="10%">账号</th>
            <th width="10%">密码</th>
            <th width="10%">邮箱</th>
            <th width="10%">电话</th>
            <th width="10%">问题</th>
            <th width="10%">答案</th>
            <th width="5%">权限</th>
            <th width="10%">修改时间</th>
            <th width="10%">操作</th>
        </tr>
        <c:forEach items="${users}" var="user">
            <tr>
                <td>${user.id}</td>
                <td>${user.username}</td>
                <td>${user.password}</td>
                <td>${user.email}</td>
                <td>${user.phone}</td>
                <td>${user.question}</td>
                <td>${user.answer}</td>
                <td>${user.role}</td>
                <td>${user.updateTime}</td>
                <td><div class="button-group"><a class="button border-red" href="javascript:void(0)" onclick="del(${user.id})"><span class="icon-trash-o"></span> 删除</a> </div></td>
            </tr>
        </c:forEach>
        <tr>
            <td colspan="8">
                <div class="pagelist">
                    <%--<span class="current">首页</span>--%>

                    <c:choose>
                        <c:when test="${pageInfo.pageNum==1}">
                            <a href="javascript:void(0)">首页</a>
                        </c:when>
                        <c:otherwise>
                            <a href="userlist.do?pageNum=${pageInfo.navigateFirstPage}">首页</a>
                        </c:otherwise>
                    </c:choose>

                    <c:choose>
                        <c:when test="${pageInfo.isFirstPage}">
                            <a href="javascript:void(0)">上一页</a>
                        </c:when>
                        <c:otherwise>
                            <a href="userlist.do?pageNum=${pageInfo.prePage}">上一页</a>
                        </c:otherwise>
                    </c:choose>
                    <c:forEach items="${pageInfo.navigatepageNums}" var="page">
                        <c:choose>
                            <c:when test="${pageInfo.pageNum==page}">
                                <span class="current">${page}</span>
                            </c:when>
                            <c:otherwise>
                                <a href="userlist.do?pageNum=${page}">${page}</a>
                            </c:otherwise>
                        </c:choose>
                    </c:forEach>
                    <c:choose>
                        <c:when test="${pageInfo.isLastPage}">
                            <a href="javascript:void(0)">下一页</a>
                        </c:when>
                        <c:otherwise>
                            <a href="userlist.do?pageNum=${pageInfo.nextPage}">下一页</a>
                        </c:otherwise>
                    </c:choose>
                    <c:choose>
                        <c:when test="${pageInfo.pageNum==pageInfo.pages}">
                            <a href="javascript:void(0)">尾页</a>
                        </c:when>
                        <c:otherwise>
                            <a href="userlist.do?pageNum=${pageInfo.navigateLastPage}">尾页</a>
                        </c:otherwise>
                    </c:choose>
                </div>
            </td>
        </tr>

    </table>
</div>
<script>
    function del(id){
        if(confirm("您确定要删除吗?")){
  window.location.href="http://localhost:8080/web325/userlist.do?id="+id
        }
    }

    /*搜索*/
    $(function () {
        $("#search").click(function () {

            window.location.href = "http://localhost:8080/web325/userlist.do?username=" + $("#keywords").val()
        })

    })
</script>

</body>
</html>