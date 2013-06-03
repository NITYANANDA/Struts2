package com.acme.test.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;

import net.sf.jasperreports.engine.JasperCompileManager;

import com.acme.test.Person;
import com.opensymphony.xwork2.ActionSupport;

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
