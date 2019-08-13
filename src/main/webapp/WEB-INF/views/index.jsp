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
<title>Donut Home</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
	<ul class="navbar-nav ml-auto" >
		<li class="navbar-brand"><a class="nav-link" href="/">Donuts List<span class="sr-only">(current)</span></a></li>
		<!-- <li class="nav-item"><a class="nav-link" href="/">Inventors List</a></li> -->
	</ul>
</nav>
<div class="container">
<div class="list-group">
				<c:forEach var="resultList" items="${display}">
					<a href="/donut-detail?id=${resultList.id}" class="list-group-item">
						<h3 class="text-danger">${ resultList.name }</h3>
						<%-- <p><label>Price per night:&nbsp;</label>$${ resultList.pricePerNight }</p> --%>
					</a>
				</c:forEach>
			</div>

</div>
</body>
</html>