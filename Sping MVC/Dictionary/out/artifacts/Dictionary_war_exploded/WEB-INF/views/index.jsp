<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 12/12/2019
  Time: 3:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
<form method="post">
<h1>Dictionary Vietnamese</h1>
  <input type="text" name="txtSearch" placeholder="enter your word" value="${search}">
  <input type="submit" value="Search"><br>
  <h1>${result}</h1>
</form>
  </body>
</html>
