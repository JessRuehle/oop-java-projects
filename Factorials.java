package edu.bloomu.exam2pp;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        // user inputes a number and computer takes it in as a BigInteger
        System.out.print("Enter a positive integer: ");
        Scanner in = new Scanner(System.in);
        BigInteger num = in.nextBigInteger();

        // declare a BigInt called sum to be a counter for the loop
        BigInteger sum = new BigInteger("1");

        // i = 1; compare i to sum, when i and sum are equal, the value will be 0. when
        // i compare to sum is equal to 0, end loop; add 1 to i every loop
        for (BigInteger i = new BigInteger("1"); i.compareTo(sum) == 0;
             i = i.add(BigInteger.ONE)) {

            sum = i.multiply(sum);
        }
        String sumString = sum.toString();
        int digits = sumString.length();

        System.out.println(num + "! has " + digits + " digits.");
    }
}
