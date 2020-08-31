
<%--
  Created by IntelliJ IDEA.
  User: quangnguyen
  Date: 8/30/20
  Time: 11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search Product</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css" />
</head>
<body>
<h1>Search product</h1>
<table>
    <tr>
        <form method="post">
            <h2>Enter name product</h2>
            <input style="height: 40px;width: 316px" type="text" name="searchName">
            <input class="button" type="submit" value="Search">
        </form>
    </tr>
    <tr><a href="/product"><button class="button1">Back to list</button></a></tr>
</table>

<br><br>
<table>

<c:if test='${requestScope["search"] != null}'>
    <span class="message">${requestScope["search"]}</span>
</c:if>
    <tr>
        <th>Id Product</th>
        <th>Name Product</th>
        <th>Price</th>
        <th>Type</th>
        <th>Status</th>

    </tr>
    <c:forEach var="product" items="${listProduct}">
        <tr>
            <td>${product.idProduct}</td>
            <td>${product.nameProduct}</td>
            <td>${product.priceProduct}</td>
            <td>${product.typeProduct}</td>
            <td>${product.statusProduct}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
