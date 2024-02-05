<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <!-- Character set declaration -->
    <meta charset="ISO-8859-1">
    <!-- Page title -->
    <title>My First JSP</title>
</head>
<body bgcolor="black">
    <!-- Font settings -->
    <font face="calibri" size="4" color="white">
        <!-- Static Content -->
        <b> Static Content : </b>Hello World!
        <br>
        <!-- Scriplet -->
        <b>Scriplet : </b>
        <!-- Using a scriplet to generate a loop and declare a float variable -->
        <%
            for(int num = 1; num <= 10; num++){
                out.println(num + "<br>");
            }
            float salary;
            salary = 10000.05f;
        %>
        <br>
        
        <!-- Declaration -->
        <b>Declaration:</b>
        <!-- Declaring variables 'number' and 'price', and initializing 'price' -->
        <%  
            int number;
            int price = 100;
        %>
        <!-- Initializing 'number' -->
        <%  
            number = 287; 
        %>
        <br>
        
        <!-- Expression -->
        <b>Expression :</b>
        <!-- Using an expression to print the value of 'number' -->
        <%= number %> <br>
        <!-- Using expressions to print the values of 'price' and 'salary' -->
        <b>Price:</b><%= price %><br>
        <b>Salary:</b><%= salary %>
        <br>
    </font>        
</body>
</html>
