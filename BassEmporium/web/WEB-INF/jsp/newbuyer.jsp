<%-- 
    Document   : newbuyer
    Created on : Jul 31, 2016, 9:22:47 AM
    Author     : Vladimir
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="/BassEmporium/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="/BassEmporium/css/navigation.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add new user</title>
    </head>
    <body>
        <nav>
            <ul>
                <li><a href="/BassEmporium/home"><strong>HOME</strong></a></li>
                <li><a href="/BassEmporium/products">Products</a></li>
                <li><a class="active" href="/BassEmporium/buyers">Buyers</a></li>
                <li><a href="/BassEmporium/sales">Sales</a></li>
                
                <li style="float:right"><a href="/BassEmporium/logout" >Logout</a>
                <li style="float:right"><a href="/BassEmporium/login" >Login</a>
                <li class="navbar-logged-text">
                     <c:if test="${sessionScope.username!= null}">
                        Logged in as: ${sessionScope.username}
                         </c:if>
                    <c:if test="${sessionScope.username== null}">
                        Logged in as: Guest
                    </c:if>
                </li>
            </ul>
        </nav>
        <h1>Enter buyer data:</h1>
        <form action ="/BassEmporium/addnewbuyer" method = "post">
            <div style="width:20%">
            <div class="form-group">
                <label for="username">Username: </label>
                <input type="text" class="form-control" name ="username" id="username" value="Username">
            </div>
            <div class="form-group">
                <label for="password">Password: </label>
                <input type="password" class="form-control" name ="password" id="password" value="Pass">
            </div>
            <div class="form-group">
                <label for="firstname">Firstname: </label>
                <input type="text" class="form-control" name ="firstname" id="firstname" value="Firstname">
            </div>
            <div class="form-group">
                <label for="lastname">Lastname: </label>
                <input type="text" class="form-control" name ="lastname" id="lastname" value="Lastname">
            </div>
            <div class="form-group">
                <label for="adress">Adress: </label>
                <input type="text" class="form-control" name ="adress" id="adress" value="Adress">
            </div>
            <input type="submit" class="btn btn-default" value="Add buyer"/>
            </div>
        </form>
           
    </body>
</html>
