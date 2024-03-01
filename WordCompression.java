package edu.bloomu.homework3;

import java.util.Scanner;

/**
 * Takes a user-inputted word and compresses it. If the first letter occurs more than
 * once, the letters between the first and second instance of the first letter are
 * replaced by the amount of letters removed. If the letter does not occur a second
 * time, it simply removes the first letter of the word.
 *
 * @author Jessica  Ruehle
 */
public class WordCompression {
    public static void main(String[] args) {

        // prompts user to input a word and declares input as a string called word
        System.out.print("Enter a word: ");
        Scanner in = new Scanner(System.in);
        String word = in.next();

        // prints the compressed version of the word to screen
        System.out.println("Compressed: " + compressedWord(word));
    }

    /**
     * Compresses the word by checking if the first letter occurs more than once.
     *
     * @param a user-inputted word.
     * @return compressed word.
     */
    private static String compressedWord(String a) {

        // declares the first letter of the word as a char
        char firstLetter = a.charAt(0);
        // finds the first index of the first letter after the first occurrence of it
        int lastLetter = a.indexOf(firstLetter, 1);

        // declares a as a StringBuilder to allow mutations
        StringBuilder x = new StringBuilder(a);

        if (lastLetter != -1) { // check if the first letter occurs a second time
            // create a substring from first letter to second occurrence of 1st letter
            String between = a.substring(1, lastLetter);
            // determine length of substring
            int betweenLength = between.length();

            if (lastLetter >= 2) { // if the letter occurs more than once
                // delete the letters in-between the 1st and last occurrence
                x.delete(1, lastLetter);
                // insert a number in place of letters
                x.insert(1, betweenLength);
            } else { // if it only occurs once, just delete the first letter of the word
                x.delete(0, 1);
            }
        } else {
            x.delete(0, 1);
        }
        //return as a string
        return x.toString();

    }
    /*
       char c = str.charAt(0);
       int i str.indexOf(c, 1);
       if (i > 2) {
            return c + ((i-1) + (c + str.substring(i + 1)));
         }
         return str.substring(1)
     */
}
