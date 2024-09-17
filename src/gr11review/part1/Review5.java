package gr11review.part1;
import java.io.*;

/**
 * The Review5 class prompts the user to input a yearly amount, a target, and the compound interest
 * rate, and outputs the amount of years it takes to reach the target money amount.
 * 
 * This program uses a while loop and lots of arithmetic expressions to calculate
 * the interest.
 * 
 * @author: Julian Li
 */
public class Review5 {

    /**
     * Main method to execute the program logic.
     * 
     * @param args Command line arguments (not used)
     * @throws IOException If there is an error during input
     */
    public static void main(String[] args) throws IOException {
        // Variable declarations
        int yearlyAmt;
        double compoundRate;
        int target;
        int index = 0;
        double totalMoney = 0;
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        // User inputs
        System.out.print("Enter the yearly invested amount: ");
        yearlyAmt = Integer.parseInt(keyboard.readLine());
        System.out.print("Enter the compound interest rate: ");
        compoundRate = Double.parseDouble(keyboard.readLine());
        System.out.print("Enter the target amount: ");
        target = Integer.parseInt(keyboard.readLine());

        // While loop that continuously simulates the interest money
        while (true) {
            // Checks if the money meets the target, and ends the loop if it does
            if (totalMoney >= target) {
                System.out.println("The target amount will be earned in " + index + " years.");
                break;
            }
            // Adds the yearly amount to the money, then adds the interest, then increases year count by 1
            totalMoney += yearlyAmt;
            totalMoney += totalMoney * (compoundRate/100);
            index++;
        }
    }
}
