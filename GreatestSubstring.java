package edu.bloomu.hw4;

import java.util.Scanner;

/**
 *Prompts user to input a string of numbers as well as an integer that is less than or
 * equal to 9. Returns the greatest number that is the length of the integer provided.
 *
 * KNOWN BUGS:
 *
 * 1. Program is not written, nothing will happen when run.
 *
 * @author Jessica Ruehle
 */
public class GreatestSubstring {
    public static void main(String[] args) {
        System.out.print("Enter a string of digits and an interger: ");
        Scanner in = new Scanner(System.in);
        String digits = in.next();
        int k = in.nextInt();

        int result = greatestSubstring(digits, k);

        System.out.printf("Greatest %d-digit substring: %d", k, result);

    }

    private static int greatestSubstring(String digits, int k) {
        int maxNum = 0;
        for (int i = 0; i <= digits.length() - k; i++) {

            // Extract the substring starting at index 1 and convert to a number.
            String substring = digits.substring(i, i + k);
            int currentNum = Integer.parseInt(substring);

            // CHack if this is the greatest substring seen so far.
            if (currentNum > maxNum) {
                maxNum = currentNum;
            }
        }
        return maxNum;
    }
}
