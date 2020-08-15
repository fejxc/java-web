<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/param.jsp" method="get" >
		num1:<input type="text" name="num1"> <br />
		num2:<input type="text" name="num"> <br />
		num3:<input type="text" name="num"> <br />
		<input type="submit" value	="提交"> &nbsp;&nbsp;
		<%-- &nbsp;起空格作用 --%> 
		<input type="submit" value	="重置"> <br />
		<hr />
		num1: ${param.num1} <br />
		num2: ${paramValues.num[0]} <br />
		num3: ${paramValues.num[1]} <br /> 
	</form>
	
</body>
</html>