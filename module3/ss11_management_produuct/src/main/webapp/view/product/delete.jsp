<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/7/2022
  Time: 2:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>xoa san pham</title>
</head>
<body>
<h1>xoa san pham</h1>
<p><a href="/products"> quay lai trang list</a></p>
<form method="post">
    <h3>ban co chac xoa khong</h3>
    <fieldset>
        <legend>Product information</legend>
        <table>
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
            <tr>
                <td><input type="submit" value="Delete product"></td>
                <td><a href="/products">Back to customer list</a></td>
            </tr>
        </table>
    </fieldset>






</form>

</body>
</html>
