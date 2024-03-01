package edu.bloomu.hw1;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * The purpose of this program is to take a user-inputted word and make it into a
 * random anagram. This is done by finding a random point in the word, and swapping the
 * two halves.
 *
 * @author Jessica Ruehle
 */

public class RandomAnagram {
    public static void main(String[] args) {

        //prompt the user to enter an input
        System.out.print("Enter any word here: ");
        //IDE scans for input from user
        Scanner in = new Scanner(System.in);
        //Declares input as a string named "word"
        String word = in.next();
        //Tells computer what to do with input

        //This portion retrieves the length of the word and then picks a random point
        // in the word.
        word.length();
        ThreadLocalRandom rand = ThreadLocalRandom.current();
        int randNum = rand.nextInt(0, word.length());
        String a = word.substring(0, randNum);
        String b = word.substring(randNum, word.length());

        //Outputs mutated string
        System.out.println("Random Anagram: " + b  + a);


    }
}
