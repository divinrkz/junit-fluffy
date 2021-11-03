package com.example.rca.classb.junittest.services.impls;

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
}
