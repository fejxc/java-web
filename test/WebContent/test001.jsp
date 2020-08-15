<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body> 
<c:out value="Hello你好a a a a "></c:out>  <br/>
<c:out value="测试JSTL"></c:out>
<hr />
	Hello你好～～～
<%!
	int a=8,b=7; //定义两个变量
%>
<%!
	public String print(){ //定义方法 
	String str = "java-web～～～";
	return str;
}
%>
<%
	out.print(a*b+"<br/>");
	out.print(print()+"<br/>");
%>
<%=a+b %><br/>     <%--jsp表达式后面不能有分号 --%>
<%=print() %>

<!-- html注释 -->
<%--jsp注释 --%>
</body>
</html>