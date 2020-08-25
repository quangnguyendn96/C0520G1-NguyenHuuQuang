<%--
  Created by IntelliJ IDEA.
  User: quangnguyen
  Date: 8/25/20
  Time: 21:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style type="text/css">
  .login {
    height:180px; width:230px;
    margin:0;
    padding:10px;
    border:1px #CCC solid;
  }
  .login input {
    padding:5px; margin:5px
  }
</style>
<body>
<form  method = "get" action="log">
  <div class="login">
    <h2>Login</h2>
    <input type="text" name="username1" size="30"  placeholder="username" />
    <input type="password" name="password1" size="30" placeholder="password" />
    <input type="submit" value="Sign in"/>
  </div>
</form>
</body>
</html>