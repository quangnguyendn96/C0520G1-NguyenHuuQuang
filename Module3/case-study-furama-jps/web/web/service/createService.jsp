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
    <title>Create Service</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="../css/style.css">
    <link rel="stylesheet" href="../lib_bootstrap/css/bootstrap.min.css">
</head>
<body>
<div class="container-fluid">
    <div class="row justify-content-center">
        <div class="col-5 " style="margin-left: 30px">
            <h2 style="text-align: center">Create New Service</h2>
            <form method="post">
                <div class="input-group row">
                    <label for="colFormLabel" class="col-sm-2 col-form-label-sm">Id Service</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="colFormLabel" name="idService">
                    </div>
                </div>

                <div class="input-group row">
                    <label for="employee" class="col-sm-2 col-form-label-sm">Name Service</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="employee" name="nameService">
                    </div>
                </div>

                <div class="input-group row">
                    <label for="areaService" class="col-sm-2 col-form-label-sm">Area Service</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="areaService" name="areaService">
                    </div>
                </div>

                <div class="input-group row">
                    <label for="numberFloor" class="col-sm-2 col-form-label-sm">Number Floor</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="numberFloor" name="numberFloor">
                    </div>
                </div>
                <div class="input-group row">
                    <label for="maximumCustomer" class="col-sm-2 col-form-label-sm">Maximum Customer</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="maximumCustomer" name="maximumCustomer">
                    </div>
                </div>

                <div class="input-group row">
                    <label for="costRent" class="col-sm-2 col-form-label-sm ">Cost Rent</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="costRent"
                               name="costRent">
                    </div>
                </div>

                <div class="input-group row">
                    <label for="idTypeService" class="col-sm-2 col-form-label-sm">Id Type Service</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="idTypeService" name="idTypeService">
                    </div>
                </div>

                <div class="input-group row">
                    <label for="idTypeRent" class="col-sm-2 col-form-label-sm">Id Type Rent</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="idTypeRent" name="idTypeRent">
                    </div>
                </div>

                <div class="input-group row">
                    <label for="descriptionOtherConvenience" class="col-sm-2 col-form-label-sm">Description Other Convenience</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="descriptionOtherConvenience" name="descriptionOtherConvenience">
                    </div>
                </div>

                <div class="input-group row">
                    <label for="poolArea" class="col-sm-2 col-form-label-sm">Pool Area</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="poolArea" name="poolArea">
                    </div>
                </div>

                <div class="input-group row">
                    <label for="standardRoom" class="col-sm-2 col-form-label-sm">Standard Room</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="standardRoom" name="standardRoom">
                    </div>
                </div>

                <div class="input-group row">
                    <label class="col-sm-2 col-form-label-sm"></label>
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
