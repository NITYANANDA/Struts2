package org.crud.tutorial.service;

import java.util.List;

import org.crud.tutorial.model.Employee;


public interface EmployeeService {
    public List getAllEmployees();
    public void updateEmployee(Employee emp);
    public void deleteEmployee(Integer id);
    public Employee getEmployee(Integer id);
    public void insertEmployee(Employee emp);
}
