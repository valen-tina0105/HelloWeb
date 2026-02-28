<%-- 
    Document   : response
    Created on : 27/02/2026, 8:56:37 p. m.
    Author     : valen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="mybean" scope="session" class="org.mypackage.hello.NameHandler" />
        <jsp:useBean id="clock" scope="session" class="java.util.Date" />
        <jsp:setProperty name="mybean" property="name"/>
        <jsp:setProperty name="mybean" property="birthdate"/>
        <jsp:setProperty name="mybean" property="age"/>
        <h1>
            <c:choose>
                <c:when test = "${clock.hours < 12 && clock.hours > 0}">
                    Buenos Dias
                </c:when>
                <c:when test = "${clock.hours > 12 && clock.hours < 18}">
                    Buenas Tardes
                </c:when>
                <c:otherwise>
                    Buenas Noches
                </c:otherwise>
            </c:choose>
        </h1>
        <h1>Hello, <jsp:getProperty name="mybean" property="name"/>!</h1>
        <h1>your age is: <jsp:getProperty name="mybean" property="age"/></h1>
    </body>
</html>
