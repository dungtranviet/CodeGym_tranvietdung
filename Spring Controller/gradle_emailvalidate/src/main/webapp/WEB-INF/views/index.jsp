<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 12/16/2019
  Time: 2:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="validate" method="post">
    <table>
        <tr>
            <td><input type="text" name="email"></td>
            <td><input type="submit" value="check validate"></td>
        </tr>
        <tr><td>${message}</td></tr>
    </table>
</form>
</body>
</html>
