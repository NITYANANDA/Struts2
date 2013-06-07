/*DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.

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
*/


package com.vaannila.action;

import java.util.HashMap;
import java.util.Map;
//import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;

public class LinkAction extends ActionSupport {

	private static final long serialVersionUID = -2613425890762568273L;
	
	private String chooseLanguage;
		
	public String getChooseLanguage() {
		return chooseLanguage;
	}

	public void setChooseLanguage(String chooseLanguage) {
		this.chooseLanguage = chooseLanguage;
	}
	
		
	public String welcome()
	{
		return "welcome";		
	}
	
	public String irWebxml()
	{
		return "irWebxml";		
	}
	
	public String irStrutsxml()
	{
		return "irStrutsxml";		
	}
	
	public String irTilesxml()
	{
		return "irTilesxml";		
	}
	
	
	
	
	static public final Map<String,String> locales = new HashMap<String,String>();
	static {
		locales.put("en_US", "English");
		locales.put("es_SP", "Spanish");
		locales.put("pt_PT", "Portuguese");
	}
	
	public Map<String,String> getLocales (){
		return locales;
	}
	

	
}
