<%--
  Created by IntelliJ IDEA.
  User: quangnguyen
  Date: 8/31/20
  Time: 21:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../css/style.css"/>
</head>
<body>
<h1>Show all user</h1>
<a href="/user?action=create"><button class="create"button>Create new User</button></a>
<a href="/user?action=sortByName"><button class="create"button>Sort By Name</button></a>
<form method="get">
    <input type="hidden" name="action" value="search">
    <input type="text" name="searchCountry">
    <input type="submit" value="Search">
</form>
<br>
<table>
    <tr>
        <th>Id User</th>
        <th>Name User</th>
        <th>Email User</th>
        <th>Country</th>
        <th>Edit</th>
        <th>Delete</th>

    </tr>
    <c:forEach var="user" items="${listUser}">
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.email}</td>
            <td>${user.country}</td>
            <td><a href="/user?action=edit&id=${user.id}"><button>Edit</button></a> </td>
            <td><a href="/user?action=delete&id=${user.id}"><button>Delete</button> </a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>