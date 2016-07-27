<%-- 
    Document   : index
    Created on : Jul 27, 2016, 8:45:26 AM
    Author     : Vladimir
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple login with session</title>
    </head>
    <body>
        <h1>Please login</h1>
        <br/>
        <form action="login" method="get">
            Username: <input type="text" name ="username"/><br/>
            Password: <input type ="text" name ="password"/><br/><br/>
            <input type="submit" value="Posalji"/>
        </form>
    </body>
</html>
