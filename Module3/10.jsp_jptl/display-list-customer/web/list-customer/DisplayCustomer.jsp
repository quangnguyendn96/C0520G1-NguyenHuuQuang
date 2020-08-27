<%@ page import="java.util.List" %>
<%@ page import="models.Customer" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: quangnguyen
  Date: 8/27/20
  Time: 23:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>ListCustomer</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/styles.css" />
</head>
<body>
<table>
<%--    <c:url value="${unnamed.jpg}"/>"/>--%>
    <tr>
        <td>Name</td>
        <td>Day Of Birth</td>
        <td>Address</td>

    </tr>
    <c:forEach var="customer" items="${listCustomer}">
        <tr>
            <td><c:out value="${customer.name}"></c:out></td>
            <td><c:out value="${customer.dayOfBirth}"></c:out></td>
            <td><c:out value="${customer.address}"></c:out></td>

        </tr>
    </c:forEach>
</table>

</body>
</html>
