<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: quangnguyen
  Date: 9/6/20
  Time: 00:21
  To change this template use File | Settings | File Templates.
--%>
<head>
    <title>Edit Contract</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="../../lib_bootstrap/css/bootstrap.min.css">

</head>
<body>
<%@ include file="../../common/header.jsp" %>
<div class="container-fluid">
    <div class="row justify-content-center">
        <div class="col-5" style="margin-left: 30px;background: #bee5eb">
            <h2 style="text-align: center">Edit Contract</h2>
            <p><c:if test='${requestScope["message"] != null}'>
                <span class="message">${requestScope["message"]}</span>
            </c:if></p>
            <form method="post">
                <div class="input-group row">
                    <label for="inputId" class="col-sm-2 col-form-label">Id Contract</label>
                    <div class="col-sm-10">
                        <input type="text" readonly class="form-control-plaintext" id="inputId" name="idContract"
                               value="${obj.idContract}">
                    </div>
                </div>
                <div class="input-group row">
                    <label for="employee" class="col-sm-2 col-form-label-sm">Id Employee</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="employee" name="idEmployee"
                               value="${obj.idEmployee}">
                    </div>
                </div>
                <div class="input-group row">
                    <label for="customer" class="col-sm-2 col-form-label-sm">Id Customer</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="customer" name="idCustomer"
                               value="${obj.idCustomer}">
                    </div>
                </div>
                <div class="input-group row">
                    <label for="service" class="col-sm-2 col-form-label-sm">Id Service</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="service" name="idService"
                               value="${obj.idService}">
                    </div>
                </div>
                <div class="input-group row">
                    <label for="contractDate" class="col-sm-2 col-form-label-sm">Contract date</label>
                    <div class="col-sm-10">
                        <input type="date" class="form-control form-control-sm" id="contractDate" name="contractDate"
                               value="${obj.contractDate}">
                    </div>
                </div>
                <div class="input-group row">
                    <label for="contractExpire" class="col-sm-2 col-form-label-sm">Contract Expire</label>
                    <div class="col-sm-10">
                        <input type="date" class="form-control form-control-sm" id="contractExpire"
                               name="contractExpire" value="${obj.contractExpire}">
                    </div>
                </div>
                <div class="input-group row">
                    <label for="money" class="col-sm-2 col-form-label-sm">Deposit Money</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="money" name="depositMoney"
                               value="${obj.depositMoney}">
                    </div>
                </div>
                <div class="input-group row">
                    <label for="totalMoney" class="col-sm-2 col-form-label-sm">Total Money</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="totalMoney" name="totalMoney"
                               value="${obj.totalMoney}">
                    </div>
                </div>
                <div class="input-group row">
                    <label class="col-sm-2 col-form-label-sm"></label>
                    <div class="col-sm-10">
                        <%--                        modal--%>
                        <button type="button" class="btn btn-outline-warning" data-toggle="modal"
                                data-target="#exampleModal">
                            Update
                        </button>

                        <!-- Modal -->
                        <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel"
                             aria-hidden="true">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <h5 class="modal-title" id="exampleModalLabel">Do you want to update?</h5>
                                    </div>
                                    <div class="modal-footer">
                                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancel
                                        </button>
                                        <button type="submit" class="btn btn-primary btn-lg">Continue</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <a href="/home"><button type="button" class="btn btn-info">Back to home</button></a>
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
