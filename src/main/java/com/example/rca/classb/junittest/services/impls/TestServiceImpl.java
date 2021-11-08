package com.example.rca.classb.junittest.services.impls;

import com.example.rca.classb.junittest.services.ICalculatorService;
import com.example.rca.classb.junittest.services.ITestService;
import org.testng.ITest;

public class TestServiceImpl {

    ITestService testService;

    public void setTestService(ITestService testService) {
        this.testService =testService;
    }


    public int getSum() {
        int sum = 0;
        for (Integer i: this.testService.getAll()) {
            sum += i;
        }
        return sum;
    }






}
