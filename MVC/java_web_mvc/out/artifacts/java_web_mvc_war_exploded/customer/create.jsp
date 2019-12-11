<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 12/11/2019
  Time: 10:39 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>
    <c:if test='${requestScope["message"]!=null}'>
        <p>${requestScope["message"]}</p>
    </c:if>
</p>
<form method="post"  >
<fieldset>
    <legend>Customer information</legend>
    <tr>
        <td>Name: </td>
        <td><input type="text" name="name"></td>
    </tr>
    <tr>
        <td>Email: </td>
        <td><input type="text" name="email"></td>
    </tr>
    <tr>
        <td>Address: </td>
        <td><input type="text" name="address"></td>
    </tr>
    <tr><td><input type="submit" value="Create Customer"></td></tr>
</fieldset>
</form>
</body>
</html>
