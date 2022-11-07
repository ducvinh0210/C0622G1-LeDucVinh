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

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

</head>
<body>
<h1>Trang danh sach sinh vien</h1>
<a href="/student?action=add">Them moiw</a>
 <table class="table table-dark">
     <tr>
         <th>STT</th>
         <th>ID</th>
         <th>Name</th>
         <th>GENDER</th>
         <th>BIRTHDAY</th>
         <th>POINT</th>
         <th>RANK</th>
         <th>ACOUNT</th>
         <th>CLASSID</th>
         <th>EMAIL</th>
         <TH>DELETE</TH>
     </tr>
     <c:forEach var="student" items="${studentList}" varStatus="status">
         <tr>
             <td>${status.count}</td>
             <td>${student.getId()}</td>
             <td>${student.getName()}</td>
             <c:if  test="${student.isGender()}">
                 <td>Nam</td>
             </c:if>

             <c:if test="${!student.isGender()}">
                 <td>Nu</td>
             </c:if>
             <td>${student.getBirthday()}</td>
             <td>${student.getPoint()}</td>
             <c:choose>
                 <c:when test="${student.getPoint()>=8}">
                     <td>gioi</td>
                 </c:when>
                 <c:when test="${student.getPoint()>=7}">
                     <td>kha</td>
                 </c:when>
                 <c:when test="${student.getPoint()>=5}">
                     <td>trung binh</td>
                 </c:when>
                 <c:otherwise>
                     <td>yeu</td>
                 </c:otherwise>

             </c:choose>
             <td>${student.getAccount()}</td>
             <td>${student.getClassId()}</td>
             <td>${student.getEmail()}</td>
             <td><button class="btn btn-danger"> Delete</button> </td>

         </tr>





     </c:forEach>



 </table>

</body>
</html>
