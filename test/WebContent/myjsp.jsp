<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 第一种方式 -->
	用户名：<%=request.getAttribute("name") %> <br / >
	密码：<%=request.getAttribute("pwd") %>	<br / >
	<hr />
	用户名：${name} <br / >
	密码：${pwd}	<br / >
	<hr/>
	1+3=${1+3}
</body>
</html>