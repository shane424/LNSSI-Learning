<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
          
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<script src="js/jquery-1.11.3.js"></script>
<script src="js/First.js"> </script>
<c:choose>
	<c:when test='${role.equals("student") }' >
		<link rel="stylesheet" type="text/css" href="css/First.css">
	</c:when>
	<c:otherwise>
		<link rel="stylesheet" type="text/css" href="css/Second.css">
	</c:otherwise>
</c:choose>
<title>" YOUR INFORMATION "</title>
</head>
<body bgcolor="#f0f0f0" onload="loadFunction()">
	<a href='javascript:showAlert("steve")'>Dont do it</a>
	<input id="tag1" type="text" value="MOM"/>
	<div id="tag2"  style="background-color: white; height:100px; width:101px">YOOOOOOOOOOOOOOOOO</div>
	<input id="cbox" onClick="javascript:collapseBox()" type="checkbox"/>

	<jsp:include page="Header.jsp"/>

		<h1 align=center> YO BOY ${user} </h1>
	
		<br>
		<table id="mytable">
			<tr>
				<th><b>Username</b></th>
				<th><b>Name</b></th>
				<th><b>Age</b></th>
				<th><b>Role</b></th>
				<th><b>Class</b></th>
				<th><b>Class Grade</b></th>
				<th><b>Chapter</b></th>
				<th><b>Test Grade</b></th>
			</tr>
			<c:forEach var="arrayItems" items="${table}">
				<tr>
					<td>${arrayItems.username}</td>
					<td>${arrayItems.name}</td>
					<td>${arrayItems.age}</td>
					<td>${arrayItems.role}</td>
					<td>${arrayItems.class_name}</td>
					<td>${arrayItems.class_grade}</td>
					<td>${arrayItems.chapter}</td>
					<td>${arrayItems.test_grade}</td>
				</tr>
			</c:forEach>
		</table>
	<jsp:include page="Footer.jsp"/>
</body>
</html>