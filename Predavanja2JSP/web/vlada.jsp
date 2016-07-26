<%-- 
    Document   : vlada
    Created on : Jul 25, 2016, 7:45:45 PM
    Author     : Vladimir
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Date" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Cao ljudi!!!</h1>
        <%= "Hello From Expresion <br/>"%>
        <%= new Date()%>
        <%
            String msg = "Hello from jsp stringlet";
            pageContext.setAttribute("msg", msg);
            out.print(msg);
        %>
        <%= msg %>
        ${msg}
        
        <% for (int i = 0; i<3; i++){%>
        <h3>petlja</h3><br/>
        <%}%>
    </body>
</html>
