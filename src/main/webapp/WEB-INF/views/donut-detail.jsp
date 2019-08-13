<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/journal/bootstrap.min.css"
	crossorigin="anonymous">
	
<title>Donut Detail</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
	<ul class="navbar-nav ml-auto" >
		<li class="navbar-brand"><a class="nav-link" href="/">Donuts List<span class="sr-only">(current)</span></a></li>
	</ul>
</nav>
<div class="container">
	<div>
		<h1 class="text-success"">${displayDetail.name}</h1>
	</div>
	<div>
	<div>
		<img src="${displayDetail.photo}" alt="donut photo" height="400" align="right"> 
	</div>
		<p><label>Calories: &nbsp;</label>${displayDetail.calories}</p>
	</div>
	
	<div class="text-danger">
		<h4><ul>
			<c:forEach var="ingredientList" items="${displayDetail.extras}">
				<li>${ingredientList}</li>
			</c:forEach>
		</ul></h4>
	</div>

 
</div>
</body>
</html>