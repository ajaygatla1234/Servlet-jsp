<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <!-- Character set declaration -->
    <meta charset="ISO-8859-1">
    <!-- Page title -->
    <title>Subbu</title>
</head>
<!-- Body with light green background -->
<body bgcolor="lightgreen">
    <!-- Include header.html -->
    <%@ include file="header.html" %>
    
    <!-- Font settings -->
    <font face="ariel">
        <b>
            <!-- Paragraph describing the information source -->
            <p>The below information is from sample.html Using include Directive :</p>
            <!-- Include sample.html -->
            <%@ include file="sample.html" %>
        </b>
    </font>
    
    <!-- Include footer.html -->
    <%@ include file="footer.html" %>
</body>
</html>
