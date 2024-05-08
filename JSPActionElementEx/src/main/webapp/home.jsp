<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String userName=request.getParameter("n1");
		String userPassword=request.getParameter("p1");
		String flagValue=request.getParameter("flag");
		out.print("Welcome ::: "+userName +""+new Date());
		out.print("<br/>Flag value :: "+flagValue);
	
	%>
</body>
</html>