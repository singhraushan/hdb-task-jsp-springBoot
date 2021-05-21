<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View/Update Company Address</title>
</head>
<jsp:include page="menu.jsp" />
<body>

<h1>Company Address List</h1>  
	<table border="2" width="70%" cellpadding="2">  
		<tr><th>Id</th><th>Block Number</th><th>Unit Level</th><th>Building Name</th><th>Street Name</th><th>Company Id</th><th>Edit</th></tr>  
   	  <c:forEach var="ca" items="${cas}">   
	   <tr>  
	   <td>${ca.id}</td>  
	   <td>${ca.blockNumber}</td>  
	   <td>${ca.unitLevel}</td>  
	   <td>${ca.buildingName}</td> 
	   <td>${ca.streetName}</td>
	   <td>${ca.companyId}</td>  
	   <td><a href="editCompanyAddress/${ca.id}">Edit</a></td>  
	   </tr>  
   	</c:forEach>  
   </table>  
   <br/>  
   
</body>
</html>
