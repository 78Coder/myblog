<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/7/6
  Time: 13:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>登录页面</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css">
    <script src=${pageContext.request.contextPath}/layui/layui.js></script>
    <script>
        //JavaScript代码区域
        layui.use('form', function(){
            var  form=layui.form;
            var $ = layui.$;
            //监听提交
            form.on('submit(formDemo)', function(data){
                //alert(JSON.stringify(data.field));
                $.ajax({
                    url: '${pageContext.request.contextPath}/admin/loginVerify.do',
                    async: false,//同步，待请求完毕后再执行后面的代码
                    type: "POST",
                    contentType: "application/x-www-form-urlencoded; charset=utf-8",
                    data: data.field,
                    dataType: "json",
                    success: function (data1) {
                        if(data1.code==0) {
                            alert(data1.msg);
                        } else {
                            window.location.href="${pageContext.request.contextPath}/admin";

                        }
                    },
                    error: function () {
                        alert("数据获取失败")
                    }
                })
                return false;
            });
            //自定义验证规则
            form.verify({
                username: [
                    /^[\S]{4,12}$/
                    ,'用户名必须4到12位，且不能出现空格'
                ],
                password: [
                    /^[\S]{6,12}$/
                    ,'密码必须6到12位，且不能出现空格'
                ]
            });
        });
    </script>
</head>
<body style="padding: 20px;">
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">
    <legend>登录</legend>
</fieldset>


<form class="layui-form layui-form-pane" action=""  method="post" > <!-- 提示：如果你不想用form，你可以换成div等任何一个普通元素 -->
    <div class="layui-form-item">
        <label class="layui-form-label">用户账号</label>
        <div class="layui-input-inline">
            <input type="username" name="username" required  lay-verify="username" placeholder="请输入用户名" autocomplete="off" class="layui-input">
        </div>
        <i class="layui-icon" style="font-size: 30px; color: #1E9FFF;"></i>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">用户密码</label>
        <div class="layui-input-inline">
            <input type="password" name="password" required lay-verify="password" placeholder="请输入密码" autocomplete="off" class="layui-input">
        </div>
        <i class="layui-icon layui-icon-password" style="font-size: 30px; color: #1E9FFF;"></i>
    </div>
    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit lay-filter="formDemo">立即提交</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
</form>
</body>
</html>