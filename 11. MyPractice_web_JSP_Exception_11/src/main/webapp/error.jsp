<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
    <!-- Character set declaration -->
    <meta charset="ISO-8859-1">
    <!-- Page title -->
    <title>Insert title here</title>
</head>
<!-- Body with tomato background color -->
<body bgcolor="tomato">

    <!-- Displaying an error message -->
    Error 
    <br> <br>
    
    <!-- 
        The following code uses the exception implicit object, 
        which is only available in pages declared as isErrorPage="true" in the above page directive.
        It retrieves and displays the error message.
    -->
    <%= exception.getMessage() %> <%--exception will work only in errorpages i.e. declared as isErrorPage="true" in the above page starting lines--%>

</body>
</html>
