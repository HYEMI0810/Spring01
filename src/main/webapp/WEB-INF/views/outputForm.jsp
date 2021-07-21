<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List</title>
</head>
<body>
	<table border=1 align=center>
		<tr>
			<th colspan=3>List
		</tr>
		<c:forEach var="i" items="${list }">
			<tr>
				<td>${i.id }
				<td>${i.writer }
				<td>${i.message }
			</tr>			
		</c:forEach>
			<tr>
				<td colspan=3 align=center><a href="/">Home</a>
			</tr>
	</table>
</body>
</html>