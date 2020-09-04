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
    <title>Contract</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="../lib_bootstrap/css/bootstrap.min.css">
    <style>
        tr:nth-child(even) {
            background: #80bdff;
        }
    </style>
</head>
<body>
<h1 style="text-align: center;color: #ffdf7e">Contract</h1>
<div class="container-fluid">
    <div class="row">
        <div class="col-1">
        </div>
        <div class="col-10">
            <a href="/home?action=createContract">
                <button type="button" class="btn btn-outline-success" style="height: 50px">Create new contract</button>
            </a>
            <br>
            <table class="table table-hover">
                <thead class="thead">
                <tr class="table-warning">
                    <th scope="col">Id Contract</th>
                    <th scope="col">Id Employee</th>
                    <th scope="col">Id Customer</th>
                    <th scope="col">Id Service</th>
                    <th scope="col">Contract Date</th>
                    <th scope="col">Contract Expire</th>
                    <th scope="col">Deposit Money</th>
                    <th scope="col">Total Money</th>
                    <th scope="col">Edit</th>
                    <th scope="col">Delete</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="contract" items="${contractList}">
                    <tr>
                        <th scope="col">${contract.idContract}</th>
                        <td scope="col">${contract.idEmployee}</td>
                        <td scope="col">${contract.idCustomer}</td>
                        <td scope="col">${contract.idService }</td>
                        <td scope="col">${contract.contractDate }</td>
                        <td scope="col">${contract.contractExpire}</td>
                        <td scope="col">${contract.depositMoney}</td>
                        <td scope="col">${contract.totalMoney}</td>
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
        </div>
        <div class="col-1"></div>
    </div>
</div>
<script src="../lib_bootstrap/js/jquery-3.5.1.min.js"></script>
<script src="../lib_bootstrap/js/bootstrap.min.js"></script>
</body>
</html>