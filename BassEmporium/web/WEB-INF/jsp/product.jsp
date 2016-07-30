<%-- 
    Document   : product
    Created on : Jul 30, 2016, 2:16:20 PM
    Author     : Vladimir
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>${product.name}</title>
    </head>
    <body>
        <h1><c:out value="${product.name}"></c:out><c:out value="price: ${product.price}"/></h1><br/>
        <img src="<c:url value="/${product.image}"/>"/><br/>
        <c:out value="${product.description}"/><br/>
        <c:out value="In stock: ${product.quantity}"/><br/>
        <a href="../removeproduct/${product.id}">remove this product</a>
        <a href="../editproduct/${product.id}">edit this product</a>
    </body>
</html>
