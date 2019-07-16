package com.kvana.javasnippets;

public class DiamondPatternPrint {

    private void printDiamondPattern(int num) {
        System.out.println(" Print Diamond Pattern ... ");
        int space = num;
        int i;
        int j;
        System.out.println("");
        for (i = 0; i <= num; i++) {

            for (j = 1; j <= space; j++) {
                // Print space for required times
                System.out.print(" ");
            }
            // post decrement space
            space--;
            for (j = 1; j <= (2 * i) - 1; j++) {
                // Print start for required times
                System.out.print("*");
            }
            System.out.println();
        }

        space = 1;
        num = num - 1;

        for (i = 0; i <= num - 1; i++) {
            for (j = 1; j <= space; j++) {
                // Print space for required times
                System.out.print(" ");
            }
            // Post increment space
            space++;
            for (j = 1; j <= (2 * (num - i) - 1); j++) {
                // Print start for required times
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new DiamondPatternPrint().printDiamondPattern(5);
    }
}
/*
============
Output:
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
============

* */
