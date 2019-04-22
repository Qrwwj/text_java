<%--
  Created by IntelliJ IDEA.
  User: 张兵鑫
  Date: 2019/3/29
  Time: 20:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
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
<div class="panel admin-panel margin-top">
    <div class="panel-head" id="add"><strong><span class="icon-pencil-square-o"></span>修改</strong></div>
    <div class="body-content">
        <form method="post" class="form-x" action="doupdate.do">
            <input type="hidden" name="id" value="${user.id}"><br>
            <div class="form-group">
                <div class="label">
                    <label>用户名称：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w50" name="username" value="${user.username}" />
                    <div class="tips"></div>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>用户密码：</label>
                </div>
                <div class="field">
                    <input type="password" class="input w50" name="password" value="${user.password}"/>
                    <div class="tips"></div>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>用户邮箱：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w50" name="email" value="${user.email}"/>
                    <div class="tips"></div>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>用户电话：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w50" name="phone" value="${user.phone}"/>
                    <div class="tips"></div>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>问题：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w50" name="question" value="${user.question}"/>
                    <div class="tips"></div>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>答案：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w50" name="answer" value="${user.answer}"/>
                    <div class="tips"></div>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>权限：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w50" name="role" value="${user.role}"/>
                    <div class="tips"></div>
                </div>
            </div>

            <div class="form-group">
                <div class="label">
                    <label></label>
                </div>
                <div class="field">
                    <button class="button bg-main icon-check-square-o" type="submit"> 提交</button>
                </div>
            </div>
        </form>
    </div>
</div>
</body>
</html>

