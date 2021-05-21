<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List Of Person within company</title>
</head>
<jsp:include page="menu.jsp" />
<body>
<div id="personnInOneCompanyView">
      <table >    
        <thead>
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
		        <td>Remove Person</td>  
	       </tr>
	     </thead>
	     <tbody>
	     <c:forEach var="p" items="${personnels}">
	       <tr>
		      <td>${p.identityNumber} </td> 
		      <td>${p.personnelName}  </td>
		      <td>${p.appointment} </td>
		      <td>${p.dateOfAppointment} </td>
		      <td>${p.dateOfResignation}  </td>
		      <td>${p.status}  </td>
		      <td>${p.mobileNumber}  </td>
		      <td>${p.emailAddress}  </td>
		      <td>${p.userId}  </td>
		       <td>${p.companyId}  </td>
		       <td>${p.isActive}  </td>
		      <td><a href="/removePerson/${p.identityNumber}">Remove Person</a></td> 
		       
	       </tr>
	       </c:forEach>   
	     </tbody>  
        </table> 
   </div>
</body>
</html>