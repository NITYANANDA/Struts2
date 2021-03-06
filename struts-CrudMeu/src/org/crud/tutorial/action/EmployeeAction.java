package org.crud.tutorial.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.crud.tutorial.model.Employee;
import org.crud.tutorial.service.DepartmentDaoService;
import org.crud.tutorial.service.DepartmentService;
import org.crud.tutorial.service.EmployeeDaoService;
import org.crud.tutorial.service.EmployeeService;


import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class EmployeeAction extends ActionSupport implements Preparable {

	private Log logger = LogFactory.getLog(this.getClass());

	private static EmployeeService empService = new EmployeeDaoService();

	private static DepartmentService deptService = new DepartmentDaoService();

	private Employee employee;

	private List employees;

	private List departments;
	
	private String chooseLanguage;
	
	public String getChooseLanguage() {
		return chooseLanguage;
	}

	public void setChooseLanguage(String chooseLanguage) {
		this.chooseLanguage = chooseLanguage;
	}
	
	
	

	public void prepare() throws Exception {
		departments = deptService.getAllDepartments();
		if (employee != null && employee.getEmployeeId() != null) {
			employee = empService.getEmployee(employee.getEmployeeId());
		}
	}

	public String doSave() {
		if (employee.getEmployeeId() == null) {
			empService.insertEmployee(employee);
		} else {
			empService.updateEmployee(employee);
		}
		return SUCCESS;
	}

	public String doDelete() {
		empService.deleteEmployee(employee.getEmployeeId());
		return SUCCESS;
	}

	public String doList() {
		employees = empService.getAllEmployees();
		return SUCCESS;
	}

	public String doInput() {
		return INPUT;
	}

	/**
	 * @return Returns the employee.
	 */
	public Employee getEmployee() {
		return employee;
	}

	/**
	 * @param employee
	 *            The employee to set.
	 */
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	/**
	 * @return Returns the employees.
	 */
	public List getEmployees() {
		return employees;
	}

	/**
	 * @return Returns the departments.
	 */
	public List getDepartments() {
		return departments;
	}
	
	//new code start
	static public final Map<String,String> locales = new HashMap<String,String>();
	static {
		locales.put("en_US", "English");
		locales.put("es_SP", "Spanish");
		//locales.put("pt_BR", "Brazil");
		locales.put("pt_PT", "Portuguese");
	}
	
	public Map<String,String> getLocales (){
		return locales;
	}
	//new code end
	
	
}
