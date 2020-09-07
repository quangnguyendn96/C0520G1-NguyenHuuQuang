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
    <link rel="stylesheet" href="../../lib_bootstrap/css/bootstrap.min.css">

</head>
<body>

<div class="container-fluid">
    <div class="row justify-content-center"
         style="background-image: url('../../image/7.jpg'); background-repeat: no-repeat;background-size :100% 900px ">
        <div class="col-5" style="margin-left: 30px">
            <h2>Create New Customer</h2>
            <form method="post">
                <div class="input-group row">
                    <label for="inputId" class="col-sm-2 col-form-label-sm ">Id customer</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="inputId" name="idCustomer">
                    </div>
                </div>
                <div class="input-group row">
                    <label for="selectIdType" class="col-sm-2 col-form-label-sm ">Id Type Customer</label>
                    <div class="col-sm-10">
                        <select class="form-control" id="selectIdType" name="idTypeCustomer">
                            <option value="1">1:Diamond</option>
                            <option value="2">2:Platinum</option>
                            <option value="3">3:Gold</option>
                            <option value="4">4:Silver</option>
                            <option value="5">5:Member</option>
                        </select>
                    </div>
                </div>
                <div class="input-group row">
                    <label for="inputName" class="col-sm-2 col-form-label-sm ">Name Customer</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="inputName" name="nameCustomer">
                    </div>
                </div>
                <div class="input-group row">
                    <label for="inputDate" class="col-sm-2 col-form-label-sm ">Day Of Birth Customer</label>
                    <div class="col-sm-10">
                        <input type="date" class="form-control form-control-sm" id="inputDate"
                               name="dayOfBirthCustomer">
                    </div>
                </div>
                <div class="input-group row">
                    <label for="gender" class="col-sm-2 col-form-label-sm ">Gender Customer</label>
                    <div class="col-sm-10">
                        <select class="form-control form-control-sm" id="gender" name="genderCustomer">
                            <option value="0">0:Male</option>
                            <option value="1">1:Female</option>
                        </select>
                    </div>
                </div>
                <div class="input-group row">

                    <label for="identify" class="col-sm-2 col-form-label-sm ">Id social Customer</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="identify" name="identityCard">
                    </div>
                </div>
                <div class="input-group row">
                    <label for="inputEmail" class="col-sm-2 col-form-label-sm ">Email Customer</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="inputEmail" name="emailCustomer">
                    </div>
                </div>
                <div class="input-group row">
                    <label for="inputPhone" class="col-sm-2 col-form-label-sm ">Phone Customer</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="inputPhone" name="phoneCustomer">
                    </div>
                </div>
                <div class="input-group row">
                    <label for="inputAddress" class="col-sm-2 col-form-label-sm ">Address Customer</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="inputAddress" name="addCustomer">
                    </div>
                </div>
                <div class="input-group row">
                    <label for="inputAddress" class="col-sm-2 col-form-label-sm "></label>
                    <div class="col-sm-10">
                        <button type="submit" class="btn btn-primary btn-lg">Create</button>
                        <a href="/home">
                            <button type="button" class="btn btn-success btn-lg">Back to home</button>
                        </a>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>

<script src="../../lib_bootstrap/js/jquery-3.5.1.min.js"></script>
<script src="../../lib_bootstrap/js/bootstrap.min.js"></script>
</body>
</html>
