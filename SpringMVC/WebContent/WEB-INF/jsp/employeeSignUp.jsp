<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="hello.jsp"%>
	<center>
		<h2>Save Employee</h2>
		<f:form action="addEmployee" method="POST">
			<table>
				<tr>
					<td><f:label path="name">Name</f:label></td>
					<td><f:input path="name" placeholder="User Name"></f:input></td>
				</tr>
				<tr>
					<td><f:label path="desig">Designation</f:label></td>
					<td><f:input path="desig" placeholder="User Designation"></f:input></td>
				</tr>
				<tr>
					<td><f:label path="id">id</f:label></td>
					<td><f:input path="id" placeholder="User ID"></f:input></td>
				</tr>
				<tr>
					<td><f:label path="userid">User ID</f:label></td>
					<td><f:input path="userid" placeholder="User Login ID"></f:input></td>
				</tr>
				<tr>
					<td><f:label path="pswd">Password</f:label></td>
					<td><f:password path="pswd" placeholder="User Password"></f:password></td>
				</tr>
				<tr>
					<td></td>
					<td ><f:button value="SUBMIT">SUBMIT</f:button></td>
				</tr>
			</table>
			<h2>${message}</h2>
		</f:form>
	</center>
</body>
</html>