<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>error page</title>
</head>
<body>
	<!-- 显示异常信息 -->
     <%=exception.getMessage() %><br />
</body>
</html>