<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 12/10/2019
  Time: 10:55 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dictionary</title>
</head>
<body>
<%!
    Map<String, String> dic = new HashMap<>();
%>
<%
    dic.put("hello","xin chào");
    dic.put("computer","máy tính");
    dic.put("book","sách");
    dic.put("how","thế nào");
    String search = request.getParameter("search");
    String result=dic.get(search);
    if(result!=null){
        out.println("Word: "+search);
        out.println("Result: "+search);
    }
    else {
        out.println("Not found");
    }

%>
</body>
</html>
