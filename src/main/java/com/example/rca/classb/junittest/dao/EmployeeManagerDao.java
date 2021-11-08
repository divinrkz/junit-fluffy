package com.example.rca.classb.junittest.dao;

import com.example.rca.classb.junittest.models.EmployeeManager;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class EmployeeManagerDao {
    private Map<Integer, EmployeeManager> DB = new HashMap<>();

    public List<EmployeeManager> getEmployeeList()
    {
        List<EmployeeManager> list = new ArrayList<>();
        list.addAll(DB.values());
        return list;
    }

    public EmployeeManager getEmployeeById(int id) {
        return DB.get(id);
    }

    public void addEmployee(EmployeeManager employee) {
        employee.setId(DB.keySet().size() + 1);
        DB.put(employee.getId(), employee);
    }

    public void updateEmployee(EmployeeManager employee) {
        DB.put(employee.getId(), employee);
    }

    public void deleteEmployee(int id) {
        DB.remove(id);
    }
}
