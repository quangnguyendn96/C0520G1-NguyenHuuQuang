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
    <link rel="stylesheet" href="../lib_bootstrap/datatables/css/dataTables.bootstrap4.min.css"/>
</head>
<body>
<div class="container-fluid">
    <div class="row">
        <div class="col-12">
            <h1 style="text-align: center;color: #bee5eb">List Student</h1>
        </div>
    </div>
    <div class="row">
        <div class="col-12">
            <a href="/student?action=createObj">
                <button type="button" class="btn btn-outline-success" style="height: 50px">Create new Service
                </button>
            </a>
            <form class="form-inline my-2 my-lg-0">
                <input type="hidden" name="action" value="searchObj">
                <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search"
                       style="width: 300px" value="${search}" name="searchObj">
                <button class="btn btn-outline-success my-2 my-sm-2" type="submit">Search</button>
            </form>
        </div>
    </div>
    <div class="row">
        <div class="col-12">
            <table id="tableService" class="table table-striped table-hover table-light">
                <thead class="thead">
                <tr class="table-dark">
                    <th scope="col">Id </th>
                    <th scope="col">Name </th>
                    <th scope="col">Class Name</th>
                    <th scope="col">Gender</th>
                    <th scope="col">Id Card</th>
                    <th scope="col">Day Of Birth</th>
                    <th scope="col">Phone Number</th>
                    <th scope="col">Edit</th>
                    <th scope="col">Delete</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="obj" items="${listObj}">
                    <tr>
                        <th scope="col">${obj.id}</th>
                        <td >${obj.name}</td>
                        <td>${obj.className}</td>
                        <td>${obj.gender}</td>
                        <td>${obj.idCard}</td>
                        <td>${obj.dayOfBirth}</td>
                        <td>${obj.phoneNumber}</td>
                        <td><a href="/student?action=editObj&id=${obj.id}">
                            <button type="button" class="btn btn-outline-warning">Edit</button>
                        </a></td>
                        <td>
                            <button type="button" class="btn btn-outline-danger" data-toggle="modal"
                                    data-target="#${obj.id}">
                                Delete
                            </button>
                            <!-- The Modal -->
                            <div class="modal" id="${obj.id}" style="color: #0c0c0c">
                                <div class="modal-dialog">
                                    <div class="modal-content">
                                        <!-- Modal Header -->
                                        <div class="modal-header">
                                            <h4 class="modal-title">Do you want to delete ? </h4>
                                        </div>
                                        <!-- Modal body -->
                                        <div class="modal-body">
                                            Student : ${obj.name}
                                        </div>
                                        <!-- Modal footer -->
                                        <div class="modal-footer">
                                            <button type="button" class="btn btn-outline-success" data-dismiss="modal">
                                                Cancel
                                            </button>
                                            <a href="/student?action=deleteObj&id=${obj.id}">
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
<script src="../lib_bootstrap/js/jquery-3.5.1.min.js"></script>
<script src="../lib_bootstrap/js/bootstrap.min.js"></script>
<script src="../lib_bootstrap/datatables/js/jquery.dataTables.min.js"></script>
<script src="../lib_bootstrap/datatables/js/dataTables.bootstrap4.min.js"></script>
<script>
    $(document).ready(function () {
        $('#tableService').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 7
        });
    });
</script>
</body>
</html>