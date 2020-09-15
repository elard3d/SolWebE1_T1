<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="N00017745.ClassNumeros"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ejercicio 1 - T1</title>
</head>
<body>

	

	<h1> Ejercicio 1 - T1</h1>

	
	<%  
	ClassNumeros numero = new ClassNumeros();
	
	numero.generarNumeros();
	numero.obtenerNumeros();
	
	int[] numerosAleatorios = numero.getVectorNumeros5();

	
	%>	
	
	
	
	<div >
		<input type="checkbox"> <%=numerosAleatorios[0]%>
	</div>
	<div>
	<input type="checkbox"> <%=numerosAleatorios[1]%>
	</div>
	<div>
	<input type="checkbox"> <%=numerosAleatorios[2]%>
	</div>
	<div>
	<input type="checkbox"> <%=numerosAleatorios[3]%>
	</div>
	<div>
	<input type="checkbox"> <%=numerosAleatorios[4]%>
	</div>
	
	
	

</body>
</html>