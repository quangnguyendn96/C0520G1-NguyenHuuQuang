<%--
  Created by IntelliJ IDEA.
  User: quangnguyen
  Date: 8/29/20
  Time: 16:30
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Product</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css" />

</head>
<body>
<h1>Show all list product</h1>
<p>
    <a href="/product?action=create"><button class="create">Create new product</button></a>
    <a href="/product?action=search"><button class="create">Search product</button></a>
</p>
<table>
    <tr>
        <th>Id Product</th>
        <th>Name Product</th>
        <th>Price</th>
        <th>Type</th>
        <th>Status</th>
        <th>Edit</th>
        <th>Delete Product</th>
    </tr>
    <c:forEach var="product" items="${listProduct}">
        <tr>
            <td><a href="/product?action=view&id=${product.getIdProduct()}"><button>${product.idProduct}</button></a></td>
            <td>${product.nameProduct}</td>
            <td>${product.priceProduct}</td>
            <td>${product.typeProduct}</td>
            <td>${product.statusProduct}</td>
            <td><a href="/product?action=edit&id=${product.getIdProduct()}"><button>Edit</button></a></td>
            <td><a href="/product?action=delete&id=${product.getIdProduct()}"><button>Delete</button></a></td>
        </tr>
    </c:forEach>
</table>



<%--    <table>--%>
<%--        <tr><input type="text" name="searchName" id="text"></tr>--%>
<%--&lt;%&ndash;        <tr><input type="submit" value="Search"></tr>&ndash;%&gt;--%>
<%--        <tr><button type="button"><a href="/product?action=search&id=${text}">Search product</a></button></tr>--%>
<%--    </table>--%>

</body>
</html>
