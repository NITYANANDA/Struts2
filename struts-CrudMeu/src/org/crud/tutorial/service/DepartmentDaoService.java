package org.crud.tutorial.service;

import java.util.List;

import org.crud.tutorial.dao.DepartmentDao;
import org.crud.tutorial.dao.DepartmentNoDBdao;


public class DepartmentDaoService implements DepartmentService {
    private DepartmentDao dao;

    public DepartmentDaoService() {
        this.dao = new DepartmentNoDBdao();
    }

    public List getAllDepartments() {
        return dao.getAllDepartments();
    }
}
