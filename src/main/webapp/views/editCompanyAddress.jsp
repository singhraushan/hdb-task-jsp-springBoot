<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<jsp:include page="menu.jsp" />
<body>


        <h1>Edit Company Address</h1>  
       <form:form method="POST" action="/editsave">    
        <table >    
        <tr>  
        <td></td>    
         <td><form:hidden  path="id" /></td>  
         </tr>   
         <tr>    
          <td>Block Number : </td>   
          <td><form:input path="blockNumber"  /></td>  
         </tr> 
         <tr>    
          <td>Unit Level : </td>   
          <td><form:input path="unitLevel"  /></td>  
         </tr>
         <tr>    
          <td>Unit Number : </td>   
          <td><form:input path="unitNumber"  /></td>  
         </tr>   
         <tr>    
          <td>Building Name :</td>    
          <td><form:input path="buildingName" /></td>  
         </tr>   
         <tr>    
          <td>Street Name :</td>    
          <td><form:input path="streetName" /></td>  
         </tr>   
         <tr>    
          <td>Company Id :</td>    
          <td><form:hidden path="companyId" /></td>  
         </tr>
           
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Edit Save" /></td>    
         </tr>    
        </table>    
       </form:form>
       
</body>
</html>