<%--
  Created by IntelliJ IDEA.
  User: quangnguyen
  Date: 8/28/20
  Time: 00:43
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<h1>Simple Calculator</h1>
<form action="/calculator.jsp" method="get">
    <table>
        <tr>
            <td>First operand :</td>
            <td><input name="first" type="number"></td>
        </tr>
        <tr>
            <td>Second operand :</td>
            <td><input name="second" type="number"></td>
        </tr>
        <tr>
            <td>Operator: </td>
            <td>
                <select name="operator">
                    <option selected>+</option>
                    <option>-</option>
                    <option>*</option>
                    <option>/</option>
                </select>
            </td>
        </tr>
        <tr>
            <td></td>
            <td><input value="calculator" type="submit"></td>
        </tr>
    </table>
</form>
</body>
</html>
