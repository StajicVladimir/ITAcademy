<%-- 
    Document   : newproduct
    Created on : Jul 30, 2016, 2:34:35 PM
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
        <title>Add new product</title>
    </head>
    <body>
         <nav>
            <ul>
                <li><a href="/BassEmporium/home"><strong>HOME</strong></a></li>
                <li><a class="active" href="/BassEmporium/products">Products</a></li>
                <li><a  href="/BassEmporium/buyers">Buyers</a></li>
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
        <h1>Add New Product here: </h1>
        <form class="form-horizontal" action="/BassEmporium/addnewproduct" method="post">
            <div class="form-group">
                <label class="col-sm-2 control-label" for="name">Product name:</label>
                <div class="col-sm-10">
                    <input class="form-control" style="width: 20%" type ="text" name ="name" placeholder="Product name" id="name"/>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label" for="price">Product price:</label>
                <div class="col-sm-10">
                     <input class="form-control" style="width: 20%" type ="text" name ="price" placeholder="Product price" id="price"/>
                </div>
            </div>
                <div class="form-group">
                <label class="col-sm-2 control-label" for="description">Product description:</label>
                <div class="col-sm-10">
                     <input class="form-control" style="width: 20%" type ="text" name ="description" placeholder="Product description" id="description"/>
                </div>
            </div> 
            <div class="form-group">
                <label class="col-sm-2 control-label" for="image">Product image:</label>
                <div class="col-sm-10">
                     <input class="form-control" style="width: 20%" type ="text" name ="image" placeholder="Product image" id="image"/>
                </div>
            </div>    
            <div class="form-group">
                <label class="col-sm-2 control-label" for="quantity">Product quantity:</label>
                <div class="col-sm-10">
                     <input class="form-control" style="width: 20%" type ="text" name ="quantity" placeholder="Available quantity" id="quantity"/>
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
