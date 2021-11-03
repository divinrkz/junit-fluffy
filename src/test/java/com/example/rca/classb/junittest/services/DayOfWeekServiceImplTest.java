package com.example.rca.classb.junittest.services;


import com.example.rca.classb.junittest.services.impls.DayOfWeekServiceImp;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DayOfWeekServiceImplTest {

    @Test
    public void getString_invalidTest() {
        DayOfWeekServiceImp dayOfWeekServiceImp = new DayOfWeekServiceImp();

        String actualResult = dayOfWeekServiceImp.getDay(0);
        String expectedResult = "INVALID";
        assertEquals (expectedResult, actualResult);
    }


}
