<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Inscription</title>
        <link type="text/css" rel="stylesheet" href="form.css" />
    </head>
    <body>
        <form  action="stagiaire?action=edit" method="post">
            <fieldset>
                <legend>Ajouter un stagiaire</legend>
                <p>Vous pouvez ajouter un stagiaire via ce formulaire.</p>
				
				<label for="id">ID Stagiaire</label>
                <input type="number" id="id" name="id" value="<c:out value="${stagiaire.id_stagiaire}" />" size="10" maxlength="20"  readonly="readonly"/>
                <br />
               
                <label for="nom">Nom <span class="requis">*</span></label>
                <input type="text" id="nom" name="nom" value="<c:out value="${stagiaire.nom_stagiaire}" />" size="50" maxlength="60" />
                <br />

                <label for="prenom">Prénom <span class="requis">*</span></label>
                <input type="text" id="prenom" name="prenom" value="<c:out value="${stagiaire.prenom_stagiaire}" />" size="50" maxlength="50" />
                <br />
                
                <label for="adresse">Adresse <span class="requis">*</span></label>
                <input type="text" id="adresse" name="adresse" value="<c:out value="${stagiaire.adresse_stagiaire}" />" size="50" maxlength="50" />
                <br />

                <label for="dateNaissance">Date de naissance <span class="requis">*</span></label>
                <input type="text" id="dateNaissance" name="dateNaissance" value="<c:out value="${stagiaire.dateNaissance_stagiaire}" />" size="50" maxlength="50" />
                <br />

                <label for="email">Email</label>
                <input type="text" id="email" name="email" value="<c:out value="${stagiaire.email_stagiaire}" />" size="50" maxlength="50" />
                <br />
                
                <label for="numero">Numéro</label>
                <input type="text" id="numero" name="numero" value="<c:out value="${stagiaire.numero_stagiaire}" />" size="50" maxlength="50" />
                <br />

                <input type="submit" value="Ajouter" class="sansLabel" />
                <br />
            </fieldset>
           
        </form>
        </br>
       <a href="stagiaire?action=stagiaireview">Liste des stagiaires</a>
    </body>
</html>