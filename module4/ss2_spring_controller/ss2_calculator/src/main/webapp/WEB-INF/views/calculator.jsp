<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/21/2022
  Time: 5:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/result">
    <input type="number" name="a" placeholder=".....input numberfirst" required>
    <input type="number" name="b" placeholder="......input numbersecond" required>

   <button type="submit" value="add" name="submit">Addation(+)</button>
   <button type="submit" value="sub" name="submit">Subtraction(-)</button>
   <button type="submit" value="multiple" name="submit">Multiplication(x)</button>
   <button type="submit" value="division" name="submit">Division(/)</button>

</form>
<p> Result : ${result}</p>

</body>
</html>
