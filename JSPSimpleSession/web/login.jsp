<%-- 
    Document   : login
    Created on : Jul 20, 2016, 4:56:10 PM
    Author     : Vladimir
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; 
charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <%
            if (request.getParameter("submit") != null) {
                if (request.getParameter("submit").equals("Login")) {
 
                    //authentication code goes here
                     
                    session.setAttribute("access", "yes");
                    response.sendRedirect("access.jsp");
                }
                if (request.getParameter("submit").equals("LogOut")) {
                    session.invalidate();
                }
            }
        %>
        <form action="login.jsp" method="post">
            <input type="submit" name="submit" value="Login" />
            <input type="submit" name="submit" value="Log Out" />
        </form>
    </body>
</html>