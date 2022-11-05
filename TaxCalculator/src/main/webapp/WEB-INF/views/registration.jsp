<%--
  Created by IntelliJ IDEA.
  User: MIRMDKAWSUR
  Date: 10/13/2022
  Time: 9:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>

    <form method="post" action="register/v2">
        <label for="firstname">First name:</label>
        <input type="text" name="firstname" id="firstname"/>
        <br>
        <label for="lastname">Last name:</label>
        <input type="text" name="lastname" id="lastname"/>
        <br>
        <label for="email">Email:</label>
        <input type="email" name="email" id="email"/>
        <br>
        <label for="password">Password</label>
        <input type="password" name="password" id="password">
        <br>
        <input type="submit" value="Register">
    </form>

</body>
</html>
