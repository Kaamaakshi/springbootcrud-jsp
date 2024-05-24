<%@page import="com.example.demo.dto.CustDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%List<CustDto> l=(List<CustDto>)request.getAttribute("data");%>
<table border=" ">
<tr>
<td>id</td>
<td>name</td>
</tr>
<%for(CustDto c:l) {%>
<tr>
<td><%=c.getId() %></td>
<td><%=c.getName() %></td>
</tr>
<%} %>
</table>
</body>
</html>