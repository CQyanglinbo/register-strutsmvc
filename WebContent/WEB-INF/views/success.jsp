<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>用户注册信息</h2>
	<p>用户名称:
		<s:property value="user.username"/>
	</p>
	<p>登录密码:
		<s:property value="user.pwd"/>
	</p>
	<p>重复密码:
		<s:property value="user.pwd1"/>
	</p>
	<p>电子邮箱:
		<s:property value="user.e_mail"/>
	</p>
	<p>性别:
		<s:property value="user.sex"/>
	</p>
	<p>职业:
		<s:property value="user.profession"/>
	</p>
	<p>爱好:
		<s:property value="user.hobby"/>
	</p>
</body>
</html>