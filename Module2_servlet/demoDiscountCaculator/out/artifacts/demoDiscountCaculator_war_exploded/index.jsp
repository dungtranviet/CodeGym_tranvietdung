<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 12/9/2019
  Time: 2:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<div>
    <h1>Product Discount Caculator</h1>
    <form action="/caculator" method="post">
      <div>
        <label>Product Description</label>
        <input type="text" name="description">
        <br>
        <label>price</label>
        <input type="text" name="price">
        <br>
        <label>discount percent</label>
        <input type="text" name="discount">
      </div>
      <div>
       <input type="submit" value="Discount product">
      </div>
    </form>
</div>
</body>
</html>
