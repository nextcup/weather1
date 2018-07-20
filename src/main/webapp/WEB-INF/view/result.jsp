<%@ page language="java" import="java.util.*"  contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>天气</title>
</head>
<body>
	<% /* <c:if test="${!empty list }">
				<c:forEach items="${list}" var="list">
 					 <c:out value="${list}"></c:out>  
                  </c:forEach>
			</c:if>
			*/
		%>	
		<h4>${location}</h4>
		<h4>${timeOffset}</h4>
		<h4>${weather}</h4>
		<h4>${temperature}</h4>
</body>
</html>