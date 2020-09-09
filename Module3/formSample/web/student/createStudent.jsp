<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
</p>
<div class="container-fluid">
    <div class="row justify-content-center">
        <div class="col-5 " style="margin-left: 30px;background: #ffdef2">
            <%--            sửa tên --%>
            <h2 style="text-align: center">Create New Service</h2>
            <form method="post">
                <%--col_1--%>
                <div class="input-group row">
                    <label for="col1" class="col-sm-2 col-form-label-sm">Id </label>
                    <div class="col-sm-10">
                        <input type="text" readonly class="form-control form-control-sm" id="col1" name="id"
                               value="${obj.id}">
                        <p>
                            <c:if test='${requestScope["message"] != null}'>
                                <span style="color: red" class="message">${requestScope["message"]}</span>
                            </c:if>
                        </p>
                    </div>
                </div>
                <%--col2--%>
                <div class="input-group row">
                    <label for="col2" class="col-sm-2 col-form-label-sm">Name </label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="col2" name="name"
                               value="${obj.name}">
                        <p>
                            <c:if test='${requestScope["message1"] != null}'>
                                <span style="color: red" class="message">${requestScope["message1"]}</span>
                            </c:if>
                        </p>
                    </div>
                    <p>
                </div>
                <%--col_3--%>
                <div class="input-group row">
                    <label for="col3" class="col-sm-2 col-form-label-sm">Name Class</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="col3" name="className"
                               value="${obj.className}">
                        <p>
                            <c:if test='${requestScope["message2"] != null}'>
                                <span style="color: red" class="message">${requestScope["message2"]}</span>
                            </c:if>
                        </p>
                    </div>
                </div>
                <%--col_4--%>
                <div class="input-group row">
                    <label for="col4" class="col-sm-2 col-form-label-sm">gender</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="col4" name="gender"
                               value="${obj.gender}">
                    </div>
                </div>
                <%--    col_5--%>
                <div class="input-group row">
                    <label for="col5" class="col-sm-2 col-form-label-sm">Id Card</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="col5" name="idCard"
                               value="${obj.idCard}">
                        <p>
                            <c:if test='${requestScope["message3"] != null}'>
                                <span style="color: red" class="message">${requestScope["message3"]}</span>
                            </c:if>
                        </p>
                    </div>
                </div>
                <%--col_6--%>
                <div class="input-group row">
                    <label for="col6" class="col-sm-2 col-form-label-sm">Phone Number</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="col6" name="phoneNumber"
                               value="${obj.phoneNumber}">
                        <p>
                            <c:if test='${requestScope["message4"] != null}'>
                                <span style="color: red" class="message">${requestScope["message4"]}</span>
                            </c:if>
                        </p>
                    </div>
                </div>
                <%--col_7--%>
                <div class="input-group row">
                    <label for="col7" class="col-sm-2 col-form-label-sm">Day Of Birth</label>
                    <div class="col-sm-10">
                        <input type="date" class="form-control form-control-sm" id="col7" name="dayOfBirth"
                               value="${obj.dayOfBirth}">
                    </div>
                </div>

                <div class="input-group row">
                    <label class="col-sm-2 col-form-label-sm"></label>
                    <div class="col-sm-10">
                        <p>
                            <c:if test='${requestScope["message5"] != null}'>
                                <span style="color: lawngreen" class="message">${requestScope["message5"]}</span>
                            </c:if>
                        </p>
                    </div>
                </div>

                <div class="input-group row">
                    <label class="col-sm-2 col-form-label-sm"></label>
                    <div class="col-sm-10">
                        <button type="submit" class="btn btn-success btn-lg">Sign in</button>
                        <a href="/student">
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
