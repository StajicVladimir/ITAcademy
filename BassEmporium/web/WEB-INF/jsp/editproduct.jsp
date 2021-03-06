<%-- 
    Document   : editproduct
    Created on : Jul 30, 2016, 3:22:34 PM
    Author     : Vladimir
--%>
<%@taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="/BassEmporium/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="/BassEmporium/css/navigation.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit product</title>
    </head>
    <body>
         <nav>
            <ul>
                <li><a  href="/BassEmporium/home"><strong>HOME</strong></a></li>
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
        <h1>Enter new data for ${product.name}</h1>
        <form class="form-horizontal" action="/BassEmporium/editproductapply" method = "post">
            <div class="form-group">
                <input type="hidden" name ="id" value="${product.id}">
                <label class="col-sm-2 control-label" for="name">Name:</label>
                <div class="col-sm-10">
                    <input class="form-control" style="width: 20%" type ="text" name ="name" value="${product.name}" id="name"/>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label" for="price">Price:</label>
                <div class="col-sm-10">
                     <input class="form-control" style="width: 20%" type ="text" name ="price" value="${product.price}" id="price"/>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label" for="description">Description:</label>
                <div class="col-sm-10">
                     <input class="form-control" style="width: 20%" type ="text" name ="description" value="${product.description}" id="description"/>
                </div>
            </div> 
            <div class="form-group">
                <label class="col-sm-2 control-label" for="image">Image:</label>
                <div class="col-sm-10">
                     <input class="form-control" style="width: 20%" type ="text" name ="image" value="${product.image}" id="image"/>
                </div>
            </div>    
            <div class="form-group">
                <label class="col-sm-2 control-label" for="quantity">Quantity:</label>
                <div class="col-sm-10">
                     <input class="form-control" style="width: 20%" type ="text" name ="quantity" value="${product.quantity}" id="quantity"/>
                </div>
            </div>  
           <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <input type="submit" class="btn btn-default" value="Apply"/> 
                </div>
            </div>
        </form>
    </body>
</html>
