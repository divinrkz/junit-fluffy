package com.example.rca.classb.junittest.services;


import com.example.rca.classb.junittest.services.impls.CalculatorServiceImpl;
import com.example.rca.classb.junittest.services.impls.TestServiceImpl;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestServiceImplStubTest {

   @Test
   public void calcSum_manyElements() {

       CalculatorServiceImpl calculatorServiceImpl = new CalculatorServiceImpl();
       calculatorServiceImpl.setCalculatorService(new CalculatorServiceManyElements());
       int actualResult = calculatorServiceImpl.calcSumForServiceData();
       int expectedResult = 7;

       assertEquals(expectedResult, actualResult);
   }

   @Test
   public void getTotal_emptyList() {
       TestServiceImpl testServiceImpl = new TestServiceImpl();
       testServiceImpl.setTestService(new TestServiceEmptyElements());
       int actualResult = testServiceImpl.getSum();
       int expectedResult = 0;

       assertEquals(expectedResult, actualResult);
   }

   @Test
   public void getTotal_manyList() {
       TestServiceImpl testServiceImpl = new TestServiceImpl();
       testServiceImpl.setTestService(new TestServiceManyElements());
       int actual = testServiceImpl.getSum();
       int expectedResult = 4;

       assertEquals(expectedResult, actual);
   }
}
