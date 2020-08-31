<%--
  Created by IntelliJ IDEA.
  User: quangnguyen
  Date: 8/30/20
  Time: 10:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View customer</title>
</head>
<body>
<h1>Customer details</h1>
<p>
    <a href="/product">Back to customer list</a>
</p>
<table>
    <tr>
        <td>Id Product:</td>
        <td>${requestScope["product"].getIdProduct()}</td>
    </tr>
    <tr>
        <td>Name Product</td>
        <td>${requestScope["product"].getNameProduct()}</td>
    </tr>
    <tr>
        <td>Price Product</td>
        <td>${requestScope["product"].getPriceProduct()}</td>
    </tr>
    <tr>
        <td>Type Product</td>
        <td>${requestScope["product"].getTypeProduct()}</td>
    </tr>
    <tr>
        <td>Status Product</td>
        <td>${requestScope["product"].getStatusProduct()}</td>
    </tr>
</table>
</body>
</html>