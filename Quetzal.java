package edu.bloomu.homework3;

import java.util.Scanner;

/**
 * Plays a game of Querzal. Game is played by rolling three die. All even die are added
 * together and multiplied by number of even die. Odd die are added together and
 * multiplied by number of odd die. The two totals are added together to return the
 * total profit made.
 *
 * @author Jessica Ruehle
 */
public class Quetzal {
    public static void main(String[] args) {

        // prompt user to enter dice rolls and scan in. Declare each die as an int
        System.out.print("Enter dice rolls: ");
        Scanner in = new Scanner(System.in);
        int die1 = in.nextInt();
        int die2 = in.nextInt();
        int die3 = in.nextInt();

        // print to screen the total profit using profit method and inputting the three
        // die values to be evaluated by helper method
        System.out.println("Profit: $" + profit(die1, die2, die3));
    }
    /**
     * Determines the number of odd and even die and returns the total profit made.
     *
     * @return total profit.
     */
    private static int profit(int die1, int die2, int die3) {

        // create 4 ints to keep track of counts for odd and even die
        int sumOdd = 0;
        int sumEven = 0;
        int oddCount = 0;
        int evenCount = 0;

        // using if else statements, check if each die is even or odd. Add 1 to ints
        // evenCount or oddCount, respectively. Add die value to sumEven or sumOdd ints
        if (die1 % 2 == 0) {
            evenCount++;
            sumEven += die1;
        } else {
            oddCount++;
            sumOdd += die1;
        }
        if (die2 % 2 == 0) {
            evenCount++;
            sumEven += die2;
        } else {
            oddCount++;
            sumOdd += die2;
        }
        if (die3 % 2 == 0) {
            evenCount++;
            sumEven += die3;
        } else {
            oddCount++;
            sumOdd += die3;
        }

        // return the even die sum times the number of even die plus the odd die sum
        // times the number of odd die
        return (evenCount * sumEven) + (oddCount * sumOdd);

    }
}
/* alternate solution

private static int getProfit(int x, int y, int z) {
    int numOdd = x % 2 + y % 2 + z % 2;
    int numEven = 3 - numOdd;

    int oddSum = (x % 2) * x + (y % 2) * y + (z % 2) * z;
    int evenSum = x + y + z - oddSum;

    return numEven * evenSum + numOdd * oddSum;
}
 */
