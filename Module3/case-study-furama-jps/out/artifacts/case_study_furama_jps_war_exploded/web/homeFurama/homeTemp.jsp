
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Furama Resort</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="../../lib_bootstrap/css/bootstrap.min.css">
    <style>
        .form-dark .font-small {
            font-size: 0.8rem; }

        .form-dark [type="radio"] + label,
        .form-dark [type="checkbox"] + label {
            font-size: 0.8rem; }

        .form-dark [type="checkbox"] + label:before {
            top: 2px;
            width: 15px;
            height: 15px; }

        .form-dark .md-form label {
            color: #fff; }

        .form-dark input[type=email]:focus:not([readonly]) {
            border-bottom: 1px solid #00C851;
            -webkit-box-shadow: 0 1px 0 0 #00C851;
            box-shadow: 0 1px 0 0 #00C851; }

        .form-dark input[type=email]:focus:not([readonly]) + label {
            color: #fff; }

        .form-dark input[type=password]:focus:not([readonly]) {
            border-bottom: 1px solid #00C851;
            -webkit-box-shadow: 0 1px 0 0 #00C851;
            box-shadow: 0 1px 0 0 #00C851; }

        .form-dark input[type=password]:focus:not([readonly]) + label {
            color: #fff; }

        .form-dark input[type="checkbox"] + label:before {
            content: '';
            position: absolute;
            top: 0;
            left: 0;
            width: 17px;
            height: 17px;
            z-index: 0;
            border: 1.5px solid #fff;
            border-radius: 1px;
            margin-top: 2px;
            -webkit-transition: 0.2s;
            transition: 0.2s; }

        .form-dark input[type="checkbox"]:checked + label:before {
            top: -4px;
            left: -3px;
            width: 12px;
            height: 22px;
            border-style: solid;
            border-width: 2px;
            border-color: transparent #00c851 #00c851 transparent;
            -webkit-transform: rotate(40deg);
            -ms-transform: rotate(40deg);
            transform: rotate(40deg);
            -webkit-backface-visibility: hidden;
            -webkit-transform-origin: 100% 100%;
            -ms-transform-origin: 100% 100%;
            transform-origin: 100% 100%; }

        .form-dark .modal-header {
            border-bottom: none;
        }
    </style>
</head>
<body>

<div class="modal fade" id="darkModalForm" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
     aria-hidden="true">
    <div class="modal-dialog form-dark" role="document">
        <!--Content-->
        <div class="modal-content card card-image" style="background-image: url('https://mdbootstrap.com/img/Photos/Others/pricing-table%20(7).jpg');">
            <div class="text-white rgba-stylish-strong py-5 px-5 z-depth-4">
                <!--Header-->
                <div class="modal-header text-center pb-4">
                    <h3 class="modal-title w-100 white-text font-weight-bold" id="myModalLabel"><strong>SIGN</strong> <a
                            class="green-text font-weight-bold"><strong> UP</strong></a></h3>
                    <button type="button" class="close white-text" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <!--Body-->
                <div class="modal-body">
                    <!--Body-->
                    <div class="md-form mb-5">
                        <input type="email" id="Form-email5" class="form-control validate white-text">
                        <label data-error="wrong" data-success="right" for="Form-email5">Your email</label>
                    </div>

                    <div class="md-form pb-3">
                        <input type="password" id="Form-pass5" class="form-control validate white-text">
                        <label data-error="wrong" data-success="right" for="Form-pass5">Your password</label>
                        <div class="form-group mt-4">
                            <input class="form-check-input" type="checkbox" id="checkbox624">
                            <label for="checkbox624" class="white-text form-check-label">Accept the<a href="#" class="green-text font-weight-bold">
                                Terms and Conditions</a></label>
                        </div>
                    </div>

                    <!--Grid row-->
                    <div class="row d-flex align-items-center mb-4">

                        <!--Grid column-->
                        <div class="text-center mb-3 col-md-12">
                            <button type="button" class="btn btn-success btn-block btn-rounded z-depth-1">Sign up</button>
                        </div>
                        <!--Grid column-->

                    </div>
                    <!--Grid row-->

                    <!--Grid row-->
                    <div class="row">

                        <!--Grid column-->
                        <div class="col-md-12">
                            <p class="font-small white-text d-flex justify-content-end">Have an account? <a href="#" class="green-text ml-1 font-weight-bold">
                                Log in</a></p>
                        </div>
                        <!--Grid column-->

                    </div>
                    <!--Grid row-->

                </div>
            </div>
        </div>
        <!--/.Content-->
    </div>
</div>
<!-- Modal -->

<div class="text-center">
    <a href="" class="btn btn-default btn-rounded" data-toggle="modal" data-target="#darkModalForm">Launch modal
        register Form</a>
</div>
<script src="${pageContext.request.contextPath}/lib_bootstrap/js/jquery-3.5.1.min.js"></script>
<script src="${pageContext.request.contextPath}/lib_bootstrap/js/bootstrap.min.js"></script>
</body>
</html>
