<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/7/7
  Time: 12:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css">
<script src="${pageContext.request.contextPath}/layui/layui.js"></script>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<link rel="stylesheet" href="${pageContext.request.contextPath}/layui/dist/css/layui.css"  media="all">

<head>
    <title>${article.articleTitle}</title>
</head>
<body>

<ul class="layui-nav">
    <li class="layui-nav-item"><a href="${pageContext.request.contextPath}/article/articlelist.do">主页</a></li>


    <li class="layui-nav-item"><a href="${pageContext.request.contextPath}/admin/login.do">登录</a></li>

</ul>
<button type="button" onclick="history.go(-1);" class="layui-btn">返回</button>

<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
    <legend>${article.articleTitle}</legend>
</fieldset>

${article.articleContent}

</body>
</html>
