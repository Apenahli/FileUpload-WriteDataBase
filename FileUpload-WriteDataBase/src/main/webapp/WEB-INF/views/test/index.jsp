<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spr"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>File Upload Example</h1>
	
	<h1><a href="${pageContext.request.contextPath}/yum" >user managment </a></h1>

	<br>
	<hr>
	<spr:form action="${pageContext.request.contextPath}/fileupload"
		method="post" modelAttribute="user" enctype="multipart/form-data">

		<spr:input path="name" />
		<br>

		<spr:input path="surname" />
		<br>

		<input type="file" name="file">

		<br>

		<input type="submit">
		<br>
	</spr:form>

	<hr>
	<hr>
	<hr>
	<table>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>surname</th>
			<th>FileName</th>
			<th></th>
		</tr>

		<c:forEach var="user" items="${users}">
			<tr>
				<td>${user.id}</td>
				<td>${user.name}</td>
				<td>${user.surname}</td>
				<td>${user.fileName}</td>
				<td><a
					href="${pageContext.request.contextPath}/getDetail/${user.id}">
						image</a></td>

			</tr>
		</c:forEach>
	</table>

</body>
</html>