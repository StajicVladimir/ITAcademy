<%-- 
    Document   : newjsp
    Created on : Jul 26, 2016, 1:54:23 PM
    Author     : Vladimir
--%>

<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/movies_g4","root", "Fanta82ns");
 %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
