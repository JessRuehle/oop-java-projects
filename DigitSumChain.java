package edu.bloomu.exam2pp;

import java.util.Scanner;

/**
 * Outputs the sum of digits in a number.
 *
 */
public class DigitSumChain {
    public static void main(String[] args) {
        System.out.print("Enter a positive integer: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        System.out.println(digitSum(num));

    }

    /**
     * Returns the sum of the digits in a given number
     */
    private static int digitSum(int n) {
        String str = " " + n;
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += (str.charAt(i) - '0');
        }
        return sum;
    }
}

//
//        //prompt user for an integer, input as a string
//        System.out.print("Enter a positive integer: ");
//        Scanner in = new Scanner(System.in);
//        String num = in.next();
//
//        //get length of string (number of digits)
//        int numLength = num.length();
//
//        // declare an int to add the sum
//        int sum = 0;
//
//        // loop until the you reach the length of the string
//        for (int i = 0; i < numLength; i++) {
//            // add sum plus the next number in the user input
//                sum = sum + num.indexOf(i);
//        }
//
//        System.out.printf("Chain of digit sums: %d ", sum);
