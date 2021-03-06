<%--
  Created by IntelliJ IDEA.
  User: 张兵鑫
  Date: 2019/3/30
  Time: 20:16
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
<form method="post" action="" id="listform">
    <div class="panel admin-panel">
        <div class="panel-head"><strong class="icon-reorder"> 内容列表</strong> <a href="" style="float:right; display:none;">添加字段</a></div>
        <div class="padding border-bottom">
            <ul class="search" style="padding-left:10px;">
                <li> <a class="button border-main icon-plus-square-o" href="addproduct.do"> 添加商品</a> </li>
                <li>搜索：</li>
                <li>首页
                    <select name="s_ishome" class="input" onchange="changesearch()" style="width:60px; line-height:17px; display:inline-block">
                        <option value="">选择</option>
                        <option value="1">是</option>
                        <option value="0">否</option>
                    </select>
                    &nbsp;&nbsp;
                    推荐
                    <select name="s_isvouch" class="input" onchange="changesearch()"  style="width:60px; line-height:17px;display:inline-block">
                        <option value="">选择</option>
                        <option value="1">是</option>
                        <option value="0">否</option>
                    </select>
                    &nbsp;&nbsp;
                    状态
                    <select name="status" class="input" id="sta"  style="width:60px; line-height:17px;display:inline-block">
                        <option value="">选择</option>
                        <option value="1">是</option>
                        <option value="0">否</option>
                    </select>
                </li>
                <if condition="$iscid eq 1">
                    <li>
                        <select name="cid" class="input" style="width:200px; line-height:17px;" onchange="changesearch()">
                            <option value="">请选择分类</option>
                            <option value="">产品分类</option>
                            <option value="">产品分类</option>
                            <option value="">产品分类</option>
                            <option value="">产品分类</option>
                        </select>
                    </li>
                </if>
                <li>
                    <input type="text" placeholder="请输入搜索关键字" id="keywords" class="input" style="width:250px; line-height:17px;display:inline-block" />
                    <a  href="javascript:void(0)" id="serch" class="button border-main icon-search"> 搜索</a></li>
            </ul>
        </div>
        <table class="table table-hover text-center">
            <tr>
                <th width="8%" style="text-align:left; padding-left:20px;">ID</th>
                <th width="8%" style="text-align:left; padding-left:10px;">handleID</th>
                <th width="8%">名称</th>
                <th width="8%">标题</th>
                <th width="8%">图片</th>
                <th width="8%">细节</th>
                <th width="8%">价格</th>
                <th width="8%">库存</th>
                <th width="8%">状态</th>
                <th width="8%">更新时间</th>
                <th width="310">操作</th>
            </tr>
            <volist name="list" id="vo">
                <c:forEach items="${products}" var="product">
                    <tr>
                        <td style="text-align:left; padding-left:20px;"><input type="checkbox" name="id[]" value="" />${product.id}</td>
                        <td>${product.handleId}</td>
                        <td>${product.name}</td>
                        <td width="10%">${product.subtitle}</td>
                        <td><img src="static/images/${product.mainImage}" alt="" width="70" height="50" /></td>
                        <td>${product.detail}</td>
                        <td>${product.price}</td>
                        <td>${product.stock}</td>
                        <td>${product.status}</td>
                        <td>${product.updateTime}</td>
                        <td><div class="button-group"> <a class="button border-main" href="updateproduct.do?id=${product.id}"><span class="icon-edit"></span> 修改</a> <a class="button border-red" href="javascript:void(0)" id="del" onclick="del(${product.id})"><span class="icon-trash-o"></span> 删除</a> </div></td>
                    </tr>
                    </c:forEach>
                <tr>
                    <td style="text-align:left; padding:19px 0;padding-left:20px;"><input type="checkbox" id="checkall"/>
                        全选 </td>
                    <td colspan="7" style="text-align:left;padding-left:20px;"><a href="javascript:void(0)" class="button border-red icon-trash-o" style="padding:5px 15px;" onclick="DelSelect()"> 删除</a> <a href="javascript:void(0)" style="padding:5px 15px; margin:0 10px;" class="button border-blue icon-edit" onclick="sorts()"> 排序</a> 操作：
                        <select name="ishome" style="padding:5px 15px; border:1px solid #ddd;" onchange="changeishome(this)">
                            <option value="">首页</option>
                            <option value="1">是</option>
                            <option value="0">否</option>
                        </select>
                        <select name="isvouch" style="padding:5px 15px; border:1px solid #ddd;" onchange="changeisvouch(this)">
                            <option value="">推荐</option>
                            <option value="1">是</option>
                            <option value="0">否</option>
                        </select>
                        <select name="istop" style="padding:5px 15px; border:1px solid #ddd;" onchange="changeistop(this)">
                            <option value="">置顶</option>
                            <option value="1">是</option>
                            <option value="0">否</option>
                        </select>
                        &nbsp;&nbsp;&nbsp;

                        移动到：
                        <select name="movecid" style="padding:5px 15px; border:1px solid #ddd;" onchange="changecate(this)">
                            <option value="">请选择分类</option>
                            <option value="">产品分类</option>
                            <option value="">产品分类</option>
                            <option value="">产品分类</option>
                            <option value="">产品分类</option>
                        </select>
                        <select name="copynum" style="padding:5px 15px; border:1px solid #ddd;" onchange="changecopy(this)">
                            <option value="">请选择复制</option>
                            <option value="5">复制5条</option>
                            <option value="10">复制10条</option>
                            <option value="15">复制15条</option>
                            <option value="20">复制20条</option>
                        </select></td>
                </tr>
                <tr>
                    <td colspan="8">
                        <div class="pagelist">
                            <c:choose>
                                <c:when test="${pageInfo.isFirstPage}">
                                    <a href="javascript:void(0)">首页</a>
                                </c:when>
                                <c:otherwise>
                                    <a href="productlist.do?pageNum=${pageInfo.navigateFirstPage}">首页</a>
                                </c:otherwise>
                            </c:choose>
                            <c:choose>
                                <c:when test="${pageInfo.isFirstPage}">
                                    <a href="javascript:void(0)">上一页</a>
                                </c:when>
                                <c:otherwise>
                                    <a href="productlist.do?pageNum=${pageInfo.prePage}">上一页</a>
                                </c:otherwise>
                            </c:choose>
                            <c:forEach items="${pageInfo.navigatepageNums}" var="page">
                                <c:choose>
                                    <c:when test="${pageInfo.pageNum==page}">
                                        <span class="current">${page}</span>
                                    </c:when>
                                    <c:otherwise>
                                        <a href="productlist.do?pageNum=${page}">${page}</a>
                                    </c:otherwise>
                                </c:choose>
                            </c:forEach>
                            <c:choose>
                                <c:when test="${pageInfo.isLastPage}">
                                    <a href="javascript:void(0)">下一页</a>
                                </c:when>
                                <c:otherwise>
                                    <a href="productlist.do?pageNum=${pageInfo.nextPage}">下一页</a>
                                </c:otherwise>
                            </c:choose>
                            <c:choose>
                                <c:when test="${pageInfo.isLastPage}">
                                    <a href="javascript:void(0)">尾页</a>
                                </c:when>
                                <c:otherwise>
                                    <a href="productlist.do?pageNum=${pageInfo.navigateLastPage}">尾页</a>
                                </c:otherwise>
                            </c:choose>
                    </div>
                    </td>
                </tr>
        </table>
    </div>
</form>
<script type="text/javascript">

    //搜索
    $(function () {
        $("#serch").click(function () {
            window.location.href="http://localhost:8080/swc/productlist.do?name="+$("#keywords").val()
        })
        $("#sta").change(function () {
            window.location.href="http://localhost:8080/swc/productlist.do?status="+$("#sta").val()
        })
    })

    //单个删除
    function del(id){
        if(confirm("您确定要删除吗?")){
            window.location.href="http://localhost:8080/swc/deleteproduct.do?id="+id+""
        }else {
            window.location.href="http://localhost:8080/swc/productlist.do"
        }
    }

    //全选
    $("#checkall").click(function(){
        $("input[name='id[]']").each(function(){
            if (this.checked) {
                this.checked = false;
            }
            else {
                this.checked = true;
            }
        });
    })

    //批量删除
    function DelSelect(){
        var Checkbox=false;
        $("input[name='id[]']").each(function(){
            if (this.checked==true) {
                Checkbox=true;
            }
        });
        if (Checkbox){
            var t=confirm("您确认要删除选中的内容吗？");
            if (t==false) return false;
            $("#listform").submit();
        }
        else{
            alert("请选择您要删除的内容!");
            return false;
        }
    }

    //批量排序
    function sorts(){
        var Checkbox=false;
        $("input[name='id[]']").each(function(){
            if (this.checked==true) {
                Checkbox=true;
            }
        });
        if (Checkbox){

            $("#listform").submit();
        }
        else{
            alert("请选择要操作的内容!");
            return false;
        }
    }


    //批量首页显示
    function changeishome(o){
        var Checkbox=false;
        $("input[name='id[]']").each(function(){
            if (this.checked==true) {
                Checkbox=true;
            }
        });
        if (Checkbox){

            $("#listform").submit();
        }
        else{
            alert("请选择要操作的内容!");

            return false;
        }
    }

    //批量推荐
    function changeisvouch(o){
        var Checkbox=false;
        $("input[name='id[]']").each(function(){
            if (this.checked==true) {
                Checkbox=true;
            }
        });
        if (Checkbox){


            $("#listform").submit();
        }
        else{
            alert("请选择要操作的内容!");

            return false;
        }
    }

    //批量置顶
    function changeistop(o){
        var Checkbox=false;
        $("input[name='id[]']").each(function(){
            if (this.checked==true) {
                Checkbox=true;
            }
        });
        if (Checkbox){

            $("#listform").submit();
        }
        else{
            alert("请选择要操作的内容!");

            return false;
        }
    }


    //批量移动
    function changecate(o){
        var Checkbox=false;
        $("input[name='id[]']").each(function(){
            if (this.checked==true) {
                Checkbox=true;
            }
        });
        if (Checkbox){

            $("#listform").submit();
        }
        else{
            alert("请选择要操作的内容!");

            return false;
        }
    }

    //批量复制
    function changecopy(o){
        var Checkbox=false;
        $("input[name='id[]']").each(function(){
            if (this.checked==true) {
                Checkbox=true;
            }
        });
        if (Checkbox){
            var i = 0;
            $("input[name='id[]']").each(function(){
                if (this.checked==true) {
                    i++;
                }
            });
            if(i>1){
                alert("只能选择一条信息!");
                $(o).find("option:first").prop("selected","selected");
            }else{

                $("#listform").submit();
            }
        }
        else{
            alert("请选择要复制的内容!");
            $(o).find("option:first").prop("selected","selected");
            return false;
        }
    }

</script>
</body>
</html>
