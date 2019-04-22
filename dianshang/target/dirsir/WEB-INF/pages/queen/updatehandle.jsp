<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@include file="/staticFile.jsp" %>

<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
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
    <div class="panel-head"><strong><span class="icon-pencil-square-o"></span> 增加内容</strong></div>
    <div class="body-content">
        <form method="post" class="form-x" action="update.do">
            <input type="text" name="id" value="${handles.id}" style="display: none">
            <div class="form-group">
                <div class="label">
                    <label>分类名称：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w50" name="name" value="${handles.name}"/>
                    <div class="tips"></div>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>分类ID：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w50" name="parent_id" value="${handles.parent_id}"   />
                    <div class="tips"></div>
                </div>
            </div>
            <div class="form-group">
                <div class="form-group">
                    <div class="label">
                        <label>状态：</label>
                    </div>
                    <div class="field">
                        <select name="status" class="input w50">
                            <option value="">${handles.status}</option>
                            <option value="1">上架-1</option>
                            <option value="0">下架-0</option>
                        </select>
                        <div class="tips"></div>
                    </div>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>级别：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w50" name="sort_order" value="${handles.sort_order}"  />
                    <div class="tips"></div>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label></label>
                </div>
                <div class="field">
                    <button class="button bg-main icon-check-square-o" type="submit"> 修改</button>
                </div>
            </div>
        </form>
    </div>
</div>
</body></html>