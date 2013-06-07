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


<%@ taglib prefix="s" uri="/struts-tags" %>

<div class="flotaD cuerpo_general ">

	<br/>        
        <s:text name="testjsp.configurationTilesXml"/>
        <br/>
        <br/>
        <pre>
		
		
		&lt;tiles-definitions>
	
			&lt;definition name="baseLayout" template="/base/baseLayout.jsp">
			      &lt;put-attribute name="header" value="/base/header.jsp"/>
			      &lt;put-attribute name="subheader" value="" />
			      &lt;put-attribute name="botonera" value="" />
			      &lt;put-attribute name="content"   value=""/>
			      &lt;put-attribute name="footer"   value="/base/footer.jsp"/>
			  &lt;/definition>
			 
			    
			  &lt;definition name="welcome" extends="baseLayout">
			      &lt;put-attribute name="subheader" value="/enlaces/enlacesInicio.jsp" />
			      &lt;put-attribute name="botonera" value="/base/buttons.jsp" />
			      &lt;put-attribute name="content"   value="/welcome.jsp"/>      
			  &lt;/definition>
			  
			  &lt;definition name="irWebxml" extends="baseLayout">
			      &lt;put-attribute name="subheader" value="/enlaces/enlaceWebxml.jsp" />
			      &lt;put-attribute name="content"   value="/webxml.jsp"/>      
			  &lt;/definition>
			  
			  &lt;definition name="irStrutsxml" extends="baseLayout">
			      &lt;put-attribute name="subheader" value="/enlaces/enlaceStrutsxml.jsp" />
			      &lt;put-attribute name="content"   value="/strutsxml.jsp"/>      
			  &lt;/definition>
			  
			  &lt;definition name="irTilesxml" extends="baseLayout">
			      &lt;put-attribute name="subheader" value="/enlaces/enlaceTilesxml.jsp" />
			      &lt;put-attribute name="content"   value="/tilesxml.jsp"/>      
			  &lt;/definition>
  
		&lt;/tiles-definitions>
				
		
		
        </pre>
</div>
