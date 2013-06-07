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
        <s:text name="testjsp.configurationWebXml"/>
        <br/>
        <br/>
        <pre>
		&lt;context-param>
			&lt;param-name>org.apache.tiles.impl.BasicTilesContainer.DEFINITIONS_CONFIG&lt;/param-name>
			&lt;param-value>/WEB-INF/tiles.xml&lt;/param-value>
		&lt;/context-param>
		<br/>
		&lt;listener>
			&lt;listener-class>org.apache.struts2.tiles.StrutsTilesListener&lt;/listener-class>
		&lt;/listener>
        </pre>
</div>        
        
