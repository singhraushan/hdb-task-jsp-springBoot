 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
table, th, td {
  border: 1px solid black;
  padding: 1px;
}
table {
  border-spacing: 15px;
}
</style>
</head>
<body>

</body>
</html> 

<div style="border: 1px solid #ccc; padding: 5px; margin-bottom: 20px;">
     <table style="width:100%">  
        <thead>
	        <tr> 
		        <td><a href="${pageContext.request.contextPath}/companyParticular">Company Particular</a></td> 
		        <td><a href="${pageContext.request.contextPath}/updateCompanyAddress">View/Update Company Address</a></td> 
		        <td><a href="${pageContext.request.contextPath}/updatePersonnel">Update Personnel Details</a></td> 
		        <td><a href="${pageContext.request.contextPath}/allActivePersonnel">View All active Personnel</a></td> 
		        <td>
		            <u><h2 style="color: red;">
                     <a onclick="document.forms['logoutForm'].submit()">Logout</a>
                   </h3></u>

				    <form id="logoutForm" method="POST" action="logout">
				    </form></td>
		         
	       </tr>
	     </thead>
    </table>     
            

</div>