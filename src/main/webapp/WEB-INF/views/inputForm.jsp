<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>InputForm</title>
</head>
<body>
	<form action="inputProc" method="post">
	<table border=1 align=center>
		<tr>
			<th>Input
		</tr>
		<tr>
			<td><input type=text name=writer placeholder="Input writer">
		</tr>
		<tr>
			<td><input type=text name=message placeholder="Input message">
		</tr>
		<tr>
			<td align=center><button>제출</button>
		</tr>		
	</table>
	</form>
</body>
</html>