<%--
  Created by IntelliJ IDEA.
  User: quangnguyen
  Date: 8/28/20
  Time: 00:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<h1>Simple Calculator</h1>
<form action="${pageContext.request.contextPath}/calculator" method = "post">
    <table>
        <tr>
            <td>First operand : </td>
            <td><input name="first" type="number"> </td>
        </tr>
        <tr>
            <td>Second operand : </td>
            <td><input name="second" type="number"> </td>
        </tr>
        <tr>
            <td>Operand</td>
            <td>
                <section name = "operand">
                    <option value="+">Add</option>
                    <option value="-">Sub</option>
                    <option value="*">Multi</option>
                    <option value="/">Div</option>
                </section>
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
