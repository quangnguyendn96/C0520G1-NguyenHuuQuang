<%--
  Created by IntelliJ IDEA.
  User: quangnguyen
  Date: 9/16/20
  Time: 15:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<form action="/trans">
    <h2>USD</h2>
    <input type="number" name="usd">
    <input type="submit" value="Trans">
</form>
<h2>VND : ${result}</h2>
</body>
</html>
