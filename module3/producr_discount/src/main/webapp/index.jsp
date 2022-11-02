<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/2/2022
  Time: 4:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product Discount Calculator</title>
    <style>
      .product-discount{
        width: 350px;
        height: 400px;
        border: 1px solid #ccc;
      }
      .product-discount textarea,.product-discount input{
        margin:10px;
        padding: 5px;
      }


    </style>
  </head>
  <body>
  <div class="product-discount">
    <h1>Product Discount Calculator</h1>
    <form  method="post" action="/discount">
      <textarea cols="30" rows="10" name="description" placeholder="Product Description"></textarea>
      <input type="text" size="30"name="price" placeholder="List Price"/>
      <input type="text" size="30"name="discount" placeholder="Discount Percent"/>
      <input type="submit"name="calculate" value="Calculate Discount">
    </form>
  </div>
  </body>
</html>
