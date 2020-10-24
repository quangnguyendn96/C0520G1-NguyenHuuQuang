<%--
  Created by IntelliJ IDEA.
  User: quangnguyen
  Date: 9/19/20
  Time: 10:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Show List</title>
</head>
<body>
<a href=""></a>
<table style="border-collapse: collapse; border: 2px solid red">
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>ClassName</th>
        <th>Address</th>
        <th>Edit</th>
        <th>Delete</th>
    </tr>
    <c:forEach var="student" items="${list}">
        <tr>
            <td>${student.id}</td>
            <td>${student.name}</td>
            <td>${student.className}</td>
            <td>${student.address}</td>
            <td><a href="/edit/${student.id}"><button>Edit</button></a></td>
            <td><a href="/delete/${student.id}"><button>Delete</button></a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
