<%--
  Created by IntelliJ IDEA.
  User: 12
  Date: 2024/3/28
  Time: 21:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
<body>
<p>New Uers Registration!</p>
<form>
    <input type = "text" name="Username"  placeholder="Username"><br>
    <input type="text"name="password" placeholder="password" maxlength="8"><br>
    <input type="text" name="Email" placeholder="Email"><br>
    Gender <input type="radio" name="sex" value="boy">Male <input type="radio" value="girl" name="sex">Female<br>
    <input type="text" name="birthday" placeholder="birthday"><br>
    <input type="submit" value="Register">
</form>
</body>
</html>
