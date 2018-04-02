<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!-- A A Berlot 29/03/2018 index.jsp start poin of rest serv. -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="src/js/geometricFigure.js"></script>
<title>Geopagos PDF test</title>
</head>
<body>

	<h3>Register messures:</h3>
	<select id="type">
		<option value="Select">Select</option>
		<option value="Circle">Circle</option>
		<option value="Square">Square</option>
		<option value="Triangle">Triangle</option>
	</select>
	<br><br>
	
	<input type="text" id="height" placeholder="Altura"/><br>
	<input type="text" id="width" placeholder="Ancho"/><br>
	<input type="text" id="surface" placeholder="Superficie"/><br>
	<input type="text" id="diameter" placeholder="Diámetro"/><br>
	<button id="updateMessures" onclick="registerMessures()" >Update
		Messures</button>

	<h3>Messures:</h3>
	<button onclick="getAllMessures()" >get All Messures</button>
	<div id="resultMessures">
		<!-- JS dynamic response -->
	</div>

</body>
</html>