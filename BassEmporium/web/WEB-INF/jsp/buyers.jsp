<%-- 
    Document   : buyers
    Created on : Jul 31, 2016, 9:01:07 AM
    Author     : Vladimir
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List of all our users</title>
    </head>
    <body>
        <h1>List of all registered users!</h1>
        <a href="newbuyer">Add new</a><br/>
         <c:forEach items="${buyers}" var="buyer">
            <div style = "border : 1px solid red; padding: 4px; margin: 4px ">
                <c:out value="Username: ${buyer.username} "/><br/>
                <c:out value="Name: ${buyer.firstname} ${buyer.lastname}"/><br/>
                <c:out value="Adress: ${buyer.adress}"/><br/>
                <a href="editbuyer/${buyer.id}">Edit buyer</a><a href="removebuyer/${buyer.id}">  Delete buyer</a>
                
            </div>
        </c:forEach>
    </body>
</html>
