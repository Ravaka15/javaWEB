<%-- 
    Document   : index
    Created on : 4 déc. 2022, 09:24:58
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
        <s:form action="produit">  
        <s:textfield name="nomProduit" label="Nom produit"></s:textfield>  
        <s:textfield name="quantiteProduit" label="Quantite produit"></s:textfield>  
        <s:textfield name="prixUnitaire" label="Prix de produit"></s:textfield>  
        <s:submit value="Enregistrer"></s:submit>  
        </s:form>
    </body>
</html>
