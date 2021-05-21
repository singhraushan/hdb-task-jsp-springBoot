<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Personnel Details</title>
</head>
<jsp:include page="menu.jsp" />
<body>
<div id="updatePersonnelDiv">
	<form method="POST" action="/updatePersonnel">
	
	    <table >    
	       <tr> 
		        <td>identityNumber</td> 
		        <td>personnelName</td> 
		        <td>appointment</td> 
		        <td>dateOfAppointment</td> 
		        <td>dateOfResignation</td> 
		        <td>status</td> 
		        <td>mobileNumber</td> 
		        <td>emailAddress</td> 
		        <td>userId</td> 
		        <td>companyId</td> 
		        <td>isActive</td> 
	      </tr>
	      <tr>
		      <td><input type="text" name="identityNumber" value=${p.identityNumber} readonly /></td> 
		      <td><input type="text" name="personnelName" value=${p.personnelName} readonly /></td>
		      <td><input type="text" name="appointment" value=${p.appointment} /></td>
		      <td><input type="date" name="dateOfAppointment" value=${p.dateOfAppointment} /></td>
		      <td><input type="date" name="dateOfResignation" value=${p.dateOfResignation} /></td>
		      <td><input type="text" name="status" value=${p.status} /></td>
		      <td><input type="text" name="mobileNumber" value=${p.mobileNumber} /></td>
		      <td><input type="text" name="emailAddress" value=${p.emailAddress} /></td>
		      <td><input type="text" name="userId" value=${p.userId} readonly /></td>
		      <td><input type="text" name="companyId" value=${p.companyId} readonly /></td>
		      <td><input type="text" name="isActive" value=${p.isActive} readonly/></td>
	      </tr>    
        </table> 
	    <input type="submit" value="Submit" />
	</form>

	</div>
</body>
</html>