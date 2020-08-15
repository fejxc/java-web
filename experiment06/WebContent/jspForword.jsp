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
	<!--  产生随机数Math.random()：产生一个[0，1)之间的随机数。 [2] 
		返回指定范围的随机数(m-n之间)的公式：改正公式:Math.random()*(n+1-m)+m -->
	<% Random rnd = new Random();
	double i=rnd.nextDouble();%>
	<%if(i>0.5){%>
	 <jsp:forward page="forword1.jsp" />
	 <%}else {%>
	      <jsp:forward page="forword2.jsp" />
	<%}%>
		
	
<%-- <c:set value="i" var="key" property="key"></c:set>
		<!--  jsp:forward 元素 -->
		<c:choose>
                   <c:when test = "${'<%=i %>' > 0.5 } " >
                  	<jsp:forward page="forword1.jsp" />	
                   </c:when>
                   <c:otherwise>
                   	<jsp:forward page="forword2.jsp" />
                   </c:otherwise>

		</c:choose>  --%>
</body>
</html>