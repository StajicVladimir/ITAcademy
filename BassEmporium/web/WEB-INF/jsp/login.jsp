<%-- 
    Document   : login
    Created on : Jul 31, 2016, 11:06:54 AM
    Author     : Vladimir
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Enter your data:</h1><br/>
        <div>
            <form action="logincheck" method="get">
                <label for="username">Username: </label><input type="text" name="username" id="username"><br/>
                <label for="password">Password: </label><input type="password" name="password" id="password"><br/>
                <input type="submit" value="Login">
            </form>
        </div>
    </body>
</html>
