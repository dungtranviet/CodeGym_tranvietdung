<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 12/12/2019
  Time: 11:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form method="post" action="/">
    <fieldset>
      <legend>Current Convert USD to VND</legend>
      <table>
        <tr>
          <td>USD: </td>
          <td><input type="text" name="usd" value="${usd}" placeholder="0"></td>
        </tr>
        <tr>
          <td>Rate: </td>
          <td><input type="text" name="rate" value="${rate}" placeholder="2200"></td>
        </tr>
        <tr>
          <td>${result}</td>
        </tr>
        <tr>
          <td><input type="submit" value="Convert to VND"></td>
        </tr>
      </table>
    </fieldset>
  </form>
  </body>
</html>
