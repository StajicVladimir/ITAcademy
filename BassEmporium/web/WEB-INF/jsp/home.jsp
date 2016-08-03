<%-- 
    Document   : home
    Created on : Jul 30, 2016, 12:28:51 PM
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
        
        
        <title>Bass Emporium</title>
    </head>
    <body>
        <nav>
            <ul>
                <li><a class="active" href="/BassEmporium/home"><strong>HOME</strong></a></li>
                <li><a href="/BassEmporium/products">Products</a></li>
                <li><a href="/BassEmporium/buyers">Buyers</a></li>
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
        <div>
        <div style="display: inline-block; float: left; size: 40%; margin: 5%">
            <img src ="/BassEmporium/img/bass-guitar1.jpg" alt="BE"/>
        </div>
        
        <div style="display: inline-block; float: right; size: 40%;margin-top: 5%">
            <h2>Welcome to <strong>BASS EMPORIUM! </strong><br/> Your #1 Bass online shop!</h2>
            <h3>Enjoy shopping on our <a href="/BassEmporium/products">products</a> page!!</h3>
        </div>
        </div>
    </body>
</html>
