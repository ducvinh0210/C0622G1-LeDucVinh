<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/7/2022
  Time: 2:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Product</title>
</head>
<body>
<h1> chi tiet san pham</h1>
<p>
    <a href="/products"> quay ve trang list</a>
</p>
<table>

    <tr>
    <tr>
        <td>ID: </td>
        <td>${product.getId()}</td>
    </tr>
    <tr>
        <td>Name: </td>
        <td>${product.getName()}</td>
    </tr>
    <tr>
        <td>Price: </td>
        <td>${product.getPrice()}</td>
    </tr>
    <tr>
        <td>Description: </td>
        <td>${product.getDescription()}</td>
    </tr>
    <tr>
        <td>Manufacturer: </td>
        <td>${product.getManufacturer()}</td>
    </tr>

    </tr>
</table>

</body>
</html>
