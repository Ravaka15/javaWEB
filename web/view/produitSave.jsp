<%-- 
    Document   : produitSave
    Created on : 4 déc. 2022, 10:10:43
    Author     : ZoR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello Voici le commande que vous avez fait</h1>
            Nom produit:<s:property value="nomProduit"/><br/>  
            Quantite produit:<s:property value="quantiteProduit"/><br/>  
            Prix produit:<s:property value="prixUnitaire"/><br/>  
    </body>
</html>
