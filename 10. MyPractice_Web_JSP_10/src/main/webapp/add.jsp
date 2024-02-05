<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <!-- Character set declaration -->
    <meta charset="ISO-8859-1">
    <!-- Page title -->
    <title>Insert title here</title>
</head>
<!-- Body with cyan background color -->
<body bgcolor="cyan">

    <%
    // Parsing the values of num1 and num2 from the request parameters
    int i = Integer.parseInt(request.getParameter("num1"));
    int j = Integer.parseInt(request.getParameter("num2"));

    // Adding the two numbers
    int k = i + j;

    // Outputting the result
    out.println("Output : " + k);
    %>

</body>
</html>
