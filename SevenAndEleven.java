package edu.bloomu.hw4;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Simulates a game of Seven and Eleven. A player rolls two die trying to get a sum of
 * 7 or 11. Once the player reaches one, it will continue to roll until it gets the
 * other. The game is won by obtaining both sums.
 *
 * KNOWN BUGS:
 * 1. The program always outputs "0:00" as the expected number of rolls. Despite a lot
 * of trial and error, I am unable to determine why this is happening.
 *
 * @author Jessica Ruehle
 */
public class SevenAndEleven {
    public static void main(String[] args) {

        // number of times game will be played
        final int games = 10_000_000;
//        final int games = 1;

        // prints result of simulation to screen
        System.out.printf("Expected number of rolls needed: %.2f", sevenAndEleven(games));
    }

    /**
     * Simulates a game of Seven and Eleven.
     *
     * @return average number of rolls.
     */
    private static double sevenAndEleven(int x) {
        //int rolls keeps track of number of rolls it takes
        int rolls = 0;

        for (int i = 0; i < x; i++) {
            // when the die do not equal 7 or 11, the booleans will return false
            boolean notSeven = true;
            boolean notEleven = true;

            // while die1 + die2 are not equal to 7 or 11, add 1 to number of rolls
            while (notSeven || notEleven) {

                //random number generator generates random integers between 1 and 7 to
                // simulate dice rolls
                ThreadLocalRandom random  = ThreadLocalRandom.current();
                int die1 = random.nextInt(1,7);
                int die2 = random.nextInt(1,7);

                rolls++;

                if (die1 + die2 == 7) { // If the sum of both die equals 7...
                    notSeven = false; //...declare boolean false to continue rolling for 11
                    // or to end loop if 11 is already found
                } else if (die1 + die2 == 11) { // If the sum of both die equals 11...
                    notEleven = false; //...declare boolean false to continue rolling for
                    // 7 of to end loop is 7 is already found
                }
            }
        }


        return (double) rolls / x;
    }
}
