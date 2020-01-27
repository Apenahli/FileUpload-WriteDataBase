<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>
	<h1>Details are given below:</h1>
	<hr>
	<table>
		<tr>
			<td>Id</td>

		</tr>
		<tr>
			<td>Name</td>

		</tr>
		<tr>
			<td>Image</td>
			<td><img src="data:image/jpg;base64,${image}"></img></td>
		</tr>
	</table>
</body>
</html>