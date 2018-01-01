package com.monolithic.calcengine;

public interface MathProcessing {
    String SEPARATOR = " ";

    String getKeyword(); // Add
    char getSymbol(); // +
    double doCalculation(double leftVal, double rightVal);
}
