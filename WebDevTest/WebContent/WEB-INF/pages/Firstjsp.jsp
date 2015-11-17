<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
          
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>" + title + "</title>
</head>
<body bgcolor=#f0f0f0>

	<jsp:include page="Header.jsp"/>

		<h1 align=center> YO BOY STEVE HARVEY </h1>
	<!-- 	<h3> THE EMOTIONS </h3> -->
	<!-- 	<ul> -->
	<%-- 		<c:forEach var="arrayNames" items="${steves}"> --%>
	<%-- 			<li>${arrayNames}</li> --%>
	<%-- 		</c:forEach> --%>
	<!-- 	</ul> -->
	<!-- 	<h3> THE HARVEYS </h3> -->
	<!-- 	<ul> -->
	<%-- 	<c:forEach var="arrayPics" items="${pics}"> --%>
	<%-- 			<li>${arrayPics}</li> --%>
	<%-- 		</c:forEach> --%>
	<!-- 	</ul> -->
		<br>
		<table align="center" border="10">
			<tr>
				<td><b>Clone Number</b></td>
				<td><b>Emotion</b></td>
				<td><b>Age</b></td>
				<td><b>Picture</b></td>
			</tr>
			<c:forEach var="arrayClones" items="${clones}">
				<tr>
					<td>${arrayClones.clone_number}</td>
					<td>${arrayClones.emotion}</td>
					<td>${arrayClones.age}</td>
					<td>${arrayClones.img}</td>
				</tr>
			</c:forEach>
		</table>
	<jsp:include page="Footer.jsp"/>
</body>
</html>