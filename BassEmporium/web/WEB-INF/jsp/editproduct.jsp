<%-- 
    Document   : editproduct
    Created on : Jul 30, 2016, 3:22:34 PM
    Author     : Vladimir
--%>
<%@taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit product</title>
    </head>
    <body>
        <h1>Enter new data for ${product.name}</h1>
        <form action="../editproductapply" method = "post">
            <input type ="text" name ="name" value="${product.name}"/><br/>
            <input type ="text" name ="price" value="${product.price}"/><br/>
            <input type ="text" name ="description" value="${product.description}"/><br/>
            <input type ="text" name ="image" value="${product.image}"/><br/>
            <input type ="text" name ="quantity" value="${product.quantity}"/><br/>
            <input type ="submit" value="Apply"/>
        </form>
    </body>
</html>
