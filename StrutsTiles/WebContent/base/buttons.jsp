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
<ul id="menuidioma" class="idioma flotaI">
	<li class="primero"><a href="#"><span><s:text name="buttons.opcions" /></span></a>
	<ul>   
    	<li class="inicio"><a href="<s:url action='irWebxmlLink' includeParams='none' />"><s:text name="opciones.webxml" /></a></li>
		<li><a href="<s:url action='irStrutsxmlLink' includeParams='none' />"><s:text name="opciones.strutsxml" /></a></li>
	    <li><a href="<s:url action='irTilesxmlLink' includeParams='none' />"><s:text name="opciones.tilesxml" /></a></li>
    	
     </ul>
	</li>
</ul>

	