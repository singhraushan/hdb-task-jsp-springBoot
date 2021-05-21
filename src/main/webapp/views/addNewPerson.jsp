<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Adding new Personnel</title>
</head>
<jsp:include page="menu.jsp" />
<body>

<div id="addNewPersonnelDiv">
	<form method="POST" action="/addNewPersonnel">
	
	    <table >    
	       <tr> 
		        <td>personnel Name</td> 
		        <td>appointment</td> 
		        <td>dateOfAppointment</td>
		        <td>status</td> 
		        <td>mobileNumber</td> 
		        <td>emailAddress</td> 
		        <!-- <td>userId</td>  -->
		        <td>companyId</td> 
		        <td>isActive</td> 
	      </tr>
	      <tr>
		      <td><input type="text" name="personnelName"  /></td>
		      <td><input type="text" name="appointment" /></td>
		      <td><input type="date" value="2021-05-21" name="dateOfAppointment" /></td>
		      <td><input type="text" name="status" /></td>
		      <td><input type="text" name="mobileNumber" /></td>
		      <td><input type="text" name="emailAddress" /></td>
		     <!--  <td><input type="text" name="userId" /></td> -->
		      <td><input type="text" name="companyId" value=${companyId} readonly /></td>
		      <td><input type="text" name="isActive" value="true" readonly /></td>
	      </tr>    
        </table> 
	    <input type="submit" value="Submit" />
	</form>

	</div>
	
</body>
</html>