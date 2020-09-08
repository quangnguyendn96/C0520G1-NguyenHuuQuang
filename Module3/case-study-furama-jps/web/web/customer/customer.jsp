<%--
  Created by IntelliJ IDEA.
  User: quangnguyen
  Date: 9/3/20
  Time: 21:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Customer</title>
    <link rel="stylesheet" href="../../css/customer.css">
    <link rel="stylesheet" href="../../lib_bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="../../lib_bootstrap/datatables/css/dataTables.bootstrap4.min.css"/>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
          integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css"
          integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU" crossorigin="anonymous">
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body>


<h1 style="text-align: center; color: cadetblue">List Customer</h1>
<div class="container-fluid">
    <div class="row">
        <div class="col-2" style="background: #bee5eb">
            <div class="col-12" style="height: 100px">
                <a href="/customer?action=createObj">
                    <button type="button" class="btn btn-outline-success" style="height: 50px;width: 200px">Create new
                        customer
                    </button>
                </a>
            </div>
            <div class="col-12" style="height: 100px">
                <a href="/home">
                    <button type="button" class="btn btn-outline-success" style="height: 50px;width: 200px">Back to home
                    </button>
                </a>
            </div>
            <div class="col-12" style="height: 100px">
                <a href="/customer?action=showAll">
                    <button type="button" class="btn btn-outline-success" style="height: 50px;width: 200px">Show all
                        information customer
                    </button>
                </a>
            </div>
            <div class="col-9">
                <div class="container h-100">
                    <div class="d-flex justify-content-center h-100">
                        <div class="searchbar">
                            <input class="search_input" type="text" name="" placeholder="Search...">
                            <a href="#" class="search_icon"><i class="fas fa-search"></i></a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-10">
            <table id="tableCustomer" class="table table-striped table-hover">
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
                        <th scope="col">${customer.idCustomer}</th>
                        <td scope="col">${customer.idTypeCustomer}</td>
                        <td scope="col">${customer.nameCustomer}</td>
                        <td scope="col">${customer.dayOfBirthCustomer}</td>
                        <td scope="col">${customer.genderCustomer}</td>
                        <td scope="col">${customer.identityCard}</td>
                        <td scope="col">${customer.phoneCustomer}</td>
                        <td scope="col">${customer.emailCustomer}</td>
                        <td scope="col">${customer.addCustomer}</td>
                        <td scope="col"><a href="/customer?action=editObj&id=${customer.idCustomer}">
                            <button type="button" class="btn btn-outline-warning">Edit</button>
                        </a></td>
                        <td scope="col">
                                <%--                button delete--%>
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
                                                <%--                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">--%>
                                                <%--                                    <span aria-hidden="true">&times</span>--%>
                                                <%--                                </button>--%>
                                        </div>
                                        <div class="modal-body">
                                            <h5>Customer : ${customer.nameCustomer}</h5>
                                        </div>
                                        <div class="modal-footer">
                                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancel
                                            </button>
                                            <a href="/customer?action=deleteObj&id=${customer.idCustomer}">
                                                <button type="button" class="btn btn-primary">Delete</button>
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
            <script>
                $(document).ready(function () {
                    $('#tableCustomer').dataTable({
                        "dom": 'lrtip',
                        "lengthChange": false,
                        "pageLength": 7
                    });
                });
            </script>
        </div>
    </div>
</div>
<script src="../../lib_bootstrap/js/jquery-3.5.1.min.js"></script>
<script src="../../lib_bootstrap/js/bootstrap.min.js"></script>
<script src="../../lib_bootstrap/datatables/js/jquery.dataTables.min.js"></script>
<script src="../../lib_bootstrap/datatables/js/dataTables.bootstrap4.min.js"></script>
</body>
</html>
