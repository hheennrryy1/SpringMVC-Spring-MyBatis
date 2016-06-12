<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
		生日：<input type="text" value="<fmt:formatDate pattern="yyyy-MM-dd" value="${student.birthday}" />" name="birthday"/>
		<input type="submit" value="提交"/>
	</form>
</body>
</html>