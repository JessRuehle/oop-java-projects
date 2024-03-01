package edu.bloomu.hw1;

import java.util.Scanner;

/**
 * The purpose of this program is to take a user-inputted word, split it up,
 * move it down, back, and forth in a snake like shape when printed to the console. This
 * is done by dividing the word into four sections and using substrings and
 * StringBuilders to mutate the different portions of the word.
 *
 * @author Jessica Ruehle
 */

public class Snake {
    public static void main(String[] args) {
        //these three lines of code prompt the user to input a word and then tells the
        // computer  to declare that word a String called "word"
        System.out.print("Enter any word: ");
        Scanner in = new Scanner(System.in);
        String input = in.next();
        int wordInput = input.length();

        //This equation determines the amount of spaces needed to make the word
        // divisible into four equal sections
        int a = (4 - wordInput % 4) % 4;

        //This adds on those spaces to the word, creating a string called finalWord
        String spaces = " ".repeat(a);
        String finalWord = input + spaces;

        //Final word is divided into four parts and each point that begins the new
        // section is labeled as such
        int pointOne = finalWord.length() / 4;
        int pointTwo = pointOne * 2;
        int pointThree = pointOne * 3;

        //Four substrings of the original word are created, each going from one point
        // to the next
        String lineOne = finalWord.substring(0, pointOne);
        StringBuilder lineTwo = new StringBuilder(finalWord.substring(pointOne, pointTwo));
        String lineThree = finalWord.substring(pointTwo, pointThree);
        StringBuilder lineFour = new StringBuilder(finalWord.substring(pointThree));

        //This prints out each of the sections of the word, line by line. The second
        // and fourth lines have a .reverse to give the final product a "snake"
        // appearance
        System.out.println(lineOne);
        System.out.println(lineTwo.reverse());
        System.out.println(lineThree);
        System.out.println(lineFour.reverse());


    }
}
