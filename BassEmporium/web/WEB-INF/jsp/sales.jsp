<%-- 
    Document   : sales
    Created on : Jul 31, 2016, 11:52:25 AM
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
        <title>List of all sales</title>
    </head>
    <body>
         <nav>
            <ul>
                <li><a href="/BassEmporium/home"><strong>HOME</strong></a></li>
                <li><a href="/BassEmporium/products">Products</a></li>
                <li><a href="/BassEmporium/buyers">Buyers</a></li>
                <li><a class="active" href="/BassEmporium/sales">Sales</a></li>
                
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
        <h1>List of all sales!</h1>
        <table class="table table-hover">
            <tr>
                <th>Buyer username</th>
                <th>Product</th>
                <th>Date of purchase</th>
            </tr>
            <c:forEach items="${salesShow}" var="saleShow">
                <tr>
                    <td>${saleShow.buyer}</td>
                    <td>${saleShow.product}</td>
                    <td>${saleShow.date}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
