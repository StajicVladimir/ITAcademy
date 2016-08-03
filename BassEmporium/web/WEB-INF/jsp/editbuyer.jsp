<%-- 
    Document   : editbuyer
    Created on : Jul 31, 2016, 9:43:35 AM
    Author     : Vladimir
--%>
<%@taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="/BassEmporium/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="/BassEmporium/css/navigation.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Change ${buyer.username}'s data</title>
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
        <h1>Change ${buyer.username}'s data:</h1>
        <form class="form-horizontal" action ="/BassEmporium/editbuyerapply" method = "post">
            <input type="hidden" name ="id" value="${buyer.id}">
            <div class="form-group">
                <label class="col-sm-2 control-label" for="username">Username:</label>
                <div class="col-sm-10">
                    <input class="form-control" style="width: 20%" type="text" name ="username" id="username" value="${buyer.username}">
                </div>
            </div>
                
             <div class="form-group">
                <label class="col-sm-2 control-label" for="password">Password:</label>
                <div class="col-sm-10">
                    <input class="form-control" style="width: 20%" type="password" name ="password" id="password" value="${buyer.password}">
                </div>
             </div>
                
             <div class="form-group">
                <label class="col-sm-2 control-label" for="firstname">Firstname:</label>
                <div class="col-sm-10">
                    <input class="form-control" style="width: 20%" type="text" name ="firstname" id="firstname" value="${buyer.firstname}">
                </div>

             </div>
              <div class="form-group">
                <label class="col-sm-2 control-label" for="lastname">Lastname:</label>
                <div class="col-sm-10">
                    <input class="form-control" style="width: 20%" type="text" name ="lastname" id="lastname" value="${buyer.lastname}">
                </div>
              </div>
                
               <div class="form-group">
                <label class="col-sm-2 control-label" for="adress">Adress:</label>
                <div class="col-sm-10">
                    <input class="form-control" style="width: 20%" type="text" name ="adress" id="adress" value="${buyer.adress}">
                </div>
               </div>
                <div>
                    <input class="btn btn-default" type="submit" value="Apply changes"/>
                </div>
                
        </form>
    </body>
</html>
