package com.example.rca.classb.junittest.services.impls;

import com.example.rca.classb.junittest.services.ICalculatorService;

public class CalculatorServiceImpl {

    ICalculatorService calculatorService;

    public void setCalculatorService(ICalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    public int calculateSum(int[] data) {
        int sum = 0;
        for (int value: data) {
            sum += value;
        }
        return  sum;
    }

    public int calcSumForServiceData() {
        int sum = 0;
        for (int value : calculatorService.getAll()) {
            sum += value;
        }
        return sum;
    }





}
