<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Create a new employee</title>
</head>
<body>
<h3>Welcome, Enter The Employee Details</h3>
<form:form method="POST" action="addEmployee" modelAttribute="employee">
    <table>
        <tr>
            <td><form:label path="id">Employee ID: </form:label></td>
            <td><form:input path="id"/></td>
        </tr>
        <tr>
            <td><form:label path="name">Employee Name: </form:label></td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td><form:label path="contactNumber">Employee Contract :</form:label></td>
            <td><form:input path="contactNumber"/></td>
        </tr>
        <td form:submit></td>
    </table>
</form:form>
</body>
</html>