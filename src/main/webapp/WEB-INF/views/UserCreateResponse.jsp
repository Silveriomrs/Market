<%@page import="Market_DA.UserDA"%>
<%@page import="Market_DO.User"%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<?xml version "1.0"?>
<!-- File: userCreateResponse.jsp -->
<jsp:useBean id="userBean" class="Market_DO.User" scope="request" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" "http://www.w3.org/TR/xhtm111/DTD/xhtm111.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="es">
	<head>
		<title>Respuesta Crear Usuario</title>	
		<script src="bootstrap/js/jquery-3.3.1.slim.min.js"></script>
		<script src="bootstrap/js/bootstrap.min.js"></script>
		<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css"></link>
		<spring:url value="bootstrap/css/bootstrap.min.css" var="MyBootstrap" />
	</head>
	<body>		
		<jsp:setProperty name="userBean" property="userType_Id" value= "2"/>		
		<%
			boolean respuesta = UserDA.addUsuarios(userBean);
			if(respuesta){ System.out.println(">>> Registro nuevo usuario correcto.");
		%>
			<p>Su registro ha sido procesado D/Dña,
				<jsp:getProperty name="userBean" property="nombre"/>
				<jsp:getProperty name="userBean" property="apellido"/>
			</p>
			<p>Ahora podrá acceder a su cuenta mediante su email y contraseña</p>		
		<%	} else { System.out.println(">>> Error. Registro incorrecto, usuario (email) ya existe."); %>	
			<p>Los datos introducidos no son válidos, el usuario introducido en uso.</p>
		<% } %>
		
	</body>
</html>