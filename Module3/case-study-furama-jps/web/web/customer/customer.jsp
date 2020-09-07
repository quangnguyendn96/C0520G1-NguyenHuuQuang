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
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
          integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css"
          integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU" crossorigin="anonymous">
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body>


<%--<div class="alert alert-primary justify-content-center align-items-center" style="height: 200px" role="alert">--%>
<%--    ${requestScope["delete"]}--%>
<%--    <button type="button" class="close" data-dismiss="alert" aria-label="Close">--%>
<%--        <span aria-hidden="true">&times;</span>--%>
<%--    </button>--%>
<%--</div>--%>

<h1 style="text-align: center; color: cadetblue">List Customer</h1>
<div class="row">
    <div class="col-3">
        <a href="/customer?action=createObj">
            <button type="button" class="btn btn-outline-success" style="height: 50px">Create new customer</button>
        </a>
        <a href="/home">
            <button type="button" class="btn btn-outline-success" style="height: 50px">Back to home</button>
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
            <th scope="col"><a href="/customer?action=viewObjById&id=${customer.idCustomer}">
                <button>${customer.idCustomer}</button>
            </a></th>
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
                <button type="button" class="btn btn-outline-warning" data-toggle="modal" data-target="#exampleModal">
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
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
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
<%--<div aria-live="polite" aria-atomic="true" class="d-flex justify-content-center align-items-center"--%>
<%--     style="height: 200px;">--%>

<%--    <!-- Then put toasts within -->--%>

<%--    <div class="toast" data-autohide="false">--%>
<%--        <div class="toast-header">--%>
<%--            <strong class="mr-auto text-primary">Toast Header</strong>--%>
<%--            <small class="text-muted">5 mins ago</small>--%>
<%--            <button type="button" class="ml-2 mb-1 close" data-dismiss="toast">&times;</button>--%>
<%--        </div>--%>
<%--        <div class="toast-body">--%>
<%--            ${requestScope["delete"]}--%>
<%--        </div>--%>
<%--    </div>--%>
<%--</div>--%>

<%--<script>--%>
<%--    function $(document) {--%>

<%--    }--%>

<%--    $(document).ready(function(){--%>
<%--        $('.toast').toast('show');--%>
<%--    });--%>

<%--// </script>--%>

<script src="../../lib_bootstrap/js/jquery-3.5.1.min.js"></script>
<script src="../../lib_bootstrap/js/bootstrap.min.js"></script>

</body>
</html>
