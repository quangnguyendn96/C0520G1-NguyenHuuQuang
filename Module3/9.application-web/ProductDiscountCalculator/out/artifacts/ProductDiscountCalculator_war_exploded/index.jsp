<%--
  Created by IntelliJ IDEA.
  User: quangnguyen
  Date: 8/25/20
  Time: 22:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Currency Converter</title>
  <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<h2>Currency Converter</h2>
<form action="discount" method="post">
  <label>Description </label><br/>
  <input type="text" name="description" placeholder="DESCRIPTION" /><br/>
  <label>List Price </label><br/>
  <input type="text" name="price" placeholder="VND" /><br/>
  <label>Discount Percent </label><br/>
  <input type="text" name="percent" placeholder="VND" v/><br/>
  <input type = "submit" id = "cal" value = "Discount"/>
</form>
</body>
</html>
