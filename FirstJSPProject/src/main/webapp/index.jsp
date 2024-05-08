<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%! public int cube(int a){
			return a*a*a;
			
	}
		%>
	<%
		out.print("Welcome to Fist JSP Page");
		out.print("<br/>cube "+cube(3));
	%>
	<br>
	<%= "Welcome to Groot Academy" %>
	<hr>
	<%= "Cube"+cube(7) %> 
	<form action="process.jsp">
		Name : <input type="text" name="n1" value=""/><br/>
		<input type="submit" value="go">
	</form>
	
</body>
</html>