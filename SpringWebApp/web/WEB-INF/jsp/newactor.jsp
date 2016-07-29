<%-- 
    Document   : newactor
    Created on : Jul 29, 2016, 2:10:10 PM
    Author     : Vladimir
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Enter data for new actor: </h1>
        <form action="addnewactor" method="post">
            Firstname: <input type="text" name ="firstname" /> <br/>
            Lastname: <input type="text" name ="lastname" /> <br/>
            <input type="submit" value ="Unesi" />
        </form>
           
           
    </body>
</html>
