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
    <link rel="stylesheet" href="${pageContext.request.contextPath}/lib_bootstrap/css/bootstrap.min.css">
</head>
<body>

<div class="container-fluid">
    <div class="row mt-2">
        <div class="col-1"></div>
        <div class="col-2" style="height: 100px">
            <a href="/home">
                <img src="${pageContext.request.contextPath}/image/logo.png" style="height: 100px;width: 80px;font-weight: lighter"></a>
            </a>
        </div>
        <div class="col-3">
            <a href="/home">
                <img src="${pageContext.request.contextPath}/image/8.png" style="height: 90px;width: 240px"></a>
            </a>
        </div>
        <div class="col-2" style="font-size: 12px">
            <p>
                103 - 105 Vo Nguyen Giap Street,<br>
                Khue My Ward, Ngu Hanh Son District,<br>
                Danang City, Vietnam,<br>
                7,0 km from Danang Airport
            <p>
        </div>
        <div class="col-2" style="font-size: 12px">
            <p>84-236-3847 333/888</p>
            <p>reservation@furamavietnam.com</p>
        </div>
        <div class="col-2"></div>
    </div>
    <div class="row">
        <div class="col-12 mt-0">
            <nav class="navbar navbar-expand-lg navbar-light" style="background-color: #046056">
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav mr-lg-5">
                        <li class="nav-item active" style="width: 100px">
                        </li>
                        <li class="nav-item active">
                            <a class="nav-link" href="/home" style="color: white;font-size:20px;width: 140px;font-weight: lighter">Home <span class="sr-only">(current)</span></a>
                        </li>
                        <li class="nav-item active">
                            <a class="nav-link" href="/employee" style="color: white;font-size:20px;width: 160px;font-weight: lighter">Employee <span class="sr-only">(current)</span></a>
                        </li>
                        <li class="nav-item active">
                            <a class="nav-link" href="/customer" style="color: white;font-size:20px;width: 160px;font-weight: lighter">Customer <span class="sr-only">(current)</span></a>
                        </li>
                        <li class="nav-item active">
                            <a class="nav-link" href="/service" style="color: white;font-size:20px;width: 140px;font-weight: lighter">Service <span class="sr-only">(current)</span></a>
                        </li>
                        <li class="nav-item active">
                            <a class="nav-link" href="/contract" style="color: white;font-size:20px;width: 160px;font-weight: lighter">Contract <span class="sr-only">(current)</span></a>
                        </li>
                    </ul>
                </div>
                <form class="form-inline my-2 my-lg-0">
                    <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search"
                           style="width: 300px">
                    <button class="btn btn-outline-success my-2 my-sm-2" type="submit">Search</button>
                </form>
            </nav>
        </div>
    </div>

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
</div>

<script src="${pageContext.request.contextPath}/lib_bootstrap/js/jquery-3.5.1.min.js"></script>
<script src="${pageContext.request.contextPath}/lib_bootstrap/js/bootstrap.min.js"></script>
</body>
</html>
