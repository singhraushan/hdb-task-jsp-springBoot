<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html >
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All Active Personnels</title>
</head>
<jsp:include page="menu.jsp" />
<body>
   <div id="allActivePersonnelsView">
      <table >    
        <thead>
	        <tr> 
		        <td>Company Name</td> 
		        <td>Identity Number</td> 
		        <td>Personnel Name</td> 
		        <td>Appointment</td> 
		        <td>Mobile Number</td>
	       </tr>
	     </thead>
	     <tbody>
	       <c:forEach var="dto" items="${dtos}"> 
		      <tr>
		       <td>${dto.companyName}</td>
		       <td>${dto.identityNumber}</td>
		       <td>${dto.personnelName}</td>
		       <td>${dto.appointment}</td>
		       <td>${dto.mobileNumber}</td>
	         </tr> 
	       </c:forEach>  
	     </tbody>  
        </table> 
   </div>
</body>
</html>