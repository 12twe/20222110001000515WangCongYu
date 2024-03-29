<%--
  Created by IntelliJ IDEA.
  User: 12
  Date: 2024/3/28
  Time: 23:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>reg</title>
</head>
<body>

    <form method="post" action="register">
        Username :<input type="text" name="username"><br/>
        Password :<input type="text" name="password"><br/>
        Email :<input type="text" name="email"><br/>
        <label>性别:</label>
        <input type="radio" name="gender" value="male">男
        <input type="radio" name="gender" value="female">女
        Date of Birth :<input type="text name=" name="birthDate"><br/>
        <input type="submit" value="Register"><br/>
    </form>

</body>
</html>
