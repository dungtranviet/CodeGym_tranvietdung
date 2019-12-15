<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 12/15/2019
  Time: 8:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Caculator</h1>
<form action="caculator" method="post">
    <table>
        <tr>
            <td><input type="text" name="num1" value="${num1}"></td>
            <td><input type="text" name="num2" value="${num2}"></td>
        </tr>
        <tr>
            <td><input type="submit" name="operator" value="Addtion(+)" /></td>
            <td><input type="submit" name="operator" value="Subtraction(-)"/></td>
            <td><input type="submit" name="operator" value="Mutiplication(X)"/></td>
            <td><input type="submit" name="operator" value="Division(/)"/></td>
        </tr>
        <tr><td>${result}</td></tr>
    </table>
</form>
</body>
</html>
