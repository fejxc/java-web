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
	<c:out value="${param.username }" escapeXml="false">
	<%--escapeXml的默认属性值是true，true的时候会对html编码转换，最终以字符串的形式输出  --%>
	<a href="http://www.baidu.com">百度</a>
	
	</c:out>
	
</body>
</html>