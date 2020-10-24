<%--
  Created by IntelliJ IDEA.
  User: quangnguyen
  Date: 8/29/20
  Time: 23:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Create New Product</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css"/>
</head>
<body>
<p>
    <c:if test='${requestScope["create"] != null}'>
        <span class="message">${requestScope["create"]}</span>
    </c:if>
</p>
<p>

</p>
<form method="post">
    <h1>User information</h1>
    <table>
        <tr>
            <td>Name User</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>Email User</td>
            <td><input type="text" name="email"></td>
        </tr>
        <tr>
            <td>Country User</td>
            <td><input type="text" name="country"></td>
        </tr>
        <tr>
            <td></td>
            <td><button type = "submit">Create New</button></td>
        </tr>
    </table>
</form>
<a href="/user"><button>Back to list</button></a>
</body>
</html>
