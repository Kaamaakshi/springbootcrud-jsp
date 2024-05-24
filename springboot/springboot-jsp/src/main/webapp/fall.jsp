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
	<%
	List<CustDto> l = (List<CustDto>) request.getAttribute("data");
	%>
	<table border=" ">
		<tr>
			<td>id</td>
			<td>name</td>
			<td>delete</td>
			<td>update</td>
		</tr>
		<%
		for (CustDto c : l) {
		%>
		<tr>
			<td><%=c.getId()%></td>
			<td><%=c.getName()%></td>
			<td><a href='deletebyid?id=<%=c.getId()%>'>remove</a></td>
			<td><a href="update.jsp?id=<%=c.getId()%>&&name=<%=c.getName()%>">Modify</a></td>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>