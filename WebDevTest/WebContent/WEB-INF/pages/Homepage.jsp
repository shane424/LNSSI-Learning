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
		<style type="text/css">
			tab1 { padding-left: 5.9em;}
			tab2 { padding-left: 8.1em;}
			tab3 { padding-left: 8.5em;}
		</style>
	</head>
<body bgcolor="#f0f0f0" onload="loadFunction()">
	<jsp:include page="Header.jsp"/>

		<h1 align=center> YO BOY ${user} </h1>
		<tab1>Names</tab1> <tab2>Roles</tab2> <tab3>Class Names</tab3>
		<br><input id="box" onClick="javascript:collapseBox()" type="button" value="Hide Grades"/>
		<input id="filternamebox" type="text" onkeyup="javascript:filterNameBox()"/>
		<input id="filterrolebox" type="text" onkeyup="javascript:filterRoleBox()"/>
		<input id="filterclassbox" type="text" onkeyup="javascript:filterClassBox()"/>
		<br>
		<div id="thetable">
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
						<td class='namecol'>${arrayItems.name}</td>
						<td>${arrayItems.age}</td>
						<td class='rolecol'>${arrayItems.role}</td>
						<td class='classnamecol'>${arrayItems.class_name}</td>
						<td>${arrayItems.class_grade}</td>
						<td>${arrayItems.chapter}</td>
						<td>${arrayItems.test_grade}</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	<jsp:include page="Footer.jsp"/>
</body>
</html>