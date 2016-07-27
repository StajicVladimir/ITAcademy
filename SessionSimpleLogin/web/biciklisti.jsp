<%-- 
    Document   : Biciklisti
    Created on : Jul 27, 2016, 9:13:19 AM
    Author     : Vladimir
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Biciklisti</title>
    </head>
    <body>
        
        <%
            boolean ispravan= false;
            Cookie[] allCookies = request.getCookies();
            if(allCookies != null){
                for(Cookie ck:allCookies){
                    if(ck.getName().equals("ime")){
                        ispravan = true;
                        out.println(ck.getValue());
                    }
                }
            }
            if (ispravan){
        %>
        <h1>Hello biciklisti!!!</h1>
        <%
            }else{
                out.print("Login error");
    }%>
    </body>
</html>
