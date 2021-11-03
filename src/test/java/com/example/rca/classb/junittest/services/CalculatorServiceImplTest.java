package com.example.rca.classb.junittest.services;


import com.example.rca.classb.junittest.services.impls.CalculatorServiceImpl;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorServiceImplTest {

    @Test
    public void calcSum_emptyList() {
        CalculatorServiceImpl calculatorServiceImpl = new CalculatorServiceImpl();

        int actualResult = calculatorServiceImpl.calculateSum(new int[] {});
        int expectedResult = 0;
        assertEquals (expectedResult, actualResult);
    }

    @Test
    public void calcSum_manyElements() {
        CalculatorServiceImpl calculatorServiceImpl = new CalculatorServiceImpl();

        int actualResult = calculatorServiceImpl.calculateSum(new int[] {4});
        int expectedResult = 0;

        assertEquals(expectedResult, actualResult);
    }

}
