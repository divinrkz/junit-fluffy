package com.example.rca.classb.junittest.services.impls;

public class CalculatorServiceImpl {
    public int calculateSum(int[] data) {
        int sum = 0;
        for (int value: data) {
            sum += value;
        }
        return  sum;
    }



}
