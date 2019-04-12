<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

		<h1  style= "background-color: lightgreen; 
		             color: darkgreen;
		             text-align:center;" >
			${name}
		</h1>
		
		<h1 style=" background-color: lightblue; 
		            color: darkgreen; 
		            font-size: 16pt;
		            text-align:center;" >
			${salutation}
		</h1>
		
		
		<table align="center" cellspacing="10">
	
		<tr style="color: blue; font-style: italic; font-size: 14pt">
			<td align="left">Click Here</td>
			<td align="right" bgcolor="lightgreen">
				<a href="listemployes">Liste Des Employes</a>
			</td>
		</tr>
	</table>
	<a href="<c:url value="/j_spring_security_logout" />" >Se deconnecter</a>
</body>
</html>