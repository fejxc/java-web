<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form name="reg" action="/experiment07/UserDemoServlet" method="post">
		 用户名：<input type="text" name="userName"/><br/>
                         密码：<input type="password" name="userPassword"/><br/>
		<input type="submit" value="登陆" id="bt" />
</body>
</html>