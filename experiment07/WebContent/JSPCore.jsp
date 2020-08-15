<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> <!-- jstl导入核心库 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div id="head" style="text-align: center; width: 300px">
		<c:if test="${username==null }">
			<a href="/experiment07/JSTLCoreServlet">您好，请先登录</a>&nbsp;&nbsp;&nbsp;<a
				href="#">免费注册</a>
		</c:if>
		<c:if test= "${username!=null }">
			${username}&nbsp;先生/女士，您好&nbsp;<a href="/experiment07/JSPCore.jsp">退出</a>
		</c:if>
	</div>
	<br>
	<div id="contents">
		<c:choose>
			<c:when test="${not empty order }">
				<table border="1">
					<thead>
						<tr>
							<th>ID</th>
							<th>订单编号</th>
							<th>邮寄地址</th>
							<th>联系电话</th>
							<th>操作</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${order}" var="orders" varStatus="s">
							<tr>
								<td>${s.count }</td>
								<td>${orders.id }</td>
								<td>${orders.address }</td>
								<td>${orders.phone }</td>
								<td><a href="#">修改</a> <a href="#">删除</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</c:when>
			<c:otherwise>
			<div style="text-align: center; width: 300px">
				<c:out value="${order}">
					查询订单order集合为空！
				</c:out>
			</div>
			</c:otherwise>
		</c:choose>
	</div>
</body>
</html>