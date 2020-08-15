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
colorsList集合（指定迭代范围和步长）<br />
	<%
		List colorsList=new ArrayList();
		colorsList.add("red");
		colorsList.add("yellow");
		colorsList.add("blue");
		colorsList.add("green");
		colorsList.add("black");
		request.setAttribute("list", colorsList);
	%>
	<c:forEach var="color" items="${list }" begin="0" end="4" step="2">
		${color }&nbsp; <br/>
	</c:forEach>
</body>
</html>