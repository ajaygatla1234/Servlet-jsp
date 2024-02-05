<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <!-- Character set declaration -->
    <meta charset="ISO-8859-1">
    <!-- Page title -->
    <title>Insert title here</title>
</head>
<body>

    <!--
    The following code is commented out to intentionally generate a runtime exception.
    Uncomment the code block to see how the errorPage attribute works.

    <%--
    try {
        int k = 9 / 0;
    } catch (Exception e) {
        out.print("Error " + e.getMessage());
    }
    --%>
    -->

    <!--
    The following code will intentionally generate a runtime exception.
    The error will be caught by the errorPage attribute, and the request will be forwarded to the 'error.jsp' page.
    -->
    <%
    int k = 9 / 0;
    %>

</body>
</html>
