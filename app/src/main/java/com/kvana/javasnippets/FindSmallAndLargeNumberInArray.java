package com.kvana.javasnippets;

import java.util.Scanner;

public class FindSmallAndLargeNumberInArray {
    public static void main(String[] args) {
        int[] numberArr = new int[6];
        int maxNumber = numberArr[0];
        int smallest = numberArr[0];
        int largest = numberArr[0];
        int temp = 0;
        System.out.println("Enter require number...");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            numberArr[i] = scanner.nextInt();
        }
        // print original array values.
        for (int i = 0; i < numberArr.length; i++) {
            System.out.print(" " + numberArr[i]);
        }
        System.out.println();
        // find largest number in array
        for (int i = 0; i < numberArr.length; i++) {
            if (numberArr[i] > largest) {
                largest = numberArr[i];
            } else if (numberArr[i] < smallest) {
                smallest = numberArr[i];
            }
        }
        System.out.println(" large number " + largest);
        System.out.println(" small number " + smallest);

        System.out.println(" After sorting ... ");

        // Sort integer or string or double or datatype value by using the Arrays.sort()
        // Arrays.sort(numberArr);

        for (int i = 0; i < numberArr.length; i++) {
            for (int j = i + 1; j < numberArr.length; j++) {
                if (numberArr[i] > numberArr[j]) {
                    temp = numberArr[i];
                    numberArr[i] = numberArr[j];
                    numberArr[j] = temp;
                }
            }
        }

        for (int i = 0; i < numberArr.length; i++) {
            System.out.print(" " + numberArr[i]);
        }

    }
}
