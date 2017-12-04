package com.monolithic.calcengine;

public class MathEquation {
    private double leftVal;
    private double rightVal;
    private char opCode = 'a';
    private double result;

    // Accessors and mutators for each relevant var
    public double getLeftVal() {return leftVal;}
    public void setLeftVal(double leftVal) {this.leftVal = leftVal;}
    public double getRightVal() {return rightVal;}
    public void setRightVal(double rightVal) {this.rightVal = rightVal;}
    public double getOpCode() {return opCode;}
    public void setOpCode(char opCode) {this.opCode = opCode;}

    // Accessor
    public double getResult() {return result;}

    // Constructor
    public MathEquation() {}

    // Constructor
    public MathEquation(char opCode) {
        this.opCode = opCode;
    }

    // Constructor
    public MathEquation(char opCode, double leftVal, double rightVal){
        this(opCode);
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    public void execute(double leftVal, double rightVal){
        this.leftVal = leftVal;
        this.rightVal = rightVal;

        execute();
    }

    public void execute(int leftVal, int rightVal){
        this.leftVal = leftVal;
        this.rightVal = rightVal;

        execute();

        result = (int)result;
    }

    public void execute() {

        switch (opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'd':
                result = rightVal != 0.0d ? leftVal / rightVal : 0.0d;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            default: {
                System.out.println("[-] Invalid OP code!");
                result = 0.0d;
                break;
            }
        }


    }
}
