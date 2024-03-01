package edu.bloomu.hw4;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Runs a simulation of the game Okapi Payout. In this game, you roll three die. If all
 * three are the same, then their numbers are added together and the sum is the total
 * profit earned. If two die are the same, then they are added and the sum is the total
 * profit. If none of the die are the same, than no money is made. This program runs
 * many instances of this game to determine the average profit any person playing it can
 * make.
 *
 * @author Jessica Ruehle
 */
public class OkapiPayout {
    public static void main(String[] args) {

        // declare an int to be the number of games played
        final int games = 10_000_000;

        // print to screen the predicted payout of Okapi
        System.out.printf("Predicted payout: $%.2f", playGame(games));
    }

    /**
     * PLays game of Okapi Payout.
     *
     * @param games
     * @return average profit.
     */
    private static double playGame(int games) {

        // total profit made from game
        int profit = 0;

        // for loop that plays game until number of games is reached
        for (int i = 0; i < games; i++) {
            //calls on a random number generator to generate a random int between 1 and 7
            ThreadLocalRandom rand = ThreadLocalRandom.current();
            int die1 = rand.nextInt(1, 7);
            int die2 = rand.nextInt(1, 7);
            int die3 = rand.nextInt(1, 7);

            // create a series of if statements for each possible case where profit can
            // be made
            if (die1 == die2 && die3 == die1) { // if all three die are the same...
                profit += die1 + die2 + die3; // ...add all three and add to profit
                //all else if statements are cases of 2 dies equaling each other
            } else if (die1 == die2) {
                profit += die1 + die2;
            } else if (die2 == die3) {
                profit += die2 + die3;
            } else if (die1 == die3) {
                profit += die1 + die3;
            }

        } // return the average profit by dividing the total profit by the number of
        // games played
        return (double) profit / games;
    }
}