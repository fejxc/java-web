<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:choose>
	   <c:when test="${empty param.username}">
 		   unKnown user.
 	   </c:when>
	   <c:when test="${param.username=='tuhui'}">
 		   ${ param.username} is sun manager.
 	   </c:when>
 	   <c:when test="${param.username=='sunyun'}">
 		   ${ param.username} is sun boss.
 	   </c:when>
	   <c:otherwise>
  		   ${ param.username} is a worker.
 	   </c:otherwise>
	</c:choose>
</body>
</html>