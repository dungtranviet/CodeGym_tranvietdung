<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 12/15/2019
  Time: 4:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Sandwitch Condiments</h3>
<form:form action="/save" method="POST" modelAttribute="condiment">
    <table>
        <tr>
            <td><input type="checkbox" name="condiments" value="Lettuce">Lettuce</td>
            <td><input type="checkbox" name="condiments" value="Tomato">Tomato</td>
            <td><input type="checkbox" name="condiments" value="Mustard">Mustard</td>
            <td><input type="checkbox" name="condiments" value="Sprouts">Sprouts</td>
        </tr>
        <tr><td><input type="submit" value="save"></td></tr>
    </table>
</form:form>
</body>
</html>
