package com.example.rca.classb.junittest.services;


import com.example.rca.classb.junittest.services.impls.CalculatorServiceImpl;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;




 public class CalculatorServiceImplStubTest {

    @Test
    public void calcSum_manyElements() {

        CalculatorServiceImpl calculatorServiceImpl = new CalculatorServiceImpl();
        calculatorServiceImpl.setCalculatorService(new CalculatorServiceManyElements());
        int actualResult = calculatorServiceImpl.calcSumForServiceData();
        int expectedResult = 7;

        assertEquals(expectedResult, actualResult);
    }


}
