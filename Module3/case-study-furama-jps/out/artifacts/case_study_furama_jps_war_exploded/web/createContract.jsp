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
    <title>Create New Contract</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="../css/style.css">
    <link rel="stylesheet" href="../lib_bootstrap/css/bootstrap.min.css">
</head>
<body>
<div class="container-fluid">
    <div class="row justify-content-center"
         style="background-image: url('../image/4.jpg'); background-repeat: no-repeat;background-size :100% 900px ">
        <div class="col-5 " style="margin-left: 30px">
            <h2 style="text-align: center; color: white">Register Contract</h2>
            <form method="post">
                <div class="input-group row">
                    <label for="colFormLabel" class="col-sm-2 col-form-label-sm text-white">Id Contract</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="colFormLabel" name="idContract">
                    </div>
                </div>

                <div class="input-group row">
                    <label for="employee" class="col-sm-2 col-form-label-sm text-white">Id Employee</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="employee" name="idEmployee">
                    </div>
                </div>
                <div class="input-group row">
                    <label for="customer" class="col-sm-2 col-form-label-sm text-white">Id Customer</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="customer" name="idCustomer">
                    </div>
                </div>
                <div class="input-group row">
                    <label for="service" class="col-sm-2 col-form-label-sm text-white">Id Service</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="service" name="idService">
                    </div>
                </div>
                <div class="input-group row">
                    <label for="contractDate" class="col-sm-2 col-form-label-sm text-white">Contract date</label>
                    <div class="col-sm-10">
                        <input type="date" class="form-control form-control-sm" id="contractDate" name="contractDate">
                    </div>
                </div>
                <div class="input-group row">
                    <label for="contractExpire" class="col-sm-2 col-form-label-sm text-white">Contract Expire</label>
                    <div class="col-sm-10">
                        <input type="date" class="form-control form-control-sm" id="contractExpire"
                               name="contractExpire">
                    </div>
                </div>
                <div class="input-group row">
                    <label for="money" class="col-sm-2 col-form-label-sm text-white">Deposit Money</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="money" name="depositMoney">
                    </div>
                </div>
                <div class="input-group row">
                    <label for="totalMoney" class="col-sm-2 col-form-label-sm text-white">Total Money</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="totalMoney" name="totalMoney">
                    </div>
                </div>
                <div class="input-group row">
                    <label for="totalMoney" class="col-sm-2 col-form-label-sm text-white"></label>
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
