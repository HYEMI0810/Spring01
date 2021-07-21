<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete</title>
</head>
<body>
	<form action = "deleteProc" method="post">
	<table border=1 align=center>
		<tr>
			<th colspan=3>Delete List
		</tr>
		<c:forEach var="i" items="${list }">
			<tr>
				<td><input type="radio" name="id" value=${i.id }>
				<td>${i.writer }
				<td>${i.message }
			</tr>			
		</c:forEach>
			<tr>
				<td colspan=3 align=center>
				<input type=submit value=삭제>
				<a href="/"><button type=button>Home</button></a>
			</tr>
	</table>
	</form>
</body>
</html>