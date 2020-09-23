<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: quangnguyen
  Date: 9/21/20
  Time: 20:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Email</title>
</head>
<body>
<form:form action="/getEmail" method="post" modelAttribute="setting">
    <table>
        <tr>
            <td><form:label path="language">Language : </form:label></td>
            <td><form:select path="language">
                <form:option value="English" label="English"/>
                <form:option value="France" label="France"/>
                <form:option value="Laos" label="Laos"/>
                <form:option value="Thailand" label="Thailand"/>
            </form:select></td>
        </tr>
        <tr>
            <td><form:label path="page">Page Size :</form:label></td>
            <td>Show <form:select path="page">
                <form:option value="5" label="5"/>
                <form:option value="10" label="10"/>
                <form:option value="15" label="15"/>
                <form:option value="25" label="25"/>
                <form:option value="50" label="50"/>
            </form:select> emails per page
            </td>
        </tr>
        <tr>
            <td><form:label path="spam">Spam filter :</form:label></td>
            <td><form:checkbox path="spam" value="Enable spam filter" label="Enable spam filter"></form:checkbox></td>
        </tr>
        <tr>
            <td><form:label path="signature">Signature :</form:label></td>
            <td><form:textarea path="signature"></form:textarea></td>
        </tr>
        <tr>
            <td></td>
            <td>
            <td><input type="submit" value="Submit"/></td>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
