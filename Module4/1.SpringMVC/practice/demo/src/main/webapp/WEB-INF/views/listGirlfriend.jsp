<%--
  Created by IntelliJ IDEA.
  User: quangnguyen
  Date: 9/16/20
  Time: 14:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List </title>
</head>
<body>
<h1>List Quang's Girlfriend in codegym</h1>
<table border="1px" style="border-collapse: collapse">
    <tr>
        <th>Name</th>
        <th>Age</th>
        <th>Class</th>
    </tr>
    <c:forEach var="girl" items="${list}">
        <tr>
            <td>${girl.name}</td>
            <td>${girl.age}</td>
            <td>${girl.className}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
