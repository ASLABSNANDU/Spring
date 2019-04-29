<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.tab {
	border-collapse: collapse;
	width: 100%;
}

td, th {
	padding: 15px;
	vertical-align: bottom;
	text-align: centre;
	color: black;
	font
}

.tab th, .tab td {
	padding: 15px;
	border: 1px solid black;
	vertical-align: bottom;
	text-align: centre;
	background-color: #4CAF50;
	color: white;
}

.tab th:hover {
	background-color: #FFF;
	color: black;
}
</style>
</head>
<body>
	<center>
		<h2>Spring MVC !</h2>
		<table class="tab">
			<tr>
				<th><a href="afterLoginHome">Home</a></th>
				<th><a href="signOut">Sign Out</a></th>
			</tr>
		</table>

		<h2>${message}</h2>
	</center>



</body>
</html>