<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: quangnguyen
  Date: 9/21/20
  Time: 20:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Show information email</h2>
<h3>Language : ${setting.language}</h3>
<h3>Page size : ${setting.page}</h3>
<h3>Spam : ${setting.spam}</h3>
<h3>Signature : ${setting.signature}</h3>
</body>
</html>
