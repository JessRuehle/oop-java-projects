package edu.bloomu.hw1;

import java.lang.Math;
import java.util.Scanner;

/**
 * The purpose of this program is to use Stirlings formula to calculate
 * the approximate factorial of any user-inputted number.
 *
 * @author Jessica Ruehle
 */

public class StirlingsApproximation {
    public static void main(String[] args) {
       //prompt user to input a number
        System.out.print("Enter a positive integer: ");
        //retrieve user input
        Scanner in = new Scanner(System.in);
        //declare user input as an integer named Input
        int input = in.nextInt();

        //Multiply everything under the square root, then square it
        double underSR = input * Math.PI * 2;
        double squared = underSR = Math.sqrt(underSR);

        //take e to the nth power
        double e = Math.pow(Math.E, input * -1);

        //take n to the nth power
        double nth = Math.pow(input, input);

        //multiply all three together
        double result = squared * e * nth;

        int finalResult = (int)result;

        System.out.printf("Using Stirling's Approximation, %,d! \u2248 %,d", input,
                finalResult);





    }

}
