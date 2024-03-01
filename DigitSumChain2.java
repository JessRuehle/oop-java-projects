package edu.bloomu.exam2pp;

import java.util.Scanner;

public class DigitSumChain2 {
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
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }
       return sum;
    }
}
