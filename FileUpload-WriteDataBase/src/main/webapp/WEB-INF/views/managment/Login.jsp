<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Log in with your account</title>


<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/common.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<style>
body {
	padding-top: 40px;
	padding-bottom: 40px;
	background-color: white;/*  #eee */
	
	padding-top: 12px;
	padding-bottom: 12px;
	text-align: left;
	  height: 665px;
background-image: linear-gradient(to right top, #E0E0E0, #FFFFFF,#FFFFFF);

}

.form-signin {
	max-width: 330px;
	padding: 15px;
	margin: 0 auto;
}

.form-signin .form-signin-heading, .form-signin .checkbox {
	margin-bottom: 10px;
}

.form-signin .checkbox {
	font-weight: normal;
}

.form-signin .form-control {
	position: relative;
	height: auto;
	-webkit-box-sizing: border-box;
	-moz-box-sizing: border-box;
	box-sizing: border-box;
	padding: 10px;
	font-size: 16px;
}

.form-signin .form-control:focus {
	z-index: 2;
}

.form-signin input {
	margin-top: 10px;
	border-bottom-right-radius: 0;
	border-bottom-left-radius: 0;
}

.form-signin button {
	margin-top: 10px;
}

.has-error {
	color: red
}
</style>

</head>

<body>

<br><br>
	<div class="container">

		<form method="POST" action="${contextPath}/login" class="form-signin">


			<h2 class="form-signin-heading">Log in</h2>

			<div class="form-group ${error != null ? 'has-error' : ''}">

				<span>${message}</span> <input name="username" type="text"
					class="form-control" placeholder="Username" /> <input
					name="password" type="password" class="form-control"
					placeholder="Password" /> <span>${error}</span> <input
					type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />

				<p>
					Remember me <input type="checkbox" name="remember-me" /><br />
				</p>

				<button style="background-color: #4A696F"
					class="btn btn-lg btn-primary btn-block" type="submit">Log
					In</button>

			</div>

		</form>

	</div>

</body>
</html>