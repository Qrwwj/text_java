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
    <div class="panel-head"><strong class="icon-reorder"> 商品分类</strong></div>
    <div class="padding border-bottom">
        <button type="button" class="button border-yellow" onclick="window.location.href='addhandle.do'"><span class="icon-plus-square-o"></span> 添加分类</button>
    </div>
    <table class="table table-hover text-center">
        <tr>
            <th width="10%">id</th>
            <th width="10%">分类</th>
            <th width="10%">类别</th>
            <th width="20%">状态</th>
            <th width="10%">级别</th>
            <th width="10%">添加时间</th>
            <th width="10%">修改时间</th>
            <th width="15%">操作</th>
        </tr>
        <c:forEach items="${handles}" var="handles">
            <tr>
                <td>${handles.id}</td>
                <td>${handles.name}</td>
                <td>${handles.parent_id}</td>
                <td>${handles.status}</td>
                <td>${handles.sort_order}</td>
                <td>${handles.create_time}</td>
                <td>${handles.update_time}</td>
                <td><div class="button-group">
                    <button type="submit" name="修改" class="button border-main" onclick="window.location.href='updatehandle.do?id='+${handles.id}"><span class="icon-edit"></span> 修改</button>
                    <%--<a class="button border-red" href="javascript:void(0)" onclick="del(${handles.id})"><span class="icon-trash-o"></span> 删除</a>--%>
                </div></td>
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
                            <a href="handlelist.do?pageNum=${pageInfo.navigateFirstPage}">首页</a>
                        </c:otherwise>
                    </c:choose>

                    <c:choose>
                        <c:when test="${pageInfo.isFirstPage}">
                            <a href="javascript:void(0)">上一页</a>
                        </c:when>
                        <c:otherwise>
                            <a href="handlelist.do?pageNum=${pageInfo.prePage}">上一页</a>
                        </c:otherwise>
                    </c:choose>
                    <c:forEach items="${pageInfo.navigatepageNums}" var="page">
                        <c:choose>
                            <c:when test="${pageInfo.pageNum==page}">
                                <span class="current">${page}</span>
                            </c:when>
                            <c:otherwise>
                                <a href="handlelist.do?pageNum=${page}">${page}</a>
                            </c:otherwise>
                        </c:choose>
                    </c:forEach>
                    <c:choose>
                        <c:when test="${pageInfo.isLastPage}">
                            <a href="javascript:void(0)">下一页</a>
                        </c:when>
                        <c:otherwise>
                            <a href="handlelist.do?pageNum=${pageInfo.nextPage}">下一页</a>
                        </c:otherwise>
                    </c:choose>
                    <c:choose>
                        <c:when test="${pageInfo.pageNum==pageInfo.pages}">
                            <a href="javascript:void(0)">尾页</a>
                        </c:when>
                        <c:otherwise>
                            <a href="handlelist.do?pageNum=${pageInfo.navigateLastPage}">尾页</a>
                        </c:otherwise>
                    </c:choose>
                </div>
            </td>
        </tr>
    </table>
</div>
<%--<script>--%>
    <%--function del(id){--%>
        <%--if(confirm("您确定要删除吗?")){--%>
            <%--window.location.href= "http://localhost:8080/web325/handlelist.do?id="+id--%>
        <%--}--%>
    <%--}--%>
<%--</script>--%>
</body></html>
