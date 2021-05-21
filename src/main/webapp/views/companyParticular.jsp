<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Company Particulars</title>
</head>
<jsp:include page="menu.jsp" />
<body>
${error}
   <div id="companyParticularsView">
      <table >    
        <thead>
	        <tr> 
		        <td>hdbRegistrationNumber</td> 
		        <td>companyName</td> 
		        <td>modeOfBusiness</td> 
		        <td>businessRegistrationNumber</td> 
		        <td>businessRegistrationEffectiveDate</td> 
		        <td>businessRegistrationExpiryDate</td>
		        <td>Add Person</td>
		        <td>Remove Person</td>  
	       </tr>
	     </thead>
	     <tbody>
	       <c:forEach var="cp" items="${cps}">
	         <tr >
			      <td>${cp.hdbRegistrationNumber}</td> 
			      <td>${cp.companyName}</td>
			      <td>${cp.modeOfBusiness}</td>
			      <td>${cp.businessRegistrationNumber}</td>
			      <td>${cp.businessRegistrationEffectiveDate}  </td>
			      <td>${cp.businessRegistrationExpiryDate}  </td>
			      <td><a href="addPersonToCompany/${cp.hdbRegistrationNumber}">Add Person</a></td> 
			      <td><a href="removePersonFromCompany/${cp.hdbRegistrationNumber}">Remove Person</a></td> 
	         </tr>  
	       </c:forEach>  
	     </tbody>  
        </table> 
   </div>
</body>
</html>