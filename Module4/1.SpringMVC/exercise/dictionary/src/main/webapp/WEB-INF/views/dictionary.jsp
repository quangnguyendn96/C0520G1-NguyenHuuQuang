<%--
  Created by IntelliJ IDEA.
  User: quangnguyen
  Date: 9/16/20
  Time: 20:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dictionary</title>
</head>
<body>
<form method="get" action="/">
    <h2>English</h2>
    <input type="text" name="dictionary">
    <input type="submit" value="Translation">
</form>
<h2> Viet Nam : ${word}</h2>
</body>
</html>
