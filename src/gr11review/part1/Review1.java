package gr11review.part1;
import java.io.*;

/**
 * The Review1 class prompts the user to input the month and day number, then calculates
 * the day number it is on.
 * 
 * This program uses counters and for/if loops to add up all the days based on the 
 * months passed.
 * 
 * @author: Julian Li
 */
public class Review1 {

    /**
     * Main method to execute the program logic.
     * 
     * @param args Command line arguments (not used)
     * @throws IOException If there is an error during input
     */
    public static void main(String[] args) throws IOException {
        // Variable declarations
        int monthNum;
        int dayNum;
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        
        // User inputs for month/day
        System.out.print("Enter the month number: ");
        monthNum = Integer.parseInt(keyboard.readLine());
        System.out.print("Enter the day number: ");
        dayNum = Integer.parseInt(keyboard.readLine());

        // For loop that goes through all the months until it reaches the user's inputted month
        for (int i = 0; i < monthNum; i++) {
            // 31-day months (January, March, etc.)
            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                dayNum += 31;
            }
            // February
            else if (i == 2) {
                dayNum += 28;
            }
            // 30-day months (April, June, etc.)
            else if (i == 4 || i == 6 || i == 9 || i == 11) {
                dayNum += 30;
            }
        }

        System.out.println(dayNum);
    }
}
