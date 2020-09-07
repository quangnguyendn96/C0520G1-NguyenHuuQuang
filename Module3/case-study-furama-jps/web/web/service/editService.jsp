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
    <a href="/service">
        <button type="button" class="btn btn-success btn-lg">Back to home</button>
    </a>
    <div class="row justify-content-center">
        <div class="col-5" style="margin-left: 30px">
            <h2>Edit Employee</h2>
            <form method="post">
                <div class="input-group row">
                    <label for="idService" class="col-sm-2 col-form-label">Id Service</label>
                    <div class="col-sm-10">
                        <input type="text" readonly class="form-control-plaintext" id="idService" name="idService"
                               value="${obj.idService}">
                    </div>
                </div>
                <div class="input-group row">
                    <label for="nameService" class="col-sm-2 col-form-label-sm">Name Service</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="nameService" name="nameService"
                               value="${obj.nameService}">
                    </div>
                </div>

                <div class="input-group row">
                    <label for="areaService" class="col-sm-2 col-form-label-sm">Area Service</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="areaService" name="areaService"
                               value="${obj.areaService}">
                    </div>
                </div>

                <div class="input-group row">
                    <label for="numberFloor" class="col-sm-2 col-form-label-sm">Number Floor</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="numberFloor" name="numberFloor"
                               value="${obj.numberFloor}">
                    </div>
                </div>
                <div class="input-group row">
                    <label for="maximumCustomer" class="col-sm-2 col-form-label-sm">Maximum Customer</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="maximumCustomer" name="maximumCustomer"
                               value="${obj.maximumCustomer}">
                    </div>
                </div>

                <div class="input-group row">
                    <label for="costRent" class="col-sm-2 col-form-label-sm ">Cost Rent</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="costRent" name="costRent"
                               value="${obj.costRent}">
                    </div>
                </div>

                <div class="input-group row">
                    <label for="idTypeService" class="col-sm-2 col-form-label-sm">Id Type Service</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="idTypeService" name="idTypeService"
                               value="${obj.idTypeService}">
                    </div>
                </div>

                <div class="input-group row">
                    <label for="idTypeRent" class="col-sm-2 col-form-label-sm">Id Type Rent</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="idTypeRent" name="idTypeRent"
                               value="${obj.idTypeRent}">
                    </div>
                </div>

                <div class="input-group row">
                    <label for="descriptionOtherConvenience" class="col-sm-2 col-form-label-sm">Description Other Convenience</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="descriptionOtherConvenience" name="descriptionOtherConvenience"
                               value="${obj.descriptionOtherConvenience}">
                    </div>
                </div>

                <div class="input-group row">
                    <label for="poolArea" class="col-sm-2 col-form-label-sm">Pool Area</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="poolArea" name="poolArea"
                               value="${obj.poolArea}">
                    </div>
                </div>

                <div class="input-group row">
                    <label for="standardRoom" class="col-sm-2 col-form-label-sm">Standard Room</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" id="standardRoom" name="standardRoom"
                               value="${obj.standardRoom}">
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
