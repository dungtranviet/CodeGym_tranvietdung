<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 12/10/2019
  Time: 4:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form action="/calculate" method="post">
    <h1>Simple Caculator</h1>
    <fieldset>
        <legend>Calculate</legend>
        Fisrt operand: <input type="text" name="number1"></br>
        Operator:
        <select name="operator">
            <option value="+">cong</option>
            <option value="-">tru</option>
            <option value="*">nhan</option>
            <option value="/">chia</option>
        </select></br>
        Second operand: <input type="text" name="number2"></br>
        <input type="submit" value="Calculate">
    </fieldset>
</form>
</body>
</html>
