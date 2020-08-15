<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% int[] array = {3,21}; %>
	数组指定元素为：<%=(array[99]) %> <!--此处会产生异常  -->
</body>
</html>