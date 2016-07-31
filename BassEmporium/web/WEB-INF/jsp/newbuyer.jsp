<%-- 
    Document   : newbuyer
    Created on : Jul 31, 2016, 9:22:47 AM
    Author     : Vladimir
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add new user</title>
    </head>
    <body>
        <h1>Enter buyer data:</h1>
        <form action ="addnewbuyer" method = "post">
            <label for="username">Username: </label><input type="text" name ="username" id="username" value="Username"><br/>
            <label for="password">Password: </label><input type="password" name ="password" id="password" value="Pass"><br/>
            <label for="firstname">Firstname: </label><input type="text" name ="firstname" id="firstname" value="Firstname"><br/>
            <label for="lastname">Lastname: </label><input type="text" name ="lastname" id="lastname" value="Lastname"><br/>
            <label for="adress">Adress: </label><input type="text" name ="adress" id="adress" value="Adress"><br/>
            <input type="submit" value="Add buyer"/>
        </form>
           
    </body>
</html>
