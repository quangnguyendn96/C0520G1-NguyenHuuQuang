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
    <title>Create Employee</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="../css/style.css">
    <link rel="stylesheet" href="../lib_bootstrap/css/bootstrap.min.css">
</head>
<body>
<div class="container-fluid">
    <div class="row justify-content-center">
        <div class="col-5 " style="margin-left: 30px">
            <h2 style="text-align: center">Create New Employee</h2>
            <form method="post">
                <div class="input-group row">
                    <label for="colFormLabel" class="col-sm-2 col-form-label-sm">Id Employee</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="colFormLabel" name="idEmployee">
                    </div>
                </div>

                <div class="input-group row">
                    <label for="nameEmployee" class="col-sm-2 col-form-label-sm">Name Employee</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="nameEmployee" name="nameEmployee">
                    </div>
                </div>

                <div class="input-group row">
                    <label for="idPositive" class="col-sm-2 col-form-label-sm">Id Positive</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="idPositive" name="idPositive">
                    </div>
                </div>

                <div class="input-group row">
                    <label for="idDegreeEducation" class="col-sm-2 col-form-label-sm">Id Degree Education</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="idDegreeEducation" name="idDegreeEducation">
                    </div>
                </div>

                <div class="input-group row">
                    <label for="contractDate" class="col-sm-2 col-form-label-sm">Id Division</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="contractDate" name="idDivision">
                    </div>
                </div>
                <div class="input-group row">
                    <label for="dayOfBirth" class="col-sm-2 col-form-label-sm ">Day of Birth</label>
                    <div class="col-sm-10">
                        <input type="date" class="form-control form-control-sm" id="dayOfBirth"
                               name="dayOfBirth">
                    </div>
                </div>
                <div class="input-group row">
                    <label for="money" class="col-sm-2 col-form-label-sm">Identity Card Employee</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="money" name="identityCardEmployee">
                    </div>
                </div>
                <div class="input-group row">
                    <label for="salary" class="col-sm-2 col-form-label-sm">Salary</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="salary" name="salary">
                    </div>
                </div>

                <div class="input-group row">
                    <label for="phoneNumber" class="col-sm-2 col-form-label-sm">Phone Number</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="phoneNumber" name="phoneNumber">
                    </div>
                </div>

                <div class="input-group row">
                    <label for="emailEmployee" class="col-sm-2 col-form-label-sm">Email Employee"</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="emailEmployee" name="emailEmployee">
                    </div>
                </div>

                <div class="input-group row">
                    <label for="addressEmployee" class="col-sm-2 col-form-label-sm">Address Employee</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="addressEmployee" name="addressEmployee">
                    </div>
                </div>

                <div class="input-group row">
                    <label for="username" class="col-sm-2 col-form-label-sm">Username"</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="username" name="username">
                    </div>
                </div>
                <div class="input-group row">
                    <label for="username" class="col-sm-2 col-form-label-sm"></label>
                    <div class="col-sm-10">
                        <button type="submit" class="btn btn-success btn-lg">Sign in</button>
                        <a href="/home">
                            <button type="button" class="btn btn-light btn-lg" style="width: 200px;">Back to home
                            </button>
                        </a>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
<script src="../lib_bootstrap/js/jquery-3.5.1.min.js"></script>
<script src="../lib_bootstrap/js/bootstrap.min.js"></script>
</body>
</html>
