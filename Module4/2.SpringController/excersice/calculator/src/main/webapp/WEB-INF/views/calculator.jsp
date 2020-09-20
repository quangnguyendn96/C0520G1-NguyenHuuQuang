<%--
  Created by IntelliJ IDEA.
  User: quangnguyen
  Date: 9/19/20
  Time: 12:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<form method="get">
    <label><input type="number" step="any" min="0" name="num1"></label>
    <label><input type="number" step="any" min="0" name="num2"></label>
    <p><input value="Addition(+)" formaction="/+"  type="submit">
    <input value="Subtraction(-)" formaction="/-" name="-" type="submit">
    <input value="Multiplication(x)" formaction="/x" type="submit">
    <input value="Division(/)" formaction="/div" type="submit"></p>
</form>
<h2>Result : ${calculator}</h2>
</body>
</html>
