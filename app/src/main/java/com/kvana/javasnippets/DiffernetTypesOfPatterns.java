package com.kvana.javasnippets;

public class DiffernetTypesOfPatterns {
    private void printPattern(int num) {
        System.out.println(" Print Pattern ... ");
        // Print * from low to high
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Print * from high to low
        for (int i = 0; i < num - 1; i++) {
            for (int j = num - 1; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n");
        // Print low to high with space
        for (int i = 0; i < num; i++) {
            for (int j = num - 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Print high to low with space
        for (int i = 0; i < num - 1; i++) {
            for (int j = 0; i >= j; j++) {
                System.out.print(" ");
            }
            for (int j = num; j > i + 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n");
        // Print triangle with star (*)
        int val = 8;
        for (int i = 0; i < val; i++) {
            for (int j = val + 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("  *");
            }
            System.out.println();
        }
        System.out.println();
        // Print triangle with numbers
        for (int i = 1; i <= val; i++) {
            for (int j = val + 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + j);
            }
            System.out.println();
        }
        System.out.println();
        // Print Pascal pattern
        for (int i = 1; i <= num; i++) {
            for (int j = i; j <= num + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        new DiffernetTypesOfPatterns().printPattern(4);
    }

    // output
    /*
    =============

    *
**
***
****
***
**
*

   *
  **
 ***
****
 ***
  **
   *

           *
          *  *
         *  *  *
        *  *  *  *
       *  *  *  *  *
      *  *  *  *  *  *
     *  *  *  *  *  *  *
    *  *  *  *  *  *  *  *

         1
        1 2
       1 2 3
      1 2 3 4
     1 2 3 4 5
    1 2 3 4 5 6
   1 2 3 4 5 6 7
  1 2 3 4 5 6 7 8

     1
    121
   12321
  1234321

    =============
    * */
}
