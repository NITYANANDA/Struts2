package org.crud.tutorial.service;

import java.util.List;

import org.crud.tutorial.dao.EmployeeDao;
import org.crud.tutorial.dao.EmployeeNoDBdao;
import org.crud.tutorial.model.Employee;



public class EmployeeDaoService implements EmployeeService {
    private EmployeeDao dao;

    public EmployeeDaoService() {
        this.dao = new EmployeeNoDBdao();
    }

    public List getAllEmployees() {
        return dao.getAllEmployees();
    }

    public void updateEmployee(Employee emp) {
        dao.update(emp);
    }

    public void deleteEmployee(Integer id) {
        dao.delete(id);
    }

    public Employee getEmployee(Integer id) {
        return dao.getEmployee(id);
    }

    public void insertEmployee(Employee emp) {
        dao.insert(emp);
    }
}
