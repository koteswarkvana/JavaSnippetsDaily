package com.kvana.javasnippets;

public class PrimeNumber {

    private void getArmstrongNumber(int num) {
        System.out.println(" Prime numbers from 1 to 50 ... ");

        System.out.println("");
        for (int i = 0; i < num; i++) {

            int count = 0;
            for (int j = i; j >= 1; j--) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2)
                System.out.print(" " + i);
        }
    }

    public static void main(String[] args) {
        new PrimeNumber().getArmstrongNumber(50);
    }
}
