package com.example.rca.classb.junittest.services;

import com.example.rca.classb.junittest.dao.EmployeeManagerDao;
import com.example.rca.classb.junittest.models.EmployeeManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeManagerService
{
    @Autowired
    EmployeeManagerDao dao;

    public List<EmployeeManager> getEmployeeList() {
        return dao.getEmployeeList();
    }

    public EmployeeManager getEmployeeById(int id) {
        return dao.getEmployeeById(id);
    }

    public void addEmployee(EmployeeManager employee) {
        dao.addEmployee(employee);
    }
}