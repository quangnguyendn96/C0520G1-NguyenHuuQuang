<%--
  Created by IntelliJ IDEA.
  User: quangnguyen
  Date: 9/2/20
  Time: 21:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Furama Resort</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="../../css/style.css">
    <link rel="stylesheet" href="../../lib_bootstrap/css/bootstrap.min.css">
</head>
<body>
<div class="container">
<form method="post" action="/login">
    <p>User Name</p>
    <input type="text" name="user name">
    <p>Password</p>
    <input type="password" name="password">
</form>
</div>
<script src="${pageContext.request.contextPath}/lib_bootstrap/js/jquery-3.5.1.min.js"></script>
<script src="${pageContext.request.contextPath}/lib_bootstrap/js/bootstrap.min.js"></script>
</body>
</html>
