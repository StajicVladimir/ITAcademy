<%-- 
    Document   : login
    Created on : Jul 31, 2016, 11:06:54 AM
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
        <title>Login</title>
    </head>
    <body>
          <nav>
            <ul>
                <li><a href="/BassEmporium/home"><strong>HOME</strong></a></li>
                <li><a href="/BassEmporium/products">Products</a></li>
                <li><a href="/BassEmporium/buyers">Buyers</a></li>
                <li><a href="/BassEmporium/sales">Sales</a></li>
                
                <li style="float:right"><a href="/BassEmporium/logout" >Logout</a>
                <li style="float:right"><a class="active" href="/BassEmporium/login" >Login</a>
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
        <h1>Enter your data:</h1><br/>
        <div>
            <form class="form-horizontal" action="/BassEmporium/logincheck" method="get">
                <div class="form-group">
                    <label for="username" class="col-sm-2 control-label">Username:</label>
                     <div class="col-sm-10">
                        <input type="text" class="form-control" style="width: 20%" name="username" id="username" placeholder="Username">
                     </div>
                </div>  
                
                <div class="form-group">
                    <label for="password" class="col-sm-2 control-label">Password:</label>
                    <div class="col-sm-10">
                        <input type="password" class="form-control"  style="width: 20%" name="password" id="password" placeholder="Password">
                    </div>
                </div>    
                 <div class="form-group">
                     <div class="col-sm-offset-2 col-sm-10">
                        <input type="submit" class="btn btn-default" value="Login"/> 
                     </div>
                 </div>
            </form>
        </div>
    </body>
</html>
