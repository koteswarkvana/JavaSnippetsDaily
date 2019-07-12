package com.kvana.javasnippets;

public class ArmstrongAndFibonanciiAndFactorial {
    int armStrongValue = 0;
    int remainder = 0;

    private void getArmstrongNumber(int num) {
        int temp = num;
        while (num > 0) {
            remainder = num % 10;
            armStrongValue = armStrongValue + remainder * remainder * remainder;
            num = num / 10;
        }

        if (temp == armStrongValue)
            System.out.println(" Armstrong number ... ");
        else
            System.out.println(" Not Armstrong number ... ");
    }

    private void getFibonanciiSeries(int num) {
        int firstVal = 0;
        int secondVal = 1;
        int fibonanciiValue;
        System.out.println("Fibonancii Series Values upto >> " + num);
        System.out.print(firstVal + " " + secondVal + " ");
        while (num > 0) {
            fibonanciiValue = firstVal + secondVal;
            System.out.print(fibonanciiValue + " ");
            firstVal = secondVal;
            secondVal = fibonanciiValue;
            num--;
        }
    }

    private void getFactorialNumber(int number) {
        System.out.println("");
        int factorialValue = 1;
        while (number > 0) {
            factorialValue = factorialValue * number;
            number--;
        }
        System.out.println("Factorial Value >> " + factorialValue);
    }

    public static void main(String[] args) {
        int numValue = 153;
        new ArmstrongAndFibonanciiAndFactorial().getArmstrongNumber(numValue);
        new ArmstrongAndFibonanciiAndFactorial().getFibonanciiSeries(10);
        new ArmstrongAndFibonanciiAndFactorial().getFactorialNumber(5);
    }
}
