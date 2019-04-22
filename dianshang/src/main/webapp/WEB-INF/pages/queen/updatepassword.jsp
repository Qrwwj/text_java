<%--
  Created by IntelliJ IDEA.
  User: wwj
  Date: 2019/3/26
  Time: 22:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/staticFile.jsp"%>
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
    <script src="${staticfile}/js/jquery-3.3.1.min.js"></script>
    <script src="{staticfile}/js/pintuer.js"></script>
</head>
<body>
<div class="panel admin-panel">
    <div class="panel-head"><strong><span class="icon-key"></span> 修改密码</strong></div>
    <div class="body-content">
        <form method="post" class="form-x" id="fm">
            <div class="form-group">
                <div class="label">
                    <label for="sitename">管理员帐号：</label>
                </div>
                <div class="field">
                    <label style="line-height:33px;">
                        ${user1.username}
                    </label>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label for="sitename">旧密码：</label>
                </div>
                <div class="field">
                    <input type="password" class="input w50" id="password" name="password" size="50" placeholder="旧密码" data-validate="required:旧密码" />
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label for="sitename">新密码：</label>
                </div>
                <div class="field">
                    <input type="password" class="input w50" name="newpass" size="50" placeholder="请输入新密码" data-validate="required:请输入新密码,length#>=5:新密码不能小于5位" />
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label for="sitename">确认新密码：</label>
                </div>
                <div class="field">
                    <input type="password" class="input w50" name="renewpass" size="50" placeholder="请再次输入新密码" data-validate="required:请再次输入新密码,repeat#newpass:两次输入的密码不一致" />
                </div>
            </div>

            <div class="form-group">
                <div class="label">
                    <label></label>
                </div>
                <div class="field">
                    <button class="button bg-main icon-check-square-o" type="button" id="bt"> 提交</button>
                </div>
            </div>
        </form>
    </div>
</div>
<script>
    $(function () {
        $("#bt").click(function () {
            var totals=$("#fm").serialize();
            $.ajax({
                url:"${path}/doupdatepassword.do",
                type:"post",
                data:totals,
                success:function(result){
                    if (result==1){
                        alert("账号不能为空！")
                        parent.location.href="login.do";
                    }
                    if (result==2){
                        alert("输入的密码有误，请重新输入!")
                        window.location.href="updatepassword.do"
                    }
                    if (result==3){
                        alert("新密码与旧密码一致，请重新输入！")
                        window.location.href="updatepassword.do";
                    }
                    if (result==4){
                        alert("密码不能为空!")
                        window.location.href="updatepassword.do";
                    }
                    if (result==5){
                        alert("两次输入的密码不一致，请重新输入！")
                        window.location.href="updatepassword.do";
                    }
                    if (result==6){
                        alert("修改成功")
                        parent.location.href="login.do";
                    }
                    if (result==7){
                        alert("修改失败")
                        window.location.href="updatepassword.do";
                    }

                }
            })
        })
    })
</script>
</body></html>
