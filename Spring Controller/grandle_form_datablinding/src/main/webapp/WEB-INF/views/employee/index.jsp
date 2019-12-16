<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
<form:form action="/addEmployee" method="post" modelAttribute="employee">
    <table>
        <tr>
            <td>Employee Id: </td>
            <td><form:input path="id"/></td>
        </tr>
        <tr>
            <td>name: </td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td>Contact Number</td>
            <td><form:input path="contact"/></td>
        </tr>
        <tr><td><input type="submit" value="submit"></td></tr>
    </table>
</form:form>
</body>
</html>
