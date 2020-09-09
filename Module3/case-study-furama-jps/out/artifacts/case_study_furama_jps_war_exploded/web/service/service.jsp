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
</head>
<body>
<%@ include file="../../common/header.jsp" %>
<h1 style="text-align: center;color: #95999c">Service Furama</h1>
<p><c:if test='${requestScope["message"] != null}'>
    <span class="message">${requestScope["message"]}</span>
</c:if></p>
<div class="col-3">
    <a href="/service?action=createObj">
        <button type="button" class="btn btn-outline-success" style="height: 50px">Create new Service</button>
    </a>
    <a href="/home">
        <button type="button" class="btn btn-outline-success" style="height: 50px">Back to home</button>
    </a>
</div>
<table id="tableService" class="table table-striped table-hover table-dark">
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
        <th scope="col">Description convenience</th>
        <th scope="col">Area Pool</th>
        <th scope="col">Standard Room</th>
        <th scope="col">Edit</th>
        <th scope="col">Delete</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="obj" items="${listObj}">
        <tr>
            <th scope="col">${obj.idService}</th>
            <td scope="col">${obj.nameService}</td>
            <td scope="col">${obj.areaService}</td>
            <td scope="col">${obj.numberFloor}</td>
            <td scope="col">${obj.maximumCustomer}</td>
            <td scope="col">${obj.costRent}</td>
            <td scope="col">${obj.idTypeService}</td>
            <td scope="col">${obj.idTypeRent}</td>
            <td scope="col">${obj.descriptionOtherConvenience}</td>
            <td scope="col">${obj.poolArea}</td>
            <td scope="col">${obj.standardRoom}</td>
            <td scope="col"><a href="/service?action=editObj&id=${obj.idService}">
                <button type="button" class="btn btn-outline-warning">Edit</button>
            </a></td>
            <td>
                <button type="button" class="btn btn-outline-danger" data-toggle="modal"
                        data-target="#${obj.idService}">
                    Delete
                </button>
            </td>
            <!-- The Modal -->
            <div class="modal" id="${obj.idService}" style="color: #0c0c0c">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <!-- Modal Header -->
                        <div class="modal-header">
                            <h4 class="modal-title">Do you want to delete ? </h4>
                        </div>
                        <!-- Modal body -->
                        <div class="modal-body">
                            Service : ${obj.idService}
                        </div>
                        <!-- Modal footer -->
                        <div class="modal-footer">
                            <button type="button" class="btn btn-outline-success" data-dismiss="modal">Cancel
                            </button>
                            <a href="/service?action=deleteObj&id=${obj.idService}">
                                <button type="button" class="btn btn-outline-danger">Delete</button>
                            </a>
                        </div>
                    </div>
                </div>
            </div>
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
        $('#tableService').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 7
        });
    });
</script>
</body>
</html>