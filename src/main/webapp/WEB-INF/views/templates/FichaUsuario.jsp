<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page session="false" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Ficha Usuario</title>
		<script src="bootstrap/js/jquery-3.3.1.slim.min.js"></script>
		<script src="bootstrap/js/bootstrap.min.js"></script>
		<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css"></link>
		<spring:url value="bootstrap/css/bootstrap.min.css" var="MyBootstrap" />
	</head>
	<body>
		<table class="table table-striped table-responsive-md btn-table">
			<thead>
				<tr>
					<th><img class="fas mr-2 blue-text" aria-hidden="true" src="content/Icons/glyph/svg/si-glyph-id-badge.svg" height="20" width="20" />Ficha</th>
					<td>43</td>
				</tr>	
				<tr>
					<th><img class="fas mr-2 blue-text" aria-hidden="true" src="content/Icons/glyph/svg/si-glyph-person-2.svg" height="20" width="20" />Nombre</th>
					<td>Aragón Hijo de Thor nieto de Zeus</td>
				</tr>
				<tr>
					<th><img class="fas mr-2 blue-text" aria-hidden="true" src="content/Icons/glyph/svg/si-glyph-person-people.svg" height="20" width="20" />Apellido</th>
					<td>Carmelio Argolón</td>
				</tr>
				<tr>
					<th><img class="fas mr-2 blue-text" aria-hidden="true" src="content/Icons/glyph/svg/si-glyph-mail.svg" height="20" width="20" />Email</th>
					<td>llamame@lolas.pub.com</td>
				</tr>
				<tr>
					<th><img class="fas mr-2 blue-text" aria-hidden="true" src="content/Icons/glyph/svg/si-glyph-phone-number.svg" height="20" width="20" />Teléfono</th>
					<td>666-22-69-69</td>
				</tr>
				<tr>
					<th><img class="fas mr-2 blue-text" aria-hidden="true" src="content/Icons/glyph/svg/si-glyph-city.svg" height="20" width="20" />Ciudad</th>
					<td>Ciudad de la Alegría en sangre de lágrima</td>
				</tr>
				<tr>
					<th><img class="fas mr-2 blue-text" aria-hidden="true" src="content/Icons/glyph/svg/si-glyph-house.svg" height="20" width="20" />Dirección</th>
					<td>Avenida constelación 4 Omega</td>
				</tr>
				<tr>
					<th><img class="fas mr-2 blue-text" aria-hidden="true" src="content/Icons/glyph/svg/si-glyph-mail-box.svg" height="20" width="20" />Código Postal</th>
					<td>555555</td>
				</tr>
				<tr>
					<th><img class="fas mr-2 blue-text" aria-hidden="true" src="content/Icons/glyph/svg/si-glyph-id-badge.svg" height="20" width="20" />Tipo Usuario</th>
					<td>User pringao</td>
				</tr>
			</thead>
		</table>
	</body>
</html>