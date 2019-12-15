<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 12/15/2019
  Time: 10:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="addEmployee" method="post" modelAttribute="employee">
    <table>
        <tr>
            <td>id: </td>
            <td><form:input path="id"/></td>
        </tr>
        <tr>
            <td>name: </td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td>contac number: </td>
            <td><form:input path="contactNumber"/></td>
        </tr>
        <tr><td><input type="submit" value="Submit"></td></tr>
    </table>

</form:form>
</body>
</html>
