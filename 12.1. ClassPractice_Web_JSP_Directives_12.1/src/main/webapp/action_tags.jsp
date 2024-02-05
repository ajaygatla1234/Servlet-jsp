<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <!-- Character set declaration -->
    <meta charset="ISO-8859-1">
    <!-- Page title -->
    <title>Action Tags</title>
</head>
<!-- Body with light green background -->
<body bgcolor="lightgreen">
    <!-- Font settings -->
    <font face="ariel">
        <b>
            <!-- Paragraph describing the information source -->
            <p>The below information is from index.html</p>
            <!-- Description and usage of include action tag (commented out) -->
            <%-- </jsp:include page="sample.html"/> --%>
            
            <!-- Description and usage of forward action tag -->
            <jsp:forward page="sample.html"/>
        </b>
        <!-- Heading providing a link to navigate back to actionTags.jsp -->
        <h4>Back to actionTags.jsp</h4>
    </font>
</body>
</html>
