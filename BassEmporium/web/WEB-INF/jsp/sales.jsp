<%-- 
    Document   : sales
    Created on : Jul 31, 2016, 11:52:25 AM
    Author     : Vladimir
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List of all sales</title>
    </head>
    <body>
        <h1>List of all sales!</h1>
         <c:forEach items="${salesShow}" var="saleShow">
            <div style = "border : 1px solid red; padding: 4px; margin: 4px ">
                <c:out value="${saleShow.buyer}, ${saleShow.product}, ${saleShow.date}"/> 
            </div>
        </c:forEach>
    </body>
</html>
