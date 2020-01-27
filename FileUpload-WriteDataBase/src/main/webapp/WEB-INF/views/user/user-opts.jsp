<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spr"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">

<link
	href="<c:url value="/resources/static/css/home/bootstrap.min.css"/>"
	rel="stylesheet">

<link href="<c:url value="/resources/static/css/home/panel.css"/>"
	rel="stylesheet" />
</head>
<body>
	<br>
	
	
	<h1> testttt   ${user} </h1>

	<div class="container">

		<table class="table table-hover table-bordered">
			<tr>
				<th scope="col">full_name</th>
				<th scope="col">username</th>
				<th scope="col">email</th>
				<th scope="col">phone</th>
				<th scope="col">role</th>

			</tr>

			<c:forEach var="userForm" items="${users}">
				<tr>
					<td>${userForm.fullname}</td>
					<td>${userForm.username}</td>
					<td>${userForm.email}</td>
					<td>${userForm.phone}</td>
					<td><c:forEach var="r" items="${userForm.roles}">
					      ${r.name}
					  </c:forEach></td>
				</tr>
			</c:forEach>

		</table>
	</div>



	<!-- ---------  -->

	<script src="<c:url value="/resources/static/js/jquery-3.4.1.min.js"/>"></script>

	<script src="<c:url value="/resources/static/js/bootstrap.min.js"/>"></script>

	<script src="<c:url value="/resources/static/js/admin-panel.js"/>"></script>
</body>
</html>