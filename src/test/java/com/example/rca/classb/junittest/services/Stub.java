package com.example.rca.classb.junittest.services;

class CalculatorServiceManyElements implements ICalculatorService {
    @Override
    public int[] getAll() {
        return new int[] {1, 2, 4};
    }
}
