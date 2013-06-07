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
<div class="elemento_980">
	<div class="flotaI campoprimero">
		
		<label for="input_a" class="flotaI menu negrita"><s:text name="header.nome" /></label>
		<div class="label flotaI">
			<img src="imaxes/iz.png" class=" flotaI" height="29" alt="derecha" />
			<s:textfield cssClass="user flotaI negrita" id="Nome" name="Nome" value="      %{getText('header.nome')}" readonly="true"/>
			<img src="imaxes/der.png" width="9" height="29" class="flotaI" alt="derecha" />
		</div>
		
		<div class="flotaI campo_segundo">
			<label for="input_b" class="flotaI menu negrita"><s:text name="header.time" /></label>
			<div class="label flotaI">
				<img src="imaxes/iz.png" class=" flotaI" height="29" alt="derecha" />
				<s:textfield cssClass="user flotaI negrita" id="time" name="time" value="      %{getText('header.time')}" readonly="true"/>
				<img src="imaxes/der.png" width="9" height="29" class="flotaI" alt="derecha" />
			</div>
		</div>
		<div class="flotaI campo_segundo">
			<label for="input_c" class="flotaI menu negrita"><s:text name="header.language" /></label>
			<div class="label flotaI">
				<img src="imaxes/iz.png" class=" flotaI" height="29" alt="derecha" />
				<s:textfield cssClass="user flotaI negrita" id="language" name="language" value="      %{getText('header.language')}" readonly="true"/>
				<img src="imaxes/der.png" width="9" height="29" class="flotaI" alt="derecha" />
			</div>                                                                       
		</div>
	</div>
</div>
<div class="clear"></div>

