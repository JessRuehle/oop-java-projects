package edu.bloomu.homework3;

import java.util.Scanner;

/**
 * Prompts user to input three grades between 0 and 100 and returns their average letter
 * grade.
 *
 * @author Jessica Ruehle
 */
public class HiLoGrade {
    public static void main(String[] args) {

        // prompt user to input three number grades and scan in each one. Declare as ints
        System.out.print("First three exam scores: ");
        Scanner in = new Scanner(System.in);
        int grade1 = in.nextInt();
        int grade2 = in.nextInt();
        int grade3 = in.nextInt();

        // declare three ints that evaluate the lowest and highest possible scores
        int minGrade = (grade1 + grade2 + grade3) / 4;
        int maxGrade = (grade1 + grade2 + grade3 + 100) / 4;

        // print to screen the highest and lowest possible letter grades using
        // letterGrade helper method
        System.out.printf("Highest possible grade: %c %n", letterGrade(maxGrade));
        System.out.printf("Lowest possible grade: %c %n", letterGrade(minGrade));

    }
    /**
     * Inputs an integer number grade and outputs the corresponding letter grade.
     *
     * @return letter grade as char.
     */
    private static char letterGrade(int a) {

        // Check to see what the number falls between to determine letter grade. Return
        // letter grade as a char
        if (a <= 60) {
            return 'F';
        } else if (a <= 70) {
            return 'D';
        } else if (a <= 80) {
            return 'C';
        } else if (a <= 90) {
            return 'B';
        } else {
            return 'A';
        }

    }
}

