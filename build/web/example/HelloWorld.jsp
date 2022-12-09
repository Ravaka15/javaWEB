<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
    <head>
        <title><s:text name="HelloWorld.message"/></title>
    </head>

    <body>
    <center>
        <h1>Hello World</h1>
    </center> 
    <h3>Addition</h3>
        <s:form action="operation">
            <s:textfield name="nbr1" label="Nombre 1"></s:textfield> 
            <s:textfield name="nbr2" label="Nombre 2"></s:textfield>
        <s:submit value="Operation"></s:submit>
        </s:form>
        Addition  <s:property value="addition"/><br/>
        Soustraction  <s:property value="soustraction"/><br/>
        Multiplicagtion  <s:property value="multiplication"/><br/>
        Division  <s:property value="division"/><br/><br/>
        
    <h3>Equation second degree</h3> 
        <s:form action="equationsecond">
            <s:textfield name="nombre1" label="Nombre 1"></s:textfield> 
            <s:textfield name="nombre2" label="Nombre 2"></s:textfield>
            <s:textfield name="nombre3" label="Nombre 3"></s:textfield>
            <s:submit value="Voir equation"></s:submit>
        </s:form><br/>
            Delta = <s:property value="delta"/>
     
    </body>
</html>

