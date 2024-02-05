<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	
	 <!--
        Using scriptlet to retrieve and print the attribute 'Myname' from the request scope.
        Note: It's recommended to avoid scriptlets for better code maintainability.
    -->
	
	<%
	String name=request.getAttribute("Myname").toString();
	out.print(name);
	%>
	<br>
	
	
	<%--Expression language, only used in JSTL--%>
	<c:out value="${Myname}"/> <%--using of out in JSTL --%>
	<br>
	
	
	${student.name} <br>
	${student} <br>
	${students}
	<br>
	<c:forEach items="${students}" var="s">
		${s} <br>
	</c:forEach>
	
	<c:forEach items="${students}" var="s">
		${s.name} <br>
	</c:forEach>
	
</body>
</html>