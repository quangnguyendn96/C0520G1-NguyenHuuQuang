<%--
  Created by IntelliJ IDEA.
  User: quangnguyen
  Date: 9/19/20
  Time: 10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit</title>
</head>
<body>
<form action="/edit" method="post">
    <p></p><label>Id : <input type="text" value="${student.id}" readonly name="id"></label></p>
    <p><label>Name : <input type="text" value="${student.name}" name="name"></label></p>
    <p><label>Class Name : <input type="text" value="${student.className}" name="className"></label></p>
    <p><label>Address : <input type="text" value="${student.address}" name="address"></label></p>
    <p><input type="submit" value="Update">
</form>
</body>
</html>
