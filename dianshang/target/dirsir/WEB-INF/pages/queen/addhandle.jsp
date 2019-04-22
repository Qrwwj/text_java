<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@include file="/staticFile.jsp"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zh-cn">
<head>w
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
<div class="panel admin-panel margin-top" id="add">
    <div class="panel-head"><strong><span class="icon-pencil-square-o"></span> 添加分类</strong></div>
    <div class="body-content">
        <form method="post" class="form-x" action="dohandle.do">
            <div class="form-group">
                <div class="label">
                    <label>添加分类：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w50" name="name" data-validate="required:请输入分类" />
                    <div class="tips"></div>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>所属品类：</label>
                </div>
                <div class="field">
                    <select name="parent_id" class="input w50">
                        <option value="">--请选择--</option>
                        <c:forEach items="${handles}" var="handle">
                            <option value="${handle.id}">${handle.name}</option>
                        </c:forEach>
                    </select>
                    <div class="tips">不选择上级分类默认为一级分类</div>
                </div>
            </div>

            <div class="form-group">
                <div class="label">
                    <label>状态：</label>
                </div>
                <div class="field">
                    <select name="status" class="input w50">
                        <option value="">--请选择--</option>
                        <option value="1">上架</option>
                        <option value="0">下架</option>
                    </select>
                    <div class="tips"></div>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>级别：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w50" name="sort_order"  data-validate="required:,number:排序必须为数字" />
                    <div class="tips"></div>
                </div>
            </div>
            <div class="form-group">
                <div class="field">
                    <button class="button bg-main icon-check-square-o" type="submit"> 提交</button>
                </div>
            </div>
        </form>
    </div>
</div>
</body>
</html>