<%--
  Created by IntelliJ IDEA.
  User: kiyoumi
  Date: 2019/3/15
  Time: 11:39 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>register</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/user/register" method="post">
    username:<input type="text" name="username"><br>
    password:<input type="password" name="password"><br>
    email:<input type="text" name="email"><br>
    phone:<input type="text" name="phone">
    <input type="submit" value="注册">
</form>

</body>
</html>
