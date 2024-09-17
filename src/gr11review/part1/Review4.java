package gr11review.part1;
import java.text.DecimalFormat;
import java.io.*;

/**
 * The Review4 class prompts the user to input total number of items bought, then
 * after inputting th eprice of all the items, the program calculates the 
 * subtotal, tax, and final cost including tax.
 * 
 * This program uses for loops and lots of arithmetic expressions to calculate
 * the costs.
 * 
 * @author: Julian Li
 */
public class Review4 {

    /**
     * Main method to execute the program logic.
     * 
     * @param args Command line arguments (not used)
     * @throws IOException If there is an error during input
     */
    public static void main(String[] args) throws IOException {
        // Variable declarations
        int itemCount;
        double cost = 0.0;
        double totalCost = 0.0;
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat dec = new DecimalFormat("0.00");

        // User input of items bought
        System.out.print("How many items do you want to buy? ");
        itemCount = Integer.parseInt(keyboard.readLine());

        // For loop to make an input for each item and add its price to the total
        for (int i = 1; i <= itemCount; i++) {
            System.out.print("Enter the price for item " + i + ": ");
            cost = Double.parseDouble(keyboard.readLine());
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
