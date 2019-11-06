<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/index_like.css"/>
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/jquery-1.8.2.min.js"></script>
</head>
<body>
   <table>
     <thead>
        <tr>
          <td>编号</td>
          <td>用户名</td>
          <td>密码</td>
        </tr>
     </thead>
     
     <tbody>
       <c:forEach items="${list }" var="list">
        <tr>
          <td>${list.uid }</td>
          <td>${list.userName }</td>
          <td>${list.pwd }</td>
        </tr>
       </c:forEach>
     </tbody>
     <tfoot></tfoot>
   </table>

</body>
</html>