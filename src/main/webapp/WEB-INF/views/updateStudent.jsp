<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>update</title>
</head>
<body>
	<form action="<%=path%>/updateStudent" method="POST">
		<input type="hidden" value="${student.id}" name="id"/>
		姓名：<input type="text" value="${student.name}" name="name"/>
		生日：<input type="text" value="${student.birthday}" name="birthday"/>
		<input type="submit" value="提交"/>
	</form>
</body>
</html>