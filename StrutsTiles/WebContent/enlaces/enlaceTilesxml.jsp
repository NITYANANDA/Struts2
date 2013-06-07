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
<div class="tags_unselected flotaI">
	<img class="tag" src="imaxes/tags.png" width="9" height="28" alt="tags" />
	<a class="tag2_off flotaI" href="<s:url action='welcomeLink' includeParams='none' />">
		<span class="flotaI texto"><s:text  name="enlace.inicio" /></span>
	</a>
	<img class="tag" src="imaxes/tags-right.png" width="9" height="28" alt="tags" />
</div>

<div class="tags_unselected flotaI">
	<img class="tag" src="imaxes/tags-back_on.png" width="9" height="28" alt="tags" />
	<a class="tag_on flotaI" href="#"><span class="flotaI texto"><s:text  name="enlace.tilesxml" /></span></a>
	<img class="tag" src="imaxes/tags-right_hover.png" width="9" height="28" alt="tags" />
</div>