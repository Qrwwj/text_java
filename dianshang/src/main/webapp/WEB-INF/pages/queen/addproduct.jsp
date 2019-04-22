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
    <div class="panel-head" id="add"><strong><span class="icon-pencil-square-o"></span>增加内容</strong></div>
    <div class="body-content">
        <form method="post" class="form-x" action="${path}/doaddproduct.do" enctype="multipart/form-data">
            <div class="form-group">
                <div class="label">
                    <label>名称：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w50" name="pname" data-validate="required:请输入名称" />
                    <div class="tips"></div>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>副标题：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w50" name="subtitule"  />
                    <div class="tips"></div>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>图片：</label>
                </div>
                <div class="field">
                    <input type="text"  id="url1" name="main_image" class="input tips" style="width:25%; float:left;"  value=""  data-toggle="hover" data-place="right" data-image="" />
                    <input type="file" onchange="imgchange(this)" name="file" id="image1" value="+ 浏览上传"  style="float:left;">
                    <div class="tipss">图片尺寸：500*500</div>
                </div>
            </div>

            <if condition="$iscid eq 1">
                <div class="form-group">
                    <div class="label">
                        <label>所属类别：</label>
                    </div>
                    <div class="field">
                        <select name="handle_id" class="input w50">
                            <option value="">--请选择--</option>
                            <c:forEach items="${handles}" var="handle">
                                <option value="${handle.id}">${handle.name}</option>
                            </c:forEach>
                        </select>
                        <div class="tips"></div>
                    </div>
                </div>

            </if>
            <div class="form-group">
                <div class="label">
                    <label>价格：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w50" name="price"/>
                    <div class="tips"></div>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>库存：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w50" name="stock" />
                    <div class="tips"></div>
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
                    <label>描述：</label>
                </div>
                <div class="field">
                    <textarea class="input" name="detail" style=" height:90px;"></textarea>
                    <div class="tips"></div>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label></label>
                </div>
                <div class="field">
                    <input class="button bg-main icon-check-square-o" type="submit" value="提交">
                </div>
            </div>
        </form>
    </div>
</div>
</body>
</html>