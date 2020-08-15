<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
使用绝对路径构造URL:<br />
	<c:url var="myURL" 
     value="http://localhost:8080/test/login.html">
		<c:param name="username" value="张三" />
		<c:param name="country" value="中国" />
	</c:url>
	<a href="${myURL}">login.html</a><br />
	使用相对路径构造URL:<br />
	<c:url var="myURL" 
     value="login.html?username=Tom&country=France" />
	<a href="${ myURL}">login.html</a>
</body>
</html>