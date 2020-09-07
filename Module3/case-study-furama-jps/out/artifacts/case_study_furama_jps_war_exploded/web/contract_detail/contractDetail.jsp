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
    <link rel="stylesheet" href="../../css/style.css">
    <link rel="stylesheet" href="../../lib_bootstrap/css/bootstrap.min.css">
</head>
<body>
<div class="container-fluid">
    <div class="row justify-content-center"
         style="background-image: url('../../image/6.jpg'); background-repeat: no-repeat;background-size :100% 100%; height: 750px">
        <div class="col-5 " style="margin-left: 30px">
            <h2 style="text-align: center; color: white">Register Contract</h2>
            <form method="post">
                <div class="input-group row">
                    <label for="colFormLabel" class="col-sm-2 col-form-label-sm ">Id Contract Detail</label>
                    <div class="col-sm-10">
                        <input type="email" class="form-control form-control-sm" id="colFormLabel">
                    </div>
                </div>
                <div class="input-group row">
                    <label for="contract" class="col-sm-2 col-form-label-sm ">Id Contract</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="contract">
                    </div>
                </div>
                <div class="input-group row">
                    <label for="service" class="col-sm-2 col-form-label-sm ">Id Service Included</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="service">
                    </div>
                </div>
                <div class="input-group row">
                    <label for="amount" class="col-sm-2 col-form-label-sm ">Amount</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="amount">
                    </div>
                </div>
                <div class="input-group row">
                    <label for="amount" class="col-sm-2 col-form-label-sm text-white"></label>
                    <div class="col-sm-10">
                        <button type="submit" class="btn btn-success" style="width: 200px">Create New</button>
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
