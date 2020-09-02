<%--
  Created by IntelliJ IDEA.
  User: quangnguyen
  Date: 8/31/20
  Time: 20:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>User Management Application</title>
    <link rel="stylesheet" href="css/style.css"/>
</head>
<body>
<h1>User Management</h1>
    <h2>
        <a href="/user"><button>Back to List Users</button></a>
    </h2>
<c:if test='${requestScope["edit"] != null}'>
    <span class="message">${requestScope["edit"]}</span>
</c:if>
<form method="post">
        <table border="1" cellpadding="5">
            <caption>
                <h2>
                    Edit User
                </h2>
            </caption>
            <c:if test="${user != null}">
                <input type="hidden" name="id" value="<c:out value='${user.id}' />"/>
            </c:if>
            <tr>
                <th>User Name:</th>
                <td>
                    <input type="text" name="name" size="45"
                           value="${user.name}" />
                </td>
            </tr>
            <tr>
                <th>User Email:</th>
                <td>
                    <input type="text" name="email" size="45"
                           value="${user.email}" />
                </td>
            </tr>
            <tr>
                <th>Country:</th>
                <td>
                    <input type="text" name="country" size="15"
                           value="${user.country}"
                    />
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input style="height: 40px;width: 100px" type="submit" value="Save"/>
                </td>
            </tr>
        </table>
    </form>
</body>
</html>