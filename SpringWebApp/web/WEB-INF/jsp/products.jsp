<%-- 
    Document   : products
    Created on : Jul 29, 2016, 12:21:40 PM
    Author     : Vladimir
--%>
<%@taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Products</h1>
        
        <c:forEach items="${actors}" var ="actor">
            <div style = "border : 1px solid red; padding: 4px; margin: 4px ">
                <a href = "product/${actor.id}"><c:out value="${actor.firstname}"/> <c:out value="${actor.lastname}"/></a> 
            </div>
        </c:forEach>
    </body>
</html>
