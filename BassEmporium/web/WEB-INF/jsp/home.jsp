<%-- 
    Document   : home
    Created on : Jul 30, 2016, 12:28:51 PM
    Author     : Vladimir
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Welcome to BASS EMPORIUM! Your #1 Bass online shop!</h1>
        <c:if test="${sessionScope.username!= null}">
            <h1>Hello ${sessionScope.username}</h1>
        </c:if>
         <c:if test="${sessionScope.username== null}">
            <h1>Login or continue as guest</h1>
        </c:if>  
    </body>
</html>
