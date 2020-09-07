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
    <link rel="stylesheet" href="../../lib_bootstrap/datatables/css/dataTables.bootstrap4.min.css" />
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
            <a href="/contract?action=createObj">
                <button type="button" class="btn btn-outline-success" style="height: 50px">Create new contract</button>
            </a>
            <br>
            <table id="tableContract" class="table table-hover">
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
                <c:forEach var="obj" items="${listObj}">
                    <tr>
                        <th scope="col">${obj.idContract}</th>
                        <td scope="col">${obj.idEmployee}</td>
                        <td scope="col">${obj.idCustomer}</td>
                        <td scope="col">${obj.idService }</td>
                        <td scope="col">${obj.contractDate }</td>
                        <td scope="col">${obj.contractExpire}</td>
                        <td scope="col">${obj.depositMoney}</td>
                        <td scope="col">${obj.totalMoney}</td>
                        <td scope="col"><a href="/contract?action=editObj&id=${obj.idContract}">
                            <button type="button" class="btn btn-outline-warning">Edit</button>
                        </a></td>
<%--                        button delete--%>
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
                                            <h5>Contract : ${obj.idContract}</h5>
                                        </div>
                                        <div class="modal-footer">
                                            <button type="button" class="btn btn-secondary" data-dismiss="modal">
                                                Cancel
                                            </button>
                                            <a href="/contract?action=deleteObj&&id=${obj.idContract}">
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
        <div class="col-1"></div>
    </div>
</div>
<script src="../../lib_bootstrap/js/jquery-3.5.1.min.js"></script>
<script src="../../lib_bootstrap/js/bootstrap.min.js"></script>
<script src="../../lib_bootstrap/datatables/js/jquery.dataTables.min.js"></script>
<script src="../../lib_bootstrap/datatables/js/dataTables.bootstrap4.min.js"></script>
<script>
    $(document).ready(function() {
        $('#tableStudent').dataTable( {
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 7
        } );
    } );
</script>
</body>
</html>