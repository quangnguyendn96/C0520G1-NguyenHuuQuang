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
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/lib_bootstrap/css/bootstrap.min.css">
</head>
<body>
<div class="container-fluid" style="height: 66px">
    <div class="fixed-top">
        <nav class="navbar navbar-expand-lg navbar-light" style="background-color: #e3f2fd;">
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item active">
                        <a class="nav-link" href="/home?action=employee">Employee <span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item active">
                        <a class="nav-link" href="/home?action=customer">Customer <span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item active">
                        <a class="nav-link" href="/home?action=service">Service <span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item active">
                        <a class="nav-link" href="#">Contract <span class="sr-only">(current)</span></a>
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
<div class="container-fluid">
    <%--    phần mở đầu carousel với logo--%>
    <div class="row">
        <div class="col-sm-3" style="height: 300px">
            <a href="/home">
                <a href="#" class="btn btn-light btn-lg active" role="button" style="height: 300px" aria-pressed="true"><img
                        src="${pageContext.request.contextPath}/image/logo.png" style="height: 280px;width: 100%"></a>
            </a>
        </div>
        <div class="col-sm-9" style="height: 300px">
            <div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <img src="${pageContext.request.contextPath}/image/37836676.jpg"
                             style="height: 300px;width: 100%"
                             alt="Responsive image">
                    </div>
                    <div class="carousel-item">
                        <img src="${pageContext.request.contextPath}/image/2.jpg" style="height: 300px;width: 100%"
                             alt="...">
                    </div>
                    <div class="carousel-item">
                        <img src="${pageContext.request.contextPath}/image/206455597.jpg"
                             style="height: 300px;width: 100%"
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
