<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Student Information</h2>
	<f:form action="addStudent" method="POST">
		<table>
			<tr>
				<td><f:label path="name">Name</f:label></td>
				<td><f:input path="name"></f:input></td>
			</tr>
			<tr>
				<td><f:label path="age">Age</f:label></td>
				<td><f:input path="age"></f:input></td>
			</tr>
			<tr>
				<td><f:label path="id">id</f:label></td>
				<td><f:input path="id"></f:input></td>
			</tr>
			<tr>
				<td colspan="2"><f:button value="SUBMIT">SUBMIT</f:button></td>
			</tr>
		</table>
	</f:form>
</body>
</html>