<%--
  Created by IntelliJ IDEA.
  User: quangnguyen
  Date: 9/2/20
  Time: 21:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Furama Resort</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="../../css/style.css">
    <link rel="stylesheet" href="../../lib_bootstrap/css/bootstrap.min.css">

</head>
<body style="position: relative">
<%@ include file="../../common/header.jsp" %>
<div class="container-fluid">
    <%--    phần mở đầu carousel với logo--%>
    <div class="row">
        <div class="col-12" style="height: 600px">
            <div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <img src="${pageContext.request.contextPath}/image/9.png"
                             style="height: 600px;width: 100%"
                             alt="Responsive image">
                    </div>
                    <div class="carousel-item">
                        <img src="${pageContext.request.contextPath}/image/2.jpg" style="height: 600px;width: 100%"
                             alt="...">
                    </div>
                    <div class="carousel-item">
                        <img src="${pageContext.request.contextPath}/image/206455597.jpg"
                             style="height: 600px;width: 100%"
                             alt="...">
                    </div>
                </div>
                <a class="carousel-control-prev" href="#carouselExampleControls" role="button" data-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="carousel-control-next" href="#carouselExampleControls" role="button" data-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                </a>
            </div>


            <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
                <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                <span class="sr-only">Previous</span>
            </a>
            <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
                <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                <span class="sr-only">Next</span>
            </a>
        </div>
    </div>
</div>
<hr>

<!-- Modal -->
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
