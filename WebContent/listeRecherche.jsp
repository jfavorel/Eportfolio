<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Recherche de stagiaires</title>
</head>
<body>
 <form action="stagiaire?action=listeRecherche" method="post">
	Mot clé:<input type="text" name="motCle">
	<input type="submit" value="Recherche">
</form>

<table border="1">
	<tr>
		<th>ID</th><th>NOM</th><th>PRENOM</th><th>EMAIL</th>
	</tr>
<c:forEach items="${modele.stags}" var="stag">
	<tr>
		<td>${stag.id_stagiaire}</td>
		<td>${stag.nom_stagiaire}</td>
		<td>${stag.prenom_stagiaire}</td>
		<td>${stag.email_stagiaire}</td>
	</tr>
</c:forEach>
</table>
<br/>
<a href="stagiaire?action=stagiaireview">Liste des stagiaires</a>
</body>
</html>