<!-- 
DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.

Copyright 2013 Jos� Luis Villaverde Balsa.

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


<%@ taglib prefix="s" uri="/struts-tags" %>

<div class="flotaD cuerpo_general ">
	<!-- Muestro mensaje de erro na carga do pdf. -->
	<div id="idErrores" class="operacionUlError" >
		<s:actionerror />
	</div>
	
	<hr>
	<h4><s:text name="homepage.benvida"/></h4>
	
	
	
	<s:form>
	     <s:radio name="request_locale" list="locales" value="locale"/>
	     <s:submit type="button" key="chooseLanguage"/>
	 </s:form>
	 <hr>
	 <p>
	 <s:text name="welcome.informationdebuplugin"/>
	 <br/>
	 &lt;a href="&lt;s:url action="index" namespace="config-browser" />"Launch the configuration browser&lt;/a>"
	
	 </p>

	 <a href="<s:url action="index" namespace="config-browser" />">Launch the configuration browser</a>
</div>