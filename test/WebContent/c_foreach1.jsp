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
	<%
		String[] fruits = { "apple", "orange", "grape", "banana" };
		request.setAttribute("ff", fruits);
	%>
	
	String数组中的元素：
	<br />
	<c:forEach var="name" items="${ff }">
	   ${name } <br/>
	</c:forEach>
	
	<%
		Map userMap = new HashMap();
		userMap.put("Tom", "123");
		userMap.put("Make", "1234");
		userMap.put("Lina", "12345");
		request.setAttribute("tt", userMap);
	%>
	<hr/>
	HashMap集合中的元素：<br/>
	<c:forEach var="m" items="${tt }">
		${m.key }&nbsp;${m.value }<br/>
	
	</c:forEach>
	
	
	
	
	
	
</body>
</html>