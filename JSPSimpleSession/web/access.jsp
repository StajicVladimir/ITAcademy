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
 
            // determine sessions existence
            if (session.getAttribute("access") == null || 
!session.getAttribute("access").equals("yes")) {
                response.sendRedirect("login.jsp");
            }
            out.print(session.getAttribute("access"));
        %>
        <h1>Welcome user!</h1>
    </body>
</html>