<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% pageContext.setAttribute("username", "pageContext"); %>
<%-- 	<% application.setAttribute("username", "application"); %> --%>
	<hr>
	表达式\${pageScope.username}的值为：${pageScope.username}<br />
	表达式\${requestScope.username1}的值为：${requestScope.username} <br /> 
	表达式\${sessionScope.username}的值为：${sessionScope.username} <br />
	表达式\${applicationScope.username}的值为：${applicationScope.username}<br /> 
     
	表达式\${username}的值为：${username} 
	
</body>
</html>