package com.kvana.javasnippets;

public class PalendromeNumberAndString {
    public static void main(String[] args) {
        int num = 121;
        int temp;
        int palendromeNum = 0;
        int remainder;
        String palendromeString = "racecar";
        String str = "";
        // palendrome string >>> deified, civic, radar, level, rotor, kayak, reviver, racecar, redder, madam, and refer.

        // modulo operator % return remainder
        // division operator / return coefficient
        // Eg: 12 % 3 = 0
        // Eg: 12 / 3 = 4
        // palendrome number
        // While block of code can also suitable for reverse number

        temp = num;
        while (num > 0) {
            remainder = num % 10;
            palendromeNum = (palendromeNum * 10) + remainder;
            num = num / 10;
        }
        if (temp == palendromeNum) {
            System.out.println("palendrome number is >> " + palendromeNum);
        } else {
            System.out.println("Not palendrome number >> " + palendromeNum);
        }

        // palendrome string
        int length = palendromeString.length();
        String originalStr = palendromeString;
        for (int i = length-1; i >= 0; i--) {
            str = str + palendromeString.charAt(i);
        }
        if (originalStr.equalsIgnoreCase(str))
            System.out.println("palendrome string is >> " + str);
        else
            System.out.println("Not palendrome string is >> " + str);
    }
}
