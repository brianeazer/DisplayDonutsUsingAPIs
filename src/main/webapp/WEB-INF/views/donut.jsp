<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>${donut.name }</p>
<p> Calories: ${donut.calories } </p>
 Extras: <ul> <c:forEach
var="extra" items="${donut.extras}">
<li> ${extra } </li>
</c:forEach>
</ul>
</body>
</html>