
/*DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.

Copyright 2013 José Luis Villaverde Balsa.

This file is part of Jasper-S2_WEBAPP.

    Jasper-S2_WEBAPP is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    Jasper-S2_WEBAPP is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with Foobar.  If not, see <http://www.gnu.org/licenses/>.
*/


package com.vaannila.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;

import net.sf.jasperreports.engine.JasperCompileManager;


import com.opensymphony.xwork2.ActionSupport;
import com.vaannila.model.Person;

@SuppressWarnings("serial")
public class JasperAction extends ActionSupport {

    /** List to use as our JasperReports dataSource. */
    private List<Person> myList;

    public String execute() throws Exception {

        // Create some imaginary persons.
        Person p1 = new Person(new Long(1), "Maria", "Lombao");
        Person p2 = new Person(new Long(2), "Jason", "Still");
        Person p3 = new Person(new Long(3), "Alexandro", "Fernandez");
        Person p4 = new Person(new Long(4), "Jonh", "Smith");

        // Store people in our dataSource list (normally they would come from a database).
        myList = new ArrayList<Person>();
        myList.add(p1);
        myList.add(p2);
        myList.add(p3);
        myList.add(p4);

        // Normally we would provide a pre-compiled .jrxml file
        // or check to make sure we don't compile on every request.
        
        ServletContext context = ServletActionContext.getServletContext();
        
        try {
        	JasperCompileManager.compileReportToFile(
        			context.getRealPath("/jasper/our_jasper_template.jrxml"),
        			context.getRealPath("/jasper/our_jasper_template.jasper")
        			);

        } catch (Exception e) {
            e.printStackTrace();
            return ERROR;
        }

        return SUCCESS;
    }

    public List<Person> getMyList() {
        return myList;
    }
}
