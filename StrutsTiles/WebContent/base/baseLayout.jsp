<!-- 
DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.

Copyright 2013 José Luis Villaverde Balsa.

This file is part of StrutsTiles.

    StrutsTiles is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    StrutsTiles is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with Foobar.  If not, see <http://www.gnu.org/licenses/>.
-->

<%@taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
	<s:head />
	<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
	<link href="imaxes/favicon.ico" rel="shortcut icon" />
	<!--<tiles:insertAttribute name="title" ignore="true" />-->
	<title>
		<s:text name="title.welcome"/>
	</title>
	<link rel="stylesheet" type="text/css" media="screen" href="css/estructura.css" />
	
	<script type="text/javascript" src="jquery/jquery-1.5.min.js"></script>
	
</head>
<body>
		<div id="cabecera">
			<h1 class="logos_superiores">
				<img src="imaxes/java.png" class="flotaI xuntagalicia"	width="206" height="49" alt="JAVA" />
				<img src="imaxes/" width="297" height="69" alt="STRUTS & TILES" class="flotaD" /> 
			</h1>
			
			<div class="menu_superior">
				<tiles:insertAttribute name="header" />
			</div>
			
			<div id="cuerpo">
				<div class="menu_intermedio">
					<tiles:insertAttribute name="subheader" />
					<div><a class="manual_usuario texto" href="<s:url action='myJasperTest' includeParams='none'></s:url>"><s:text  name="subheader.manualUsuario" /></a></div>
					<div class="clear"></div>
				</div>
				<div class="menu_contraido">
					<tiles:insertAttribute name="botonera" />
				</div>
				<tiles:insertAttribute name="content" />
			</div>
				<div class="clear"></div>
		</div>
		<div id="pie">
				<tiles:insertAttribute name="footer" />
		</div>
</body>
</html>
