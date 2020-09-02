<%--
  Created by IntelliJ IDEA.
  User: quangnguyen
  Date: 9/3/20
  Time: 00:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create New Customer</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/lib_bootstrap/css/bootstrap.min.css">
</head>
<body>
<div class="row">
    <div class="col-8" style="margin-left: 30px">
        <form method="post">
            <div class="form-group">
                <label for="inputId">Id customer </label>
                <input type="text" class="form-control" id="inputId">
            </div>
            <div class="form-group">
                <label for="selectIdType">Id Type Customer</label>
                <select class="form-control" id="selectIdType">
                    <option>1:Diamond</option>
                    <option>2:Plantinum</option>
                    <option>3:Gold</option>
                    <option>4:Silver</option>
                    <option>5:Member</option>
                </select>
            </div>
            <div class="form-group">
                <label for="inputName">Name Customer</label>
                <input type="text" class="form-control" id="inputName" >
            </div>
            <div class="form-group">
                <label for="inputDate">Day Of Birth Customer</label>
                <input type="text" class="form-control" id="inputDate"">
            </div>
            <div class="form-group">
                <label for="gender">Gender Customer</label>
                <select class="form-control" id="gender">
                    <option>0:Male</option>
                    <option>1:Female</option>
                </select>
            </div>
            <div class="form-group">
                <label for="identify">Id social Customer</label>
                <input type="text" class="form-control" id="identify">
            </div>
            <div class="form-group">
                <label for="inputEmail">Email Customer</label>
                <input type="text" class="form-control" id="inputEmail">
            </div>
            <div class="form-group">
                <label for="inputPhone">Phone Customer</label>
                <input type="text" class="form-control" id="inputPhone">
            </div>
            <div class="form-group">
                <label for="inputAddres">Address Customer</label>
                <input type="text" class="form-control" id="inputAddres">
            </div>
            <button type="submit" class="btn btn-primary">Create</button>
        </form>
    </div>
</div>


<script src="${pageContext.request.contextPath}/lib_bootstrap/js/jquery-3.5.1.min.js"></script>
<script src="${pageContext.request.contextPath}/lib_bootstrap/js/bootstrap.min.js"></script>
</body>
</html>
