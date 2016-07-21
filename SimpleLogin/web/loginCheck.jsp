<%-- 
    Document   : loginCheck
    Created on : Jul 20, 2016, 4:22:01 PM
    Author     : Vladimir
--%>

<%@page import="java.time.LocalDate"%>
<%@page import="java.time.format.DateTimeFormatter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String account = request.getParameter("Account");
            String password = request.getParameter("Password");
            String selected = request.getParameter("mySelect");
            out.println(request.getParameter("Account"));
            out.println(request.getParameter("Password"));
            out.println(request.getParameter("mySelect"));
            
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate date = LocalDate.parse(request.getParameter("date_value"), formatter);
            out.print(date);
%>
    </body>
</html>
