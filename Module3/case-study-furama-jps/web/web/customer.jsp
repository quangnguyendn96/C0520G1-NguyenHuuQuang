<%--
  Created by IntelliJ IDEA.
  User: quangnguyen
  Date: 9/3/20
  Time: 21:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<%@ taglib prefix="for" uri="http://java.sun.com/jsp/jstl/core" %>--%>

<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Customer</title>
    <link rel="stylesheet" href="../css/customer.css">
    <link rel="stylesheet" href="../lib_bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css" integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU" crossorigin="anonymous">
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body>
<h1 style="text-align: center; color: cadetblue">List Customer</h1>
<div class="row">
    <div class="col-3">
        <a href="/home?action=createCustomer">
            <button type="button" class="btn btn-outline-success" style="height: 50px">Create new customer</button>
        </a>
    </div>
    <div class="col-6">
        <div class="container h-100">
            <div class="d-flex justify-content-center h-100">
                <div class="searchbar">
                    <input class="search_input" type="text" name="" placeholder="Search...">
                    <a href="#" class="search_icon"><i class="fas fa-search"></i></a>
                </div>
            </div>
        </div>
    </div>
    <div class="col-3"></div>
</div>
<br>

<table class="table table-striped table-hover">
    <thead class="thead">
    <tr class="table-info">
        <th scope="col">Id customer</th>
        <th scope="col">Id type customer</th>
        <th scope="col">Name customer</th>
        <th scope="col">Day of birth</th>
        <th scope="col">Gender</th>
        <th scope="col">Identify card</th>
        <th scope="col">Phone</th>
        <th scope="col">Email</th>
        <th scope="col">Address</th>
        <th scope="col">Edit</th>
        <th scope="col">Delete</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="customer" items="${listCus}">
        <tr>
            <th scope="col">${customer.id_customer}</th>
            <td scope="col">${customer.id_type_customer}</td>
            <td scope="col">${customer.name_customer}</td>
            <td scope="col">${customer.day_of_birth_customer}</td>
            <td scope="col">${customer.gender_customer}</td>
            <td scope="col">${customer.identity_card}</td>
            <td scope="col">${customer.phone_customer}</td>
            <td scope="col">${customer.email_customer}</td>
            <td scope="col">${customer.add_customer}</td>
            <td scope="col"><a href="/home?action=editCustomer">
                <button type="button" class="btn btn-outline-warning">Edit</button>
            </a></td>
            <td scope="col"><a href="/home?action=deleteCustomer">
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
