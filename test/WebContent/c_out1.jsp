<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- 第一个out标签 --%>
	<c:out value="${param.username}" default="unknown"></c:out>
	<br />
	
	<c:out value="${param.username}">unknown </c:out>
	<br />
</body>
</html>