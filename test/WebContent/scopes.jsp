<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% pageContext.setAttribute("username0", "sunyun00"); %>
	<% request.setAttribute("username1", "sunyun11"); %>
	<% session.setAttribute("username2", "sunyun22"); %>
	<% application.setAttribute("username3", "sunyun33"); %>
	
 	${pageScope.username0 } <br />
 	${requestScope.username1 }<br />
 	${sessionScope.username2 }<br />
 	${applicationScope.username3 }<br />
	

</body>
</html>