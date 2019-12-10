<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 12/10/2019
  Time: 2:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %>
<%@ page import="model.Customer" %>
<%@ page import="java.util.ArrayList" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h1>Danh sách khách hàng</h1>
<c:out value="Tên"/>
<c:out value="................................"/>
<c:out value="Ngày sinh"/>
<c:out value="................................."/>
<c:out value="Địa chỉ"/>
<c:out value="................................."/>
<c:out value="Ảnh"/>
<br>
<%
    List<Customer> list = Customer.getCustomers();
//    for (Customer cus:list) {
//      out.println(cus.getName());
//    }
    request.setAttribute("abc", list);
%>
<c:forEach var="cus" items="${abc}">
    <c:out value="${cus.getName()}"/>
    <c:out value="............."/>
    <c:out value="${cus.getBirthday()}"/>
    <c:out value="............."/>
    <c:out value="${cus.getAddress()}"/>
    <c:out value="............."/>
    <c:out value="${cus.getImage()}"/>
    <br>
</c:forEach>
</body>
</html>
