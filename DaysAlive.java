package ed.bloomu.homework4;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import static java.time.temporal.ChronoUnit.DAYS;

/**
 * Prompts the user to input their birthday and returns information to the console in
 * respect to that date. This information includes how many months, days, and years
 * they've been alive as well as today's date.
 *
 * @author Jessica Ruehle
 */
public class DaysAlive {
    public static void main(String[] args) {
        //prompt the user to input their birthday and scan it int the computer
        System.out.print("Enter date of birth in MM DD YYYY format: ");
        Scanner in = new Scanner (System.in);

        // declare each of the numbers inputted by the user as integers
        int bdayMonth = in.nextInt();
        int bdayDay = in.nextInt();
        int bdayYear = in.nextInt();

        // retrieve the current time and day using the LocalDateTime class. I declared
        // the current date/time as "today". I also made the user-inputted numbers a
        // date using LocalDateTime.of method
        LocalDateTime today = LocalDateTime.now();
        LocalDateTime bday = LocalDateTime.of(bdayYear, bdayMonth, bdayDay, 00, 00);

        //I changed the LocalDateTime to a LocalDate using the .toLocalDate() method
        LocalDate todayLocal = today.toLocalDate();
        LocalDate bdayLocal = bday.toLocalDate();

        //determine the amount of time between the
        Period todayAge = Period.between(bdayLocal, todayLocal);

        //formats the date to print to screen in an easily readable way with proper
        // punctuation and grammar
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy");

        //uses the method .between to determine the amount of days since birth
        long daysBetween = DAYS.between(bdayLocal, todayLocal);

        //prints all information to screen
        System.out.println("Today is " + today.format(formatter) + ".");
        System.out.printf("You are %d years, %d months, and %d days old.%n",
                todayAge.getYears(), todayAge.getMonths(), todayAge.getDays());
        System.out.printf("You have been alive for %,d days", daysBetween);
    }
}
