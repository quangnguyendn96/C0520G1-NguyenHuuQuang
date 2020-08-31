<%--
  Created by IntelliJ IDEA.
  User: quangnguyen
  Date: 8/30/20
  Time: 01:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Edit product</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css"/>
</head>
<body>
<h1>Edit Product</h1>

<form method="post">
    <h1>New Customer Information</h1>
    <table>
        <tr>
            <td>Id Product:</td>
            <td><input type="number" name="id" placeholder="${requestScope["product"].getIdProduct()}"></td>
        </tr>
        <tr>
            <td>Name Product</td>
            <td><input type="text" name="name" value="${requestScope["product"].getNameProduct()}"></td>
        </tr>
        <tr>
            <td>Price Product</td>
            <td><input type="text" name="price" value="${requestScope["product"].getPriceProduct()}"></td>
        </tr>
        <tr>
            <td>Type Product</td>
            <td><input type="text" name="type" value="${requestScope["product"].getTypeProduct()}"></td>
        </tr>
        <tr>
            <td>Status Product</td>
            <td><input type="text" name="status" value="${requestScope["product"].getStatusProduct()}"></td>
        </tr>
        <tr>
            <td></td>
            <td><button type="submit">Update customer</button></td></tr>
    </table>
</form>
<td><a href="/product"><button>Cancel Edit</button></a></td>
<c:if test='${requestScope["update"] != null}'>
    <span class="message">${requestScope["update"]}</span>
</c:if>
</body>
</html>
