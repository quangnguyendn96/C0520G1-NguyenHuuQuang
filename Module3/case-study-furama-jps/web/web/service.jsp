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
</head>
<body>
<h1 style="text-align: center;color: #95999c">Service Furama</h1>
<table class="table table-striped table-hover table-dark">
    <thead class="thead">
    <tr class="table-dark">
        <th scope="col">Id Service</th>
        <th scope="col">Name Service</th>
        <th scope="col">Area Service</th>
        <th scope="col">Number floor</th>
        <th scope="col">Maximum number</th>
        <th scope="col">Cost rent</th>
        <th scope="col">Id Type Service</th>
        <th scope="col">Id Type Rent</th>
        <th scope="col">Address</th>
        <th scope="col">Area Pool</th>
        <th scope="col">Description convenience</th>
        <th scope="col">Edit</th>
        <th scope="col">Delete</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="service" items="${listService}">
        <tr>
            <th scope="col">${service.idService}</th>
            <td scope="col">${service.nameService}</td>
            <td scope="col">${service.areaService}</td>
            <td scope="col">${service.numberFloor}</td>
            <td scope="col">${service.maximumCustomer}</td>
            <td scope="col">${service.costRent}</td>
            <td scope="col">${service.idTypeService}</td>
            <td scope="col">${service.idTypeRent}</td>
            <td scope="col">${service.descriptionOtherConvenience}</td>
            <td scope="col">${service.poolArea}</td>
            <td scope="col">${service.standardRoom}</td>
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