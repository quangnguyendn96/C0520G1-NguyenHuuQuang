<%--
  Created by IntelliJ IDEA.
  User: quangnguyen
  Date: 8/30/20
  Time: 09:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Delete product</title>
</head>
<body>

<form method="post">
    <h2>Are you sure want to delete ?</h2>
    <h3>Product information</h3>
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
        <tr>
            <td></td>
            <td><input type = "submit" value="Delete customer"></td>
        </tr>
    </table>
    <a href="/product">Back to customer list</a>
</form>
</body>
</html>
