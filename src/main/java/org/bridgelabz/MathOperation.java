package org.bridgelabz;

public class MathOperation {

    public static void main(String[] args) {
        //use case 1
        IMathFunction add = Integer::sum;
        //multiply
        IMathFunction multiply = ( int a, int b) -> a*b;
        //division
        IMathFunction division = ( int a, int b) -> a/b;
        //subtract
        IMathFunction subtract = ( int a, int b) -> a-b;

        System.out.println("Addition " + add.calculate(6 ,3));
        System.out.println("Multiply " + multiply.calculate(6 ,3));
        System.out.println("Division " + division.calculate(6 ,3));
        System.out.println("Subtract " + subtract.calculate(6 ,3));
    }
}
