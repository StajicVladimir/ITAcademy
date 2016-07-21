<%-- 
    Document   : users
    Created on : Jul 20, 2016, 3:07:40 PM
    Author     : Vladimir
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
 class User
 {
  public int id;
  public String fName;
  public String lName;
  public User(int id, String fName, String lName)
   {
    this.id = id;
    this.fName = fName;
    this.lName = lName;
   }
 }
 User[] users =
  {
   new User(1, "Peter", "Jones") ,
   new User(2, "Sarah", "Simmons") ,
   new User(3, "Ruth", "Davis") ,
  };
 %>
 <table border="1">
  <tr><td>id</td><td>First name</td><td>Last name</td></tr>
  <%
   for(int i=0;i<users.length;i++)
   {
    %>
     <tr><td><%= users[i].id %></td><td><%= users[i].fName %></td><td><%= 
users[i].lName %></td></tr>
    <%
   }
  %>
 </table>
 
 <table border="1">
            <%
                for (int i = 1; i < 11; i++) {
 
                    out.print("<tr>");
 
                    for (int j = 1; j < 11; j++) {
                        out.print("<td>" + i * j + "</td>");
                    }
 
                    out.print("</tr>");
                }
            %>
        </table>
    </body>
</html>
