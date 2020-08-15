<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户注册</title>
<link rel="stylesheet" href="css/main.css" type="text/css" />
</head>
<body class="main.css">
	<!-- 顶部部分 -->
	<%@include file="head.jsp" %>
	<!-- 顶部部分end -->

	<!--菜单列表-->
	<%@include file="menu_search.jsp" %>
	<!--菜单列表end-->
	
<!-- 注册填写过程 -->

<form action="registerok.jsp" method="get" onsubmit="return checkAll();">
<div id="zhuce">
<table align="center" border="0" cellpadding="2" width="60%">

<h1 align="center">新用户注册</h1>

<tr>
<td align="left" width="15%" >用户名：</td>
<td><input type="text" name="username" id="usernameid" onKeyUp="checkusername();" />
<span id="usernameMsg"></span><font color=blue >大小写字母数字或者下划线1-10位，不能数字开头</font></td>
</tr>
<tr><td align="left" >密码</td>
<td><input type="password" name="password" id="passwordid" onKeyUp="checkpassword();" />
<span id="passwordMsg"></span><font color=blue >请设置8到16位密码</font></td>
</tr>
<tr><td align="left" >确认密码：</td>
<td><input type="password" name="repassword" id="repasswordid" onKeyUp="recheckpassword();" />
<span id="repasswordMsg"></span><font color=blue >两次输入密码一致</font></td>
</tr>
<tr><td align="left" >邮箱：</td>
<td><input type="text" name="email" id="emailid" onKeyUp="checkemail();" />
<span id="emailMsg"></span><font color=blue >请设置有效的邮箱</font></td>
</tr>
<tr><td align="left" >手机号码：</td>
<td><input type="text" name="phone" id="phoneid" onKeyUp="checkphone();" />
<span id="phoneMsg"></span><font color=blue >请设置有效的手机号码</font></td>
</tr>

<tr><td align="left" >爱好：</td>
<td><input type="checkbox" name="hobby"  value="sport" /> 运动🏃
			<input type="checkbox" name="hobby"  value="song" /> 唱歌🎤
			<input type="checkbox" name="hobby"  value="book" /> 阅读📖
			<input type="checkbox" name="hobby"  value="dance" /> 跳舞💃
			 </td>
</tr>
</tr>
<tr><td align="left" >性别：</td>
<td><input type="radio" name="sex" id="sexid" value="man" /> 男👨
			<input type="radio" name="sex" id="sexid" value="woman" /> 女👩</td>
</tr>

<tr><td align="left" >头像：️</td>
<td><input type="file" name="picture" id="pictureid" value="picture"  /></td>
</tr>

<tr aligh="center">  			
<td  colspan="2" align="center">

  <input type="submit" name="tijiao" value="提交" />
  <input type="reset" name="chongzhi" value="重置" /></td>
</tr>

</table>
</div>
</form>

<!-- 底部版权申明 -->
	<%@include file="foot.jsp" %>
<!-- 底部版权申明end -->

<script type="text/javascript" src="js/form.js">
</script>
</body>
</html>