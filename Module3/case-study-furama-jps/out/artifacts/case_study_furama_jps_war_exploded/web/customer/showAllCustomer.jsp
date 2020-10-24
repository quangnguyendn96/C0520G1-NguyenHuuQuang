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
    <link rel="stylesheet" href="../../lib_bootstrap/css/bootstrap.min.css">
    <style>
        tr:nth-child(even) {
            background: #80bdff;
        }
    </style>
</head>
<body>
<%@ include file="../../common/header.jsp"%>
<h1 style="text-align: center;color: #ffdf7e">Show All Info Customer</h1>
<div class="container-fluid">
    <div class="row">
        <div class="col-3">
        </div>
        <div class="col-9">
            <br>
            <table class="table table-hover">
                <thead class="thead">
                <tr class="table-warning">
                    <th scope="col">Id Customer</th>
                    <th scope="col">Name Customer</th>
                    <th scope="col">Id Contract</th>
                    <th scope="col">Id Service</th>
                    <th scope="col">Contract Date</th>
                    <th scope="col">Id Type Service</th>
                    <th scope="col">Edit</th>
                    <th scope="col">Delete</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="obj" items="${listObj}">
                    <tr>
                        <th scope="col">${obj.col_1}</th>
                        <td>${obj.col_2}</td>
                        <td>${obj.col_3}</td>
                        <td>${obj.col_4}</td>
                        <td>${obj.col_5}</td>
                        <td>${obj.col_6}</td>
                        <td><a href="#">
                            <button type="button" class="btn btn-outline-warning">Edit</button>
                        </a></td>
                        <td scope="col">
                            <button type="button" class="btn btn-outline-warning" data-toggle="modal"
                                    data-target="#exampleModal">
                                Delete
                            </button>
                            <!-- Modal -->
                            <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel"
                                 aria-hidden="true">
                                <div class="modal-dialog">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <h5 class="modal-title" id="exampleModalLabel">Do you want to delete?</h5>
                                        </div>
                                        <div class="modal-body">
                                            <h5></h5>
                                        </div>
                                        <div class="modal-footer">
                                            <button type="button" class="btn btn-secondary" data-dismiss="modal">
                                                Cancel
                                            </button>
                                            <a href="#">
                                                <button type="button" class="btn btn-outline-danger">Delete</button>
                                            </a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </td>

                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
<script src="../../lib_bootstrap/js/jquery-3.5.1.min.js"></script>
<script src="../../lib_bootstrap/js/bootstrap.min.js"></script>
</body>
</html>