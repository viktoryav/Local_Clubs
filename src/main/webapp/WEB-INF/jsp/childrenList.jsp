<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Children List</title>
</head>
<body>


	<table>
	
		<tr>
			<th>Firsname</th><th>Surname</th>
		</tr>
	
		<c:forEach items="${club.children}" var="child">
		
			<tr>
				
				<td>${child.contactDetails.firstName}</td><td>${child.contactDetails.lastName}</td>
				
				<td>
				</td>
				
			</tr>
		
		</c:forEach>
	
	</table>

</body>
</html>