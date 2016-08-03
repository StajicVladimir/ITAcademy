<%-- 
    Document   : product
    Created on : Jul 30, 2016, 2:16:20 PM
    Author     : Vladimir
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="/BassEmporium/css/navigation.css">
        <link rel="stylesheet" type="text/css" href="/BassEmporium/css/bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>${product.name}</title>
    </head>
    <body>
         <nav>
            <ul>
                <li><a href="/BassEmporium/home"><strong>HOME</strong></a></li>
                <li><a class="active" href="/BassEmporium/products">Products</a></li>
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
        <h1><c:out value="${product.name}"></c:out><br/><c:out value="price: ${product.price}"/></h1><br/>
        <div style="display: inline-block; float: left; width: 20%; margin-left: 5%">
            <img src="/BassEmporium/${product.image}"/>
        </div >
        <div style="display: inline-block; float: right; width: 70%; margin-right: 5%">
            <c:out value="${product.description}"/><br/><br/>
            <strong>In stock: </strong>${product.quantity}<br/><br/>
            <a class="btn btn-default" href="/BassEmporium/removeproduct/${product.id}">remove this product</a>
            <a class="btn btn-default" href="/BassEmporium/editproduct/${product.id}">edit this product</a>
             <c:if test="${product.quantity<= 0}">
                 <a class="btn btn-default disabled" href="/BassEmporium/buyproduct/${product.id}">buy now</a>
            </c:if>
            <c:if test="${product.quantity> 0}">
                 <a class="btn btn-default" href="/BassEmporium/buyproduct/${product.id}">buy now</a>
            </c:if>
        </div>
        
    </body>
</html>
