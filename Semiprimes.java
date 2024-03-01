package edu.bloomu.hw1;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * The purpose of this program is to raise the numbers 2 & 3 to user inputted exponents.
 * The program will then calculate the next probable prime number following that number.
 * Then, the two prime numbers will be multiplied together, which will calculate the
 * final product, the semi-prime.
 *
 * @author Jessica Ruehle
 */

public class Semiprimes {
    public static void main(String[] args) {
        //These four lines prompt the user to input to integers into the console and
        // then scan the console and declare the two numbers each as an integer.
        System.out.print("Enter two integers: ");
        Scanner in = new Scanner(System.in);
        int exp1 = in.nextInt();
        int exp2 = in.nextInt();

        //This portion calls on the Math class to take each of the user-inputted
        // numbers and make them exponents of 2 and 3
        int result1 = (int) Math.pow(2, exp1);
        int result2 = (int) Math.pow(3, exp2);

        //valResult1 and 2 turn the ints into BigIntegers
        //prime1 and prime2 are the next probable prime number after the answers from
        // results 1 and 2
        //Finally, semiPrime is the product of multiplying the 2 BigIntegers prime1 and
        // prime2
        BigInteger valResult1 = BigInteger.valueOf(result1);
        BigInteger valResult2 = BigInteger.valueOf(result2);
        BigInteger prime1 = valResult1.nextProbablePrime();
        BigInteger prime2 = valResult2.nextProbablePrime();
        BigInteger semiPrime = prime1.multiply(prime2);

        //When printed to the screen, the  %,d will add commas in the appropriate
        // places for thousands, millions, etc. \n is used to start the next line at
        // the end of the printed line
        System.out.printf("Next prime after 2^%d = %,d\n", exp1, prime1);
        System.out.printf("Next prime after 3^%d = %,d\n", exp2, prime2);
        System.out.printf("Semi-prime: %,d\n", semiPrime);










    }
}
