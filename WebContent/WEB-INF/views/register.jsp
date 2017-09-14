<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
<script type="text/javascript" src="js/register.js"></script>
</head>
<body>
	<div class="div">
		<div class="div1">
			<img src="images/logo.png" style="width: 50px;height: 50px;margin-bottom: -20px;">
			<h2 style="display: inline-block;margin: auto;">用户注册</h2>
		</div>	
		<div class="div2">
			<form action="hello.action" method="post" onsubmit="return click1();">
				<p class="p">用户名称：
					<input class="input" type="text" name="user.username" id="username" required="required" placeholder="请输入您的用户名！">
				</p>
				<p class="p">登录密码：
					<input class="input" type="password" name="user.pwd" id="pwd" required="required" placeholder="请输入您的密码！">
				</p>
				<p class="p">重复密码：
					<input class="input" type="password" name="user.pwd1" id="pwd1" required="required" placeholder="请输入您的确认密码！">
				</p>
				<p class="p">电子邮箱：
					<input class="input" type="email" name="user.e_mail" required="required" placeholder="请输入您的邮箱！">
				</p>
				<p class="p2">&nbsp;性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别&nbsp;:
					<input type="radio" name="user.sex">男<input type="radio" name="user.sex">女</p>
				<p class="p1">职&nbsp;&nbsp;&nbsp;&nbsp;业:&nbsp;
					<select style="width:400px;height: 30px;" name="user.profession">
						<option>学生</option>
						<option>工人</option>
						<option>教师</option>
						<option>程序员</option>
						<option>测试工程师</option>
					</select>
				</p>
				<p class="p1" style="height: 100px;">爱&nbsp;&nbsp;&nbsp;&nbsp;好:&nbsp;
					<select style="width:400px;" size="4" multiple="multiple" name="user.hobby">
						<option selected="selected">书法</option>
						<option selected="selected">乐器</option>
						<option selected="selected">运动</option>
						<option selected="selected">编程</option>
					</select>
				</p>
				<hr>
				<div class="div3">
					<input class="button1" type="submit" value="注册">
					<span>&nbsp;&nbsp;&nbsp;&nbsp; </span>
					<input class="button1" type="reset" value="重置">
				</div>
				<s:token/>
			</form>
		</div>
	</div>
	<footer>
		Copyright&nbsp;&copy;&nbsp;2017 轻实训版权所有
	</footer>
</body>
</html>