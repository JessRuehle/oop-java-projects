package edu.bloomu.exam2pp;

import java.math.BigInteger;
import java.util.Scanner;

public class BigSummer {
    public static void main(String[] args) {
        // prompt user to input a number and declare as a string
        System.out.print("Enter a positive integer: ");
        Scanner in = new Scanner(System.in);
        String num = in.next();

        BigInteger sum = BigInteger.ZERO;
        BigInteger a = new BigInteger(num);

        System.out.println(sum + " " + a);
        for (BigInteger i = BigInteger.ONE; i.compareTo(a) <= 0;
             i = i.add(BigInteger.ONE)) {

            sum = sum.add(i);
            System.out.println(sum);
        }

        System.out.println("Final Sum: " + sum);
    }
}
