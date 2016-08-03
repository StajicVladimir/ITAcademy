<%-- 
    Document   : products
    Created on : Jul 30, 2016, 12:40:41 PM
    Author     : Vladimir
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="/BassEmporium/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="/BassEmporium/css/navigation.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>Products</title>
    </head>
    <body>
        <nav>
            <ul>
                <li><a href="/BassEmporium/home"><strong>HOME</strong></a></li>
                <li><a class="active" href="/BassEmporium/products/">Products</a></li>
                <li><a href="/BassEmporium/buyers">Buyers</a></li>
                <li><a href="/BassEmporium/sales">Sales</a></li>
                
                <li style="float:right"><a href="/BassEmporium/logout/" >Logout</a>
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
        <h1>Products page</h1>
        <c:forEach items="${products}" var="product">
            <div class="col-sm-6" style="width:40%; margin: 5%; border : 1px solid lightgray; border-radius: 10px;">
                <div style="width:30%; display : inline-block; float:left">
                    <img class="img-rounded" src="/BassEmporium/${product.image}" alt="Product image"> 
                </div>
                <div style="width:70%; display : inline-block; float:right">
                    <div>
                        <h3>${product.name}</h3>
                    </div>
                    <div>
                        ${product.description}
                    </div>
                    <div>
                        <h3>Price: ${product.price} &euro;</h3>
                    </div>
                    <div>
                        <a class="btn btn-default" href="/BassEmporium/product/${product.id}"><c:out value="details"/></a>
                    </div>
                </div>
            </div>  
           <%-- <div class="col-sm-6" style="width:50%; border : 1px solid red;">
                <div class="card card-block">
                    <h3 class="card-title">${product.name}</h3>
                    <img class="card-img-top" src="../${product.image}" alt="Product image">
                    <p class="card-text">"In stock: ${product.quantity}"</p>
                    <a class="card-link" href="product/${product.id}"><c:out value="details"/></a>
                </div>
            </div> --%>
           
                
       
        </c:forEach>
        <%--<c:forEach items="${products}" var="product">
            <div style = "border : 1px solid red; padding: 4px; margin: 4px ">
                <c:out value="${product.name}"/> <img src="<c:url value="/${product.image}"/>"/><br/>
                <c:out value="In stock: ${product.quantity}"/><br/>
                <a href="product/${product.id}"><c:out value="details"/></a>
            </div>
        </c:forEach> --%>
    </body>
</html>
