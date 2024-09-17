package gr11review.part1;
import java.text.DecimalFormat;
import java.io.*;

/**
 * The Review6 class prompts the user to input total number of items bought, then
 * after inputting the price of all the items, the program calculates the 
 * subtotal, tax, and final cost including tax.
 * 
 * This program uses a while loop and lots of arithmetic expressions to calculate
 * the costs.
 * 
 * @author: Julian Li
 */
public class Review6 {

    /**
     * Main method to execute the program logic.
     * 
     * @param args Command line arguments (not used)
     * @throws IOException If there is an error during input
     */
    public static void main(String[] args) throws IOException {
        // Variable declarations
        double cost = 0.0;
        double totalCost = 0.0;
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat dec = new DecimalFormat("0.00");

        // While loop to make an input for each item and add its price to the total
        while (true) {
            System.out.print("Enter the price for an item: ");
            cost = Double.parseDouble(keyboard.readLine());
            if (cost == 0) {
                break;
            }
            totalCost += cost;
        }

        // Calculates tax and final cost with tax
        double tax = totalCost * 0.13;
        double finalCost = totalCost * 1.13;

        System.out.println("Subtotal: $" + dec.format(totalCost));
        System.out.println("Tax: $" + dec.format(tax));
        System.out.println("Total: $" + dec.format(finalCost));
    }
}
