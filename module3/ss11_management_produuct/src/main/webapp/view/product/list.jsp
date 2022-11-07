<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/6/2022
  Time: 8:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

</head>
<body>
<h1>Products</h1>
<p>
    <a href="/products?action=create">Them moi</a>
</p>

<form action="/products?action=search" method="post">
    <input type="text"name="name">
    <input type="submit" value="Tim kiem">



</form>
<table class="table table-dark">
    <tr>
        <td>Id</td>
        <td>Name</td>
        <td>Price</td>
        <td>Description</td>
        <td>Manufactor</td>
        <td>delete</td>
        <td>edit</td>
    </tr>

        <c:forEach items='${products}' var="product">
            <tr>
                <td>${product.getId()}</td>
                <td><a href="/products?action=view&id=${product.getId()}">${product.getName()}</a></td>
                <td>${product.getPrice()}</td>
                <td>${product.getDescription()}</td>
                <td>${product.getManufacturer()}</td>
                <td><button class="btn btn-primary"><a style="color: red" href="/products?action=edit&id=${product.getId()}">edit</a></button></td>
                <td><button class="btn btn-primary"><a style="color: red" href="/products?action=delete&id=${product.getId()}">delete</a></button></td>




</tr>



        </c:forEach>




</table>



</body>
</html>
