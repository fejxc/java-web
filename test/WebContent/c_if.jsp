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
		
		<c:set value="1" var="key" property="key"></c:set>
		<c:if test="${key==1 }">
		欢迎访问！！！！！
		</c:if>
</body>
</html>