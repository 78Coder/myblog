<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/7/6
  Time: 20:00
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<html lang="zh-CN">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css">
<script src="${pageContext.request.contextPath}/layui/layui.js"></script>
<head>
    <meta charset="utf-8">
    <title>MyBlog</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/layui/dist/css/layui.css"  media="all">
    <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>
<body>

<ul class="layui-nav">

    <li class="layui-nav-item"><a href="${pageContext.request.contextPath}/article/articlelist.do">主页</a></li>


    <li class="layui-nav-item"><a href="${pageContext.request.contextPath}/admin/login.do">登录</a></li>

</ul>

<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
</fieldset>

<div style="padding: 20px; background-color: #F2F2F2;">
    <div class="layui-row layui-col-space15">

        <c:forEach items="${articles}" var="art">
        <div class="layui-col-md6" >
            <div class="layui-card" style="_height:150px; min-height:150px;">
                <div class="layui-card-header"><a href="${pageContext.request.contextPath}/article/article.do/${art.articleId}">${art.articleTitle}</a></div>
                <div class="layui-card-body">
                    ${art.articleSummary}...<br>

                </div>

                <span style="position: absolute;right: 40px;bottom: 10px">发布日期:<fmt:formatDate value="${art.articleCreateTime}"
                                                              pattern="YYYY年 MM月dd日"/> </span>
            </div>

        </div>
        </c:forEach>


        <div class="layui-col-md12">
            <div class="layui-card">
                <div class="layui-card-header">标题</div>
                <div class="layui-card-body">
                    内容
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>






</head>
<body>





</body>
</html>





