<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/21/2022
  Time: 3:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1> SandWich Condiments</h1>
<form action="/result" style="background-color: cyan;width: 40%">
    <input name="condiment" value="" hidden>
    <input type="checkbox" name="condiment" value="Lettuce">Lettuce
    <input type="checkbox" name="condiment" value="Tomato">Tomato
    <input type="checkbox" name="condiment" value="Mustard">Mustard
    <input type="checkbox" name="condiment" value="Sprouts">Sprouts
    <button type="submit">Submit</button>

</form>
<p>Condiment:</p>
<c:forEach items="${condiment}" var="eachCondiment">
    <p>${eachCondiment}</p>
</c:forEach>




</body>
</html>
