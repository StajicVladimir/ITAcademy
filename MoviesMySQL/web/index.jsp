<%-- 
    Document   : index
    Created on : Jul 26, 2016, 12:52:12 PM
    Author     : Vladimir
--%>

<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.SQLException"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="db" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix ="l" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix ="ct" uri="/WEB-INF/tlds/customtags.tld" %>
<c:choose>
    <c:when test="${sessionScope.jezik!=null}">
        <l:setBundle basename="lokalizacija.${sessionScope.jezik}.sajt" />
    </c:when>
    <c:otherwise>
        <l:setBundle basename="lokalizacija.engleski.sajt" />
    </c:otherwise>
</c:choose>
<l:message key="price" var="lprice" />
<l:message key="buy" var="lbuy" />
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<db:setDataSource driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost/movies_g4" user="root" password="Fanta82ns" var = "conn"/>
<db:query dataSource="${conn}" sql="SELECT * FROM zanrovi" var = "zanrovi"/>
<c:choose>
    <c:when test="${param.zanr!=null}">
        <db:query dataSource="${conn}" sql="select * from filmovi where zanr = ${param.zanr}" var="filmovi" />
    </c:when>
    <c:otherwise>
        <db:query dataSource="${conn}" sql="select * from filmovi" var="filmovi" />
    </c:otherwise>
</c:choose>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Online Movie Store</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="style.css" rel="stylesheet" type="text/css" />
</head>
<body>
    
<div id="wrapper">
  <div id="inner">
    <div id="header">
        <a href='setlocale?jezik=srpski'><img style='position:absolute;right:0px;' src='https://upload.wikimedia.org/wikipedia/commons/9/94/Flag_of_Serbia.png' align="right" width='20' /></a>
        <a href='setlocale?jezik=engleski'><img style='position:absolute;right:20px;' src='http://vignette3.wikia.nocookie.net/potbs/images/b/b6/UK_Flag.png' align="right" width='20' /></a>
      <h1><img src="images/logo.gif" width="519" height="63" alt="Online Movie Store" /></h1>
      <div id="nav"> <a href="http://www.free-css.com/"><l:message key="home"/></a> | <a href="http://www.free-css.com/"><l:message key="cart"/></a> | <a href="http://www.free-css.com/"><l:message key="help"/></a> </div>
      <!-- end nav -->
      <a href="http://www.free-css.com/"><img src="images/header_1.jpg" width="744" height="145" alt="Harry Potter cd" /></a> <a href="http://www.free-css.com/"><img src="images/header_2.jpg" width="745" height="48" alt="" /></a> </div>
    <!-- end header -->
    <dl id="browse">
      <dt>Full Category Lists</dt>
        <c:forEach items ="${zanrovi.rows}" var= "zanr">
          <c:if test="${(param.age<13&&zanr.name!='Horror')||param.age>=13||param.age==null}">
              <dd><a href="?zanr=${zanr.id}">${zanr.name}</a></dd>
          </c:if>
        </c:forEach>
        
      
      <dt>Search Your Favourite Movie</dt>
      <dd class="searchform">
        <form action="http://www.free-css.com/" method="get">
          <div>
            <select name="cat">
              <option value="-" selected="selected">CATEGORIES</option>
              <option value="-">------------</option>
            </select>
          </div>
          <div>
            <input name="q" type="text" value="DVD TITLE" class="text" />
          </div>
          <div class="softright">
            <input type="image" src="images/btn_search.gif" />
          </div>
        </form>
      </dd>
    </dl>
    <div id="body">
      <div class="inner">
        
          <c:forEach items="${filmovi.rows}" var="film">
              <ct:movie title="${film.title}" price="${film.price}" slika="${film.slika}" lBuy="${lbuy}" lPrice="lprice"></ct:movie>
          </c:forEach>
        <!-- end .leftbox -->
       
        <div class="clear"></div>
      </div>
      <!-- end .inner -->
    </div>
    <!-- end body -->
    <div class="clear"></div>
    <div id="footer"> Web design by <a href="http://www.freewebsitetemplates.com">free website templates</a> &nbsp;
      <div id="footnav"> <a href="http://www.free-css.com/">Legal</a> | <a href="http://www.free-css.com/">Home</a> </div>
      <!-- end footnav -->
    </div>
    <!-- end footer -->
  </div>
  <!-- end inner -->
</div>
<!-- end wrapper -->
</body>
</html>
