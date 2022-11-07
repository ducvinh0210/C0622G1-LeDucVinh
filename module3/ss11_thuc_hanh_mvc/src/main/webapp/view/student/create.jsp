<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/4/2022
  Time: 4:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
    <title>Title</title>
</head>
<body>
<h1>trang them moi</h1>
<a href="/student"> quay lai trang list</a>
<c:if test="${mess!=null}">
    <span style="color: red">${mess}</span>
</c:if>
<form action="/student?action=add" method="post">
    <pre>Id <input type="text"name="id"></pre>
    <pre>Name<input type="text" name="name"></pre>
    <pre>Gender<input type="radio" name="gender" value="true">Nam <input type="radio" value="false" name="gender">NU</pre>
    <pre>Birthday: <input type="date" name="birthday" ></pre>
    <pre>Point <input type="number" name="point"></pre>
    <pre>Account <input type="text" name="account"></pre>
<pre>Email<input type="text"name="email"></pre>
    <pre>
        classId<select name="classId">
        <option value="">chon lop</option>
        <option value="1">C06</option>
        <option value="2">C07</option>
        <option value="3">C08</option>

    </select>
    </pre>
    <pre><button>save</button></pre>





</form>






</body>
</html>
