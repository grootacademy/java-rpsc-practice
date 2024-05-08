<%@page import="com.groot.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<% 
	Student st=(Student)session.getAttribute("st");
	out.print("<br>"+st.getName());
	out.print("<br>"+st.getFee());
	out.print("<br>"+st.getAddress());
	
%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

</body>
</html>