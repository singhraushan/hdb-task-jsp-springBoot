<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>

	<form method="POST" action="login">
	
	<table style="width:100%">  
       
	        <tr>
	    <td>UserId</td>  <td><input type="text" name="userId" /></td>
	        </tr>    
	        <tr>
	    <td>Password</td>   <td><input type="password" name="password" /></td>
	        </tr>
	        
	        <tr>
	    <td></td><td><input type="submit" value="Submit" /></td>
	        </tr>
	</form>
</body>
</html>