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
    <title>tim kiem san pham</title>
</head>
<body>
<p>
    <c:if test='${requestScope["mess"] != null}'>
        <span class="message">${requestScope["mess"]}</span>
    </c:if>
</p>
<p>
    <a href="/products">Back to product list</a>
</p>
<c:if test='${requestScope["mess"] == null}'>
    <h1>Search Product</h1>
    <table border="1">
        <tr>
            <td>Id</td>
            <td>Name</td>
            <td>Price</td>
            <td>Description</td>
            <td>Manufactor</td>
        </tr>
        <c:forEach items='${products}' var="product">
            <tr>
                <td>${product.getId()}</td>
                <td>${product.getName()}</td>
                <td>${product.getPrice()}</td>
                <td>${product.getDescription()}</td>
                <td>${product.getManufacturer()}</td>
            </tr>
        </c:forEach>
    </table>
</c:if>

</body>
</html>
