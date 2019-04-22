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
<div class="panel admin-panel">
    <div class="panel-head" id="add"><strong><span class="icon-pencil-square-o"></span>添加商品</strong></div>
    <div class="body-content">
        <form method="post" class="form-x" action="doupdateproduct.do" enctype="multipart/form-data">
            <input type="text" name="id" value="${product.id}" style="display: none">

            <div class="form-group">
                    <div class="label">
                        <label>名称：</label>
                    </div>
                    <div class="field">
                        <input type="text" class="input w50" name="pname" value="${product.pname}"/>
                        <div class="tips"></div>
                    </div>
                </div>
                <div class="form-group">
                    <div class="label">
                        <label>副标题：</label>
                    </div>
                    <div class="field">
                        <input type="text" class="input w50" name="subtitule" value="${product.subtitule}"/>
                        <div class="tips"></div>
                    </div>
                </div>
            <div class="form-group">
                <div class="label">
                    <label>图片：</label>
                </div>
                <div class="field">
                    <input type="text"  id="url1" name="main_image" class="input tips" style="width:25%; float:left;"  value="${product.main_image}"  data-toggle="hover" data-place="right" data-image="" />
                    <input type="file" onchange="imgchange(this)" name="file" id="image1" value="+ 浏览上传"  style="float:left;">
                </div>
            </div>
                <div class="form-group">
                    <div class="label">
                        <label>价格：</label>
                    </div>
                    <div class="field">
                        <input type="text" class="input w50" name="price" value="${product.price}"/>
                        <div class="tips"></div>
                    </div>
                </div>
                <div class="form-group">
                    <div class="label">
                        <label>库存：</label>
                    </div>
                    <div class="field">
                        <input type="text" class="input w50" name="stock" value="${product.stock}"/>
                        <div class="tips"></div>
                    </div>
                </div>
                <div class="form-group">
                    <div class="label">
                        <label>状态：</label>
                    </div>
                    <div class="field">
                        <select name="status" class="input w50">
                            <option >${product.status}</option>
                            <option value="1">1--上架</option>
                            <option value="0">0--下架</option>
                        </select>
                        <div class="tips"></div>
                    </div>
                </div>
                <div class="form-group">
                    <div class="label">
                        <label>描述：</label>
                    </div>
                    <div class="field">
                        <textarea class="input" name="detail" style=" height:90px;" value="${product.detail}"></textarea>
                        <div class="tips"></div>
                    </div>
                </div>
                <div class="form-group">
                    <div class="label">
                        <label></label>
                    </div>
                    <div class="field">
                        <input class="button bg-main icon-check-square-o" type="submit" value="修改">
                    </div>
                </div>
            </form>
    </div>
</div>
</body>
</html>