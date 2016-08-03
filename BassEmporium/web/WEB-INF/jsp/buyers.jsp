<%-- 
    Document   : buyers
    Created on : Jul 31, 2016, 9:01:07 AM
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
        <title>List of all our users</title>
        
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
        <h1>List of all registered users!</h1>
        <div style="padding: 10px">
        <a class="btn btn-primary btn-lg" href="newbuyer">Add new</a>
        </div>
        <table class="table table-hover">
            <tr>
                <th>Username</th>
                <th>First name</th>
                <th>Last name</th>
                <th>Adress</th>
                <th></th>
                <th></th>
            </tr>
            <c:forEach items="${buyers}" var="buyer">
                <tr>
                    <td>${buyer.username}</td>
                    <td>${buyer.firstname}</td>
                    <td>${buyer.lastname}</td>
                    <td>${buyer.adress}</td>
                    <td><a href="/BassEmporium/editbuyer/${buyer.id}">Edit buyer</a></td>
                    <td><a href="/BassEmporium/removebuyer/${buyer.id}">  Delete buyer</a></td>
                </tr>
            </c:forEach>
        </table>
        
    </body>
</html>
