<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<center>
	<h3>用户登录</h3>
</center>
<body style="text-align: center;">
	<a href="<%=request.getContextPath()%>/CharacterServlet?name=孙昀&password=123456">单击超链接登录</a>
	<form action="<%=request.getContextPath()%>/CharacterServlet"
		method="post">
		<table border="1" width="600px" cellpadding="0" cellspacing="0"
			align="center">
			<tr>
				<td height="30" align="center">用户名：</td>
				<td>&nbsp;<input type="text" name="name" />
				</td>
			</tr>
			<tr>
				<td height="30" align="center">密 &nbsp; 码：</td>
				<td>&nbsp;<input type="password" name="password" />
				</td>
			</tr>
			<tr>
				<td height="30" colspan="2" align="center">
				<input type="submit" value="登录" />
				 &nbsp;&nbsp;&nbsp;&nbsp;
				<input type="reset" value="重置" />
			    </td>
			</tr>
		</table>
	</form>
<