<%-- 
    Document   : newproduct
    Created on : Jul 30, 2016, 2:34:35 PM
    Author     : Vladimir
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add new product</title>
    </head>
    <body>
        <h1>Add New Product here: </h1>
        <form action="/addnewproduct" method="post"><br/>
            Product name: <input type="text" name="name"/><br/>
            Product price: <input type="text" name ="price"/><br/>
            Product description: <input type="text" name="description"/><br/>
            Product image: <input type="text" name="image"/><br/>
            Quantity in stock: <input type="text" name ="quantity"/><br/>
            <input type="submit" value="Add product"/>
        </form>
    </body>
</html>
