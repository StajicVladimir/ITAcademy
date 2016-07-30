<%-- 
    Document   : products
    Created on : Jul 30, 2016, 12:40:41 PM
    Author     : Vladimir
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Products page</h1>
        <c:forEach items="${products}" var="product">
            <div style = "border : 1px solid red; padding: 4px; margin: 4px ">
                <c:out value="${product.name}"/> <img src="<c:url value="/${product.image}"/>"/>
            </div>
        </c:forEach>
    </body>
</html>
