<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	

	
	
	<%-- ${cookie.userName } <br/>
	${cookie.userName.name } <br/>
	${cookie.userName.value } <br/> 
	<% response.addCookie(new Cookie("username","sunyun")); %> --%>
	<% response.addCookie(new Cookie("userName", "itcast")); %> 
 	Cookie对象的信息：<br /> 
	${cookie.userName } <br /> 
	Cookie对象的名称和值：<br /> 
	${cookie.userName.name }=${cookie.userName.value }
	
	
	
	
</body>
</html>