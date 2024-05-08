<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
	String userName=request.getParameter("n1");
	String password=request.getParameter("p1");
	if(userName.equalsIgnoreCase("groot") && password.equalsIgnoreCase("1234")){
		

%>
	<jsp:forward page="home.jsp">
		<jsp:param value="User are secessfully loggendin" name="flag"/>
	</jsp:forward>

<%
	}else{
		out.print("User Name or passwor id incorret");
%>
	<jsp:include page="index.html"></jsp:include>
<%
	}
%>
