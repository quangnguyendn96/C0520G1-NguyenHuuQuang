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
    <link rel="stylesheet" href="../lib_bootstrap/css/bootstrap.min.css">

</head>
<body>
<div class="col-3">
    <a href="/home">
        <button type="button" class="btn btn-outline-success" style="height: 50px">Back to home</button>
    </a>
</div>
<div class="container-fluid">
    <div class="row justify-content-center"
         style="background-image: url('../image/7.jpg'); background-repeat: no-repeat;background-size :100% 900px ">

        <div class="col-8" style="margin-left: 30px">
            <form method="post">
                <div class="input-group">
                    <label for="inputId">Id customer </label>
                    <input type="text" class="form-control" id="inputId" name="idCustomer">
                </div>
                <div class="input-group">
                    <label for="selectIdType">Id Type Customer</label>
                    <select class="form-control" id="selectIdType" name="idTypeCustomer">
                        <option value="1">1:Diamond</option>
                        <option value="2">2:Platinum</option>
                        <option value="3">3:Gold</option>
                        <option value="4">4:Silver</option>
                        <option value="5">5:Member</option>
                    </select>
                </div>
                <div class="input-group">
                    <label for="inputName">Name Customer</label>
                    <input type="text" class="form-control" id="inputName" name="nameCustomer">
                </div>
                <div class="input-group">
                    <label for="inputDate">Day Of Birth Customer</label>
                    <input type="date" class="form-control" id="inputDate" name="dayOfBirthCustomer">
                </div>
                <div class="input-group">
                    <label for="gender">Gender Customer</label>
                    <select class="form-control" id="gender" name="genderCustomer">
                        <option value="0">0:Male</option>
                        <option value="1">1:Female</option>
                    </select>
                </div>
                <div class="input-group">
                    <label for="identify">Id social Customer</label>
                    <input type="text" class="form-control" id="identify" name="identityCard">
                </div>
                <div class="input-group">
                    <label for="inputEmail">Email Customer</label>
                    <input type="text" class="form-control" id="inputEmail" name="emailCustomer">
                </div>
                <div class="input-group">
                    <label for="inputPhone">Phone Customer</label>
                    <input type="text" class="form-control" id="inputPhone" name="phoneCustomer">
                </div>
                <div class="input-group">
                    <label for="inputAddress">Address Customer</label>
                    <input type="text" class="form-control" id="inputAddress" name="addCustomer">
                </div>
                <button type="submit" class="btn btn-primary">Create</button>
            </form>
        </div>
    </div>
</div>

<script src="../lib_bootstrap/js/jquery-3.5.1.min.js"></script>
<script src="../lib_bootstrap/js/bootstrap.min.js"></script>
</body>
</html>
