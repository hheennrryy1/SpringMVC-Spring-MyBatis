<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>list</title>
</head>
<body>
	<table>
		<c:forEach items="${studentList}" var="student">
			<tr>
				<td>${student.name}</td>
				<td>${student.birthday}</td>
				<td><a href="">update</a></td>
			</tr>
		</c:forEach>
	</table>
	
	<a href="input">addUser</a>
	
</body>
</html>