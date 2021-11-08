package com.example.rca.classb.junittest.services;

import com.example.rca.classb.junittest.dao.EmployeeManagerDao;
import com.example.rca.classb.junittest.models.EmployeeManager;
import com.example.rca.classb.junittest.services.EmployeeManagerService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class TestManager {
    @InjectMocks
    EmployeeManagerService employeeManagerService;

    @Mock
    EmployeeManagerDao employeeManagerDao;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
//
//    @Test
//    public void getAllEmployeesTest()
//    {
//        List<EmployeeManager> list = new ArrayList<EmployeeManager>();
//        EmployeeManager empOne = new EmployeeManager(1, "John", "John", "howtodoinjava@gmail.com");
//        EmployeeManager empTwo = new EmployeeManager(2, "Alex", "kolenchiski", "alexk@yahoo.com");
//        EmployeeManager empThree = new EmployeeManager(3, "Steve", "Waugh", "swaugh@gmail.com");
//
//        list.add(empOne);
//        list.add(empTwo);
//        list.add(empThree);
//
//        when(employeeManagerDao.getEmployeeList()).thenReturn(list);
//
//        //test
//        List<EmployeeManager> empList = manager.getEmployeeList();
//
//        assertEquals(3, empList.size());
//        verify(employeeManagerDao, times(1)).getEmployeeList();
//    }

    @Test
    public void getEmployeeByIdTest()
    {
        when(employeeManagerDao.getEmployeeById(1)).thenReturn(new EmployeeManager(1));

        EmployeeManager emp = employeeManagerService.getEmployeeById(1);

        assertEquals(1, emp.getId());
    }


}
