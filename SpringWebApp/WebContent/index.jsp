<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring MVC</title>
</head>
<body>
	<p>Welcome to Spring MVC Tutorial</p>
	<a href="hello">Click here...</a>

	<br />
	<br />
	<form action="formOne">
		UserName : <input type="text" name="name" /> <br>
		<br> Password : <input type="text" name="pass" /> <br>
		<br> <input type="submit" name="submit">
	</form>
<hr />
<a href="reservation/bookingForm">Click here for reservation.</a>  
<hr />

<a href="empform">Add Employee</a>  
<a href="viewemp">View Employees</a>  

<a href="viewemp/1">View Employees Pagenation</a>  

<HR/>
<a href="uploadform">Upload Image</a>  

</body>
</html>