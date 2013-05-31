package org.crud.tutorial.dao;

import java.util.List;

import org.crud.tutorial.model.Employee;


public interface EmployeeDao {
    public List getAllEmployees();
    public Employee getEmployee(Integer id);
    public void update(Employee emp);
    public void insert(Employee emp);
    public void delete(Integer id);
}
