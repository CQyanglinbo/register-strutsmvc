<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body>
<h1 id="id">该用户名已存在！！</h1>
<script>
	var time = 3;
	var timer = setInterval('redirect()', 1000);
	function redirect() {
		var t = document.getElementById("id");
		if (time > 0) {
			t.innerHTML = time;
			time--;
		} else {
			clearInterval(timer);
			window.history.back(-1); 
		}
	}
</script>
</body>
</html>