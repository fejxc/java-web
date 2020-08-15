<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>主页</title>
<link rel="stylesheet" href="/test06/client/css/main.css" type="text/css" />
</head>
<body class="main.css">
	<!-- 顶部部分 -->
	<%@include file="head.jsp" %>
	<!-- 顶部部分end -->

	<!--菜单列表-->
	<%@include file="menu_search.jsp" %>
	<!--菜单列表end-->
	
	<!-- 书城样图  -->
	<div id="divcenter">
	<img src="/test06/client/images/book0.jpg" width=100% height="400" border="0"  />
	<img src="/test06/client/images/book.jpg" width=100% height="400" border="0"  />
	</div>
	<!--   end -->

	<!-- 公告板 -->
	<div id="divbook">
	<table cellspacing="5" >
	<tr>
	<td>
	<img src="/test06/client/images/gonggao.jpeg" width="320" height="120" border="0"  />
	</td>
	<td><font color=red;>尊敬的井大同学，<br />
	受新型冠状病毒🦠影响，<br />
	本网上书城暂停营业，<br />
	恢复日期📅待通知！！！</font></td>
	<td ><img src="/test06/client/images/kefu.jpg" width="400" height="120" border="0"  />
	</td>
	<td ><img src="/test06/client/images/kefu2.jpg" width="400" height="120" border="0"  />
	</td>
	<tr>
	<td>
	<img src="/test06/client/images/hot.jpeg" width="320" height="120" border="0" />
	</td>
	<td>
	<img src="/test06/client/images/book1.jpg" width="200" height="220" border="0"  />
	</td>
	<td>
	<img src="/test06/client/images/book2.jpg" width="200" height="220" border="0"  />
	</td>
	<td>
	<img src="/test06/client/images/book3.jpg" width="200" height="220" border="0"  />
	</td>
	</tr>
</table>
</div>
<!-- 公告板end -->

<!-- 底部版权申明 -->
	<%@include file="foot.jsp" %>
<!-- 底部版权申明end -->
</body>
</html>