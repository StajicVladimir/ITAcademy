<%-- 
    Document   : home
    Created on : Aug 19, 2016, 3:49:41 PM
    Author     : Vladimir
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Translator 1.0</title>
    </head>
    <body style="margin: 0% 5% 5% 5%">
        <h1>Translator 1.0</h1>
        <div style="display: inline; float: left; width: 40%; margin: 10px; border: lightslategray solid 2px; border-radius: 10px;">
            <form name="translate" action="translate">
                <div style="margin: 10px;">
                    <label>Unesite reč koju želite da prevedete:</label>
                    <input class="form-control" type ="text" name="word" id="word" required/>
                </div>
                <div style="margin: 10px;">
                    <label>Odaberite jezik sa kojeg se prevodi: </label>
                    <select class ="form-control" name="language" required>
                        <option value="">Odaberite jezik</option>
                        <option value="srb">Srpski</option>
                        <option value="eng">Engleski</option>
                        <option value="de">Nemački</option>
                    </select>
                </div>
                <div style="margin: 10px;">
                    <label>Odaberite jezik na koji se prevodi:</label>
                    <select class="form-control" name="targetLanguage" required>
                        <option value="">Odaberite jezik</option>
                        <option value="srb">Srpski</option>
                        <option value="eng">Engleski</option>
                        <option value="de">Nemački</option>
                    </select>
                </div>
                <div style="margin: 10px;">
                    <input class ="form-control " type="submit" value ="translate" style="width: 9em" />
                </div>
            </form>
        </div>
        <div style="display: inline; float: right; width: 40%; margin: 10px;">
        <c:choose>
            <c:when test="${translation!=null}">
                <p style="font-size: 3em">${translation}</p>
            </c:when>
            <c:otherwise>
                 <p style="font-size: 3em;">Unesite reč za prevod</p>
            </c:otherwise>
        </c:choose>
        </div>
    </body>
</html>
