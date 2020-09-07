<%--
  Created by IntelliJ IDEA.
  User: quangnguyen
  Date: 9/6/20
  Time: 00:21
  To change this template use File | Settings | File Templates.
--%>
<head>
    <title>Edit Employee</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="../../lib_bootstrap/css/bootstrap.min.css">

</head>
<body>
<div class="container-fluid">
    <a href="/employee">
        <button type="button" class="btn btn-success btn-lg">Back to home</button>
    </a>
    <div class="row justify-content-center">
        <div class="col-5" style="margin-left: 30px">
            <h2>Edit Employee</h2>
            <form method="post">
                <div class="input-group row">
                    <label for="idEmployee" class="col-sm-2 col-form-label">Id Employee</label>
                    <div class="col-sm-10">
                        <input type="text" readonly class="form-control-plaintext" id="idEmployee" name="idEmployee"
                               value="${obj.idEmployee}">
                    </div>
                </div>
                <div class="input-group row">
                    <label for="nameService" class="col-sm-2 col-form-label-sm">Name Employee</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="nameService" name="nameEmployee"
                               value="${obj.nameEmployee}">
                    </div>
                </div>
                <div class="input-group row">
                    <label for="idPositive" class="col-sm-2 col-form-label-sm">Id Positive</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="idPositive" name="idPositive"
                               value="${obj.idPositive}">
                    </div>
                </div>
                <div class="input-group row">
                    <label for="idDegreeEducation" class="col-sm-2 col-form-label-sm">Id Degree Education</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="idDegreeEducation" name="idDegreeEducation"
                               value="${obj.idDegreeEducation}">
                    </div>
                </div>
                <div class="input-group row">
                    <label for="idDivision" class="col-sm-2 col-form-label-sm">Id Division</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="idDivision" name="idDivision"
                               value="${obj.idDivision}">
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
                    <label for="identityCardEmployee" class="col-sm-2 col-form-label-sm">Identity Card Employee</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="identityCardEmployee" name="identityCardEmployee"
                               value="${obj.identityCardEmployee}">
                    </div>
                </div>
                <div class="input-group row">
                    <label for="salary" class="col-sm-2 col-form-label-sm">Salary</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="salary" name="salary"
                               value="${obj.salary}">
                    </div>
                </div>

                <div class="input-group row">
                    <label for="phoneNumber" class="col-sm-2 col-form-label-sm">Phone Number</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="phoneNumber" name="phoneNumber"
                               value="${obj.phoneNumber}">
                    </div>
                </div>

                <div class="input-group row">
                    <label for="emailEmployee" class="col-sm-2 col-form-label-sm">Email Employee"</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="emailEmployee" name="emailEmployee"
                               value="${obj.emailEmployee}">
                    </div>
                </div>

                <div class="input-group row">
                    <label for="addressEmployee" class="col-sm-2 col-form-label-sm">Address Employee</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="addressEmployee" name="addressEmployee"
                               value="${obj.addressEmployee}">
                    </div>
                </div>

                <div class="input-group row">
                    <label for="username" class="col-sm-2 col-form-label-sm">Username"</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="username" name="username"
                               value="${obj.username}">
                    </div>
                </div>

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
                </div>
            </form>
        </div>
    </div>
</div>

<script src="../../lib_bootstrap/js/jquery-3.5.1.min.js"></script>
<script src="../../lib_bootstrap/js/bootstrap.min.js"></script>
</body>
</html>
