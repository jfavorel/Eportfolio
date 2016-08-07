<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Liste des stagiaires</title>
</head>
<body>
	<table border="1">
		<thead>
			<tr>
				<th>Stagiaire ID</th>
				<th>Nom</th>
				<th>prénom</th>
				<th>adresse</th>
				<th>Date de naissance</th>
				<th>Email</th>
				<th>Numéro AFPA</th>
				<th colspan="2">Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${stagiaires}" var="stag">
				<tr>
					<td><c:out value="${stag.id_stagiaire}" /></td>
					<td><c:out value="${stag.nom_stagiaire}" /></td>
					<td><c:out value="${stag.prenom_stagiaire}" /></td>
					<td><c:out value="${stag.adresse_stagiaire}" /></td>
					<td><c:out value="${stag.dateNaissance_stagiaire}" /></td>
					<td><c:out value="${stag.email_stagiaire}" /></td>
					<td><c:out value="${stag.numero_stagiaire}" /></td>
					
					<td><a href="stagiaire?action=edit&id=<c:out value="${stag.id_stagiaire }"/>">Mise à jour</a></td>
					<c:set var="bold" value="${stag.nom_stagiaire}"/>
					<td><a href="stagiaire?action=delete&id=<c:out value="${stag.id_stagiaire }"/>" onclick="return confirm('Etes vous sûre de vouloir supprimer <c:out value="${fn:toUpperCase(bold)}" />? ');">Supprimer</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<p>
		<a href="stagiaire?action=insert">Ajouter un stagiaire</a>
	</p>
	<p>
		<a href="stagiaire?action=listeRecherche">Rechercher un stagiaire</a>
	</p>
</body>
</html>