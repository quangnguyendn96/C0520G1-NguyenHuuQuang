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
    <link rel="stylesheet" href="../../lib_bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="../../lib_bootstrap/datatables/css/dataTables.bootstrap4.min.css"/>
    <style>
        tr:nth-child(even) {
            background: lightgoldenrodyellow;
        }
    </style>
</head>
<body>
<%@ include file="../../common/header.jsp" %>
<div class="container-fluid">
    <h1 style="text-align: center;color: #ffdf7e">Manager Employee</h1>
    <div class="row">
        <div class="col-12">
            <a href="/employee?action=createObj">
                <button type="button" class="btn btn-outline-success" style="height: 50px; width: 150px">Create New
                    Employee
                </button>
            </a>
            <a href="/home">
                <button type="button" class="btn btn-outline-success" style="height: 50px; width: 150px">Back to home
                </button>
            </a>
        </div>
    </div>
    <div class="row">
        <div class="col-12">
            <table id="tableEmployee" class="table table-hover">
                <thead class="thead">
                <tr class="table-warning">
                    <th scope="col">Id Employee</th>
                    <th scope="col">Name Employee</th>
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
                <c:forEach var="obj" items="${listObj}">
                    <tr>
                        <th scope="col">${obj.idEmployee}</th>
                        <td scope="col">${obj.nameEmployee}</td>
                        <td scope="col">${obj.idPositive}</td>
                        <td scope="col">${obj.idDegreeEducation}</td>
                        <td scope="col">${obj.idDivision}</td>
                        <td scope="col">${obj.dayOfBirth }</td>
                        <td scope="col">${obj.identityCardEmployee}</td>
                        <td scope="col">${obj.salary}</td>
                        <td scope="col">${obj.phoneNumber}</td>
                        <td scope="col">${obj.emailEmployee}</td>
                        <td scope="col">${obj.addressEmployee }</td>
                        <td scope="col">${obj.username}</td>
                        <td scope="col"><a href="/employee?action=editObj&id=${obj.idEmployee}">
                            <button type="button" class="btn btn-outline-warning">Edit</button>
                        </a></td>
                        <td>
                            <!-- Button trigger modal -->
                            <button type="button" class="btn btn-outline-danger" data-toggle="modal"
                                    data-target="#abc${obj.idEmployee}">
                                Delete
                            </button>

                            <!-- Modal -->
                            <div class="modal fade" id="abc${obj.idEmployee}" tabindex="-1"
                                 aria-labelledby="exampleModalLabel" aria-hidden="true">
                                <div class="modal-dialog">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <h5 class="modal-title" id="exampleModalLabel">Do you want to delete</h5>
                                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                <span aria-hidden="true">&times;</span>
                                            </button>
                                        </div>
                                        <div class="modal-body">
                                            Employee : ${obj.nameEmployee}
                                        </div>
                                        <div class="modal-footer">
                                            <button type="button" class="btn btn-outline-success" data-dismiss="modal">
                                                Close
                                            </button>
                                            <a href="/employee?action=deleteObj&id=${obj.idEmployee}">
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
            <script src="../../lib_bootstrap/js/jquery-3.5.1.min.js"></script>
            <script src="../../lib_bootstrap/js/bootstrap.min.js"></script>
            <script src="../../lib_bootstrap/datatables/js/jquery.dataTables.min.js"></script>
            <script src="../../lib_bootstrap/datatables/js/dataTables.bootstrap4.min.js"></script>
            <script>
                $(document).ready(function () {
                    $('#tableEmployee').dataTable({
                        "dom": 'lrtip',
                        "lengthChange": false,
                        "pageLength": 7
                    });
                });
            </script>
        </div>
    </div>
</div>
</body>
</html>