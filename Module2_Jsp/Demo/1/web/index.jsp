<%@ page import="java.lang.reflect.Array" %><%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 12/10/2019
  Time: 11:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@    taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>c:out example</title>
</head>
<body>
<h1>c:out example</h1>
<c:out value="This is true :10>1"/>
<h1>c:set example</h1>
<c:set scope="session" var="salary"  value="210"></c:set>
<c:out value="${salary}"/>
<h1>c:if example</h1>
<c:if test="${salary>2000}">
  <c:out value="${'luong ngon'}"/>
</c:if>
<c:if test="${salary<0}">
  <c:out value="${'lam vi dam me'}"/>
</c:if>
<h1>c:choose example</h1>
<c:choose>
  <c:when test="${salary>2000}">
    <c:out value="luong cao "/>
  </c:when>
  <c:when test="${salary<=0}">
    <c:out value="lam vi dam me"/>
  </c:when>
  <c:otherwise>
    <c:out value="luong binh thuong"/>
  </c:otherwise>
</c:choose>
<h1>c:foreach example</h1>
<%!
  int []mang={1,2,3,4,5,6,7,8,9,10};
%>
<%
  for (int i:mang) {
    out.println(i);
  }
%>

<c:forEach var="i" items="${}">
<c:out value="tes" />
</c:forEach>
</body>
</html>
