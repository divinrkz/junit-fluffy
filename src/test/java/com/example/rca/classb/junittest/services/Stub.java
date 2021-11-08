package com.example.rca.classb.junittest.services;

import java.util.ArrayList;
import java.util.List;

class CalculatorServiceManyElements implements ICalculatorService {
    @Override
    public int[] getAll() {
        return new int[] {1, 2, 4};
    }
}


class TestServiceEmptyElements implements ITestService {
    @Override
    public List<Integer> getAll() {
        return new ArrayList<>();
    }
}

class TestServiceManyElements implements ITestService {
    @Override
    public List<Integer> getAll() {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(1);
        integers.add(1);
        integers.add(1);

        return integers;
    }
}
