<%--
  Created by IntelliJ IDEA.
  User: quangnguyen
  Date: 9/3/20
  Time: 23:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Service</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="../lib_bootstrap/css/bootstrap.min.css">
<style>
    tr:nth-child(even){
        background: lightgoldenrodyellow;
    }
</style>
</head>
<body>
<h1 style="text-align: center;color: #ffdf7e">Manager Employee</h1>
<table class="table table-hover">
    <thead class="thead">
    <tr class="table-warning">
        <th scope="col">Id Employee</th>
        <th scope="col">Name Positive</th>
        <th scope="col">Id Positive</th>
        <th scope="col">Id Degree Education</th>
        <th scope="col">Id Division</th>
        <th scope="col">Day of birth</th>
        <th scope="col">Identity Card Employee</th>
        <th scope="col">Salary</th>
        <th scope="col">Phone Number</th>
        <th scope="col">Email</th>
        <th scope="col">Address</th>
        <th scope="col">Name Account</th>
        <th scope="col">Edit</th>
        <th scope="col">Delete</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="employee" items="${employeeList}">
        <tr>
            <th scope="col">${employee.idEmployee}</th>
            <td scope="col">${employee.nameEmployee}</td>
            <td scope="col">${employee.idPositive}</td>
            <td scope="col">${employee.idDegreeEducation}</td>
            <td scope="col">${employee.idDivision}</td>
            <td scope="col">${employee.dayOfBirth }</td>
            <td scope="col">${employee.identityCardEmployee}</td>
            <td scope="col">${employee.salary}</td>
            <td scope="col">${employee.phoneNumber}</td>
            <td scope="col">${employee.emailEmployee}</td>
            <td scope="col">${employee.addressEmployee }</td>
            <td scope="col">${employee.username}</td>
            <td scope="col"><a href="/home?action=editService">
                <button type="button" class="btn btn-outline-warning">Edit</button>
            </a></td>
            <td scope="col"><a href="/home?action=deleteService">
                <button type="button" class="btn btn-outline-danger">Delete</button>
            </a></td>

        </tr>
    </c:forEach>
    </tbody>
</table>
<script src="../lib_bootstrap/js/jquery-3.5.1.min.js"></script>
<script src="../lib_bootstrap/js/bootstrap.min.js"></script>
</body>
</html>