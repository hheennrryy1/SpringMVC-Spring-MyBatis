<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>input</title>
</head>
<body>
	<form action="<%=path%>/addStudent" method="POST">
		姓名:<input type="text" name="name"/> <br />
		生日:<input type="text" name="birthday"/>
		<input type="submit" value="提交"/>
	</form>
</body>
</html>