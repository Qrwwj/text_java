<%--
  Created by IntelliJ IDEA.
  User: 张兵鑫
  Date: 2019/3/30
  Time: 21:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <style>
        input{
            width: 100px;
            height: 20px;
            margin-top: 20px;
        }
    </style>
</head>
<body>
<form method="post" action="doupdateproduct.do">
    <input type="hidden" name="id" value="${product.id}"><br>
    编号：<input type="text" name="handleId" value="${product.handleId}"><br>
    名称：<input type="text" name="name" value="${product.name}"><br>
    标题：<input type="text" name="subtitle" value="${product.subtitle}"><br>
    图片：<input type="text" name="mainImage" value="${product.mainImage}"><br>
    细节：<input type="text" name="detail" value="${product.detail}"><br>
    价钱：<input type="text" name="price" value="${product.price}"><br>
    库存：<input type="text" name="stock" value="${product.stock}"><br>
    状态：<input type="text" name="status" value="${product.status}"><br>
    <%--日期：<input type="text" name="updateTime" value="${product.updateTime}"><br>--%>
    <input type="submit" value="修改"><br>
</form>
</body>
</html>
