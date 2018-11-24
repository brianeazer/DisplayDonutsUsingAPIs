<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Donut Demo</title>

</head>
<body>
	<h1>Welcome</h1>
	<ul>
	<c:forEach var= "donut" items="${donuts }">
		<li><a href="/donut?id=${donut.id }">${donut.name }</a></li>
	</c:forEach>
	</ul>
</body>
</html>
