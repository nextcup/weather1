<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>天气查询</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/search.do" method="POST">
请输入你想要查询的城市<br/>
<input type = "text" name="location">
<input type = "submit" value = "提交">
</form>
</body>
</html>