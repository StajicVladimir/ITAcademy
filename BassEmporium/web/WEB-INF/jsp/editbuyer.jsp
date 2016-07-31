<%-- 
    Document   : editbuyer
    Created on : Jul 31, 2016, 9:43:35 AM
    Author     : Vladimir
--%>
<%@taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Change ${buyer.username}'s data</title>
    </head>
    <body>
        <h1>Change ${buyer.username}'s data:</h1>
        <form action ="../editbuyerapply" method = "post">
            <input type="hidden" name ="id" value="${buyer.id}">
            <label for="username">Username: </label><input type="text" name ="username" id="username" value="${buyer.username}"><br/>
            <label for="password">Password: </label><input type="password" name ="password" id="password" value="${buyer.password}"><br/>
            <label for="firstname">Firstname: </label><input type="text" name ="firstname" id="firstname" value="${buyer.firstname}"><br/>
            <label for="lastname">Lastname: </label><input type="text" name ="lastname" id="lastname" value="${buyer.lastname}"><br/>
            <label for="adress">Adress: </label><input type="text" name ="adress" id="adress" value="${buyer.adress}"><br/>
            
            <input type="submit" value="Apply changes"/>
        </form>
    </body>
</html>
