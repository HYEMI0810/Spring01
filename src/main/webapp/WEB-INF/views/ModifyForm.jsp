<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Modify</title>
</head>
<body>
	<form action=modifyProc method="post">
	<table border=1 align=center>
		<tr>
			<th colspan=3>List
		</tr>
		<c:forEach var="i" items="${list }">
			<tr>
				<td><input type=radio name=id value=${i.id }>
				<td>${i.writer }
				<td>${i.message }
			</tr>			
		</c:forEach>
			<tr>
				<td><input type=text name=writer placeholder="작성자">
				<td><input type=text name=message placeholder="메세지">
				<td><input type=submit value=수정>
			</tr>
			<tr>
				<td colspan=3 align=center>
				<a href="/"><button type=button>Home</button></a>
			</tr>
	</table>
	</form>
</body>
</html>