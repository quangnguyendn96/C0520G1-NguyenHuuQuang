<%--
  Created by IntelliJ IDEA.
  User: quangnguyen
  Date: 9/19/20
  Time: 15:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sandwich</title>
</head>
<body>
<h1>Sandwich Condiment</h1>
<form>
    <input type="checkbox" id="lettuce" name="menu" value="Lettuce">
    <label for="lettuce">Lettuce</label>
    <input type="checkbox" id="tomato" name="menu" value="Tomato">
    <label for="tomato">Tomato</label>
    <input type="checkbox" id="mustard" name="menu" value="Mustard">
    <label for="mustard">Mustard</label>
    <input type="checkbox" id="sprouts" name="menu" value="Sprouts">
    <label for="sprouts">Sprouts</label><br>
    <input type="submit" value="Save">
</form>

<h2>Spice select : ${list}</h2>
</body>
</html>
