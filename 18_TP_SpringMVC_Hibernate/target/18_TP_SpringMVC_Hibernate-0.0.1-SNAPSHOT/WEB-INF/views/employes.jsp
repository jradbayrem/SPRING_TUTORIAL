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

	<div align="center">
		<h1 style="background-color: lightgreen; color: darkgreen">Liste
			des employes</h1>
	</div>

	<div align="center">
		<table align="center" width="80%" cellspacing="0" cellpadding="5">
			<tr>
				<td align="right"><a
					href="${pageContext.request.contextPath}/employe/addEmploye"
					style="background-color: lightblue;"> Ajouter un employe </a></td>
			</tr>
			<tr>
				<td>
					<table cellspacing="0" cellpadding="6" border="1" width="100%">
						<tr>
							<td colspan="7"
								style="background-color: lightblue; color: darkgreen; font-size: 16pt"
								align="center">Liste Des Employes</td>
						</tr>
						<tr bgcolor="grey" style="color: white">
							<th>No</th>
							<th>Nom</th>
							<th>Prenom</th>
							<th>fonction</th>
							<th>departement</th>
							<th>Salaire</th>
						</tr>
						<c:forEach var="employee" items="${employeeList}">
							<tr bgcolor="lightyellow">
								<td><b>${employee.id}</b></td>
								<td>${employee.nom}</td>
								<td>${employee.prenom}</td>
								<td>${employee.fonction}</td>
								<td>${employee.departement}</td>
								<td>${employee.salaire}</td>
								<td><a
									href="deleteEmploye/${employee.id}">
										Supprimer l'employe </a></td>
								<td><a href="editEmploye?IdEmploye=${employee.id}">Edit</a></td>
							</tr>
						</c:forEach>
					</table>
				</td>
			</tr>
		</table>
	</div>
<a href="<c:url value="/j_spring_security_logout" />" >Se deconnecter</a>
</body>
</html>