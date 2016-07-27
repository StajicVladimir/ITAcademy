<%-- 
    Document   : Biciklisti
    Created on : Jul 27, 2016, 9:13:19 AM
    Author     : Vladimir
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Biciklisti</title>
    </head>
    <body>
        
        <%
            boolean ispravan= false;
            /*Cookie[] allCookies = request.getCookies();
            if(allCookies != null){
                for(Cookie ck:allCookies){
                    if(ck.getName().equals("ime")){
                        ispravan = true;
                        out.println(ck.getValue());
                    }
                }
            }*/
            
           /* Object username = session.getAttribute("username");
            if(username!= null){
                ispravan = true;
            }
            if (ispravan){*/
            
        %>
        <c:if test="${sessionScope.username!= null}">
            <h1>Hello ${sessionScope.username}</h1>
        </c:if>
         <c:if test="${sessionScope.username== null}">
            <h1>Login error</h1>
        </c:if>  
        
        <%
           /* }else{
                out.print("Login error");
    }*/
        %>
    </body>
</html>
