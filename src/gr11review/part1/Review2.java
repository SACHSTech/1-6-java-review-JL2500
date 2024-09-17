package gr11review.part1;
import java.io.*;

/**
 * The Review2 class prompts the user for a menu option, then ouputs a joke based
 * on the menu option given.
 * 
 * This program uses switch and case to go through the menu options.
 * 
 * @author: Julian Li
 */
public class Review2 {

    /**
     * Main method to execute the program logic.
     * 
     * @param args Command line arguments (not used)
     * @throws IOException If there is an error during input
     */
    public static void main(String[] args) throws IOException {
        // Variable declaration
        int menuOption;
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        // Menu options
        System.out.println("0 - print a joke about your hair");
        System.out.println("1 - print a joke about your feet");
        System.out.println("2 - print a joke about your clothes");
        System.out.println("3 - print a joke about your teacher");

        // User input for menu
        System.out.print("Choose a menu option: ");
        menuOption = Integer.parseInt(keyboard.readLine());

        // Looks at the inputted menu option and ouputs a joke based on it
        switch (menuOption) {
            case 0: 
                System.out.println("Why do bees have sticky hair?");
                System.out.println("They always use honeycombs.");
                break;
            case 1:
                System.out.println("Why do bees have sticky feet?");
                System.out.println("They always use honeycombs.");
                break;
            case 2:
                System.out.println("Why do bees have sticky clothes?");
                System.out.println("They always use honeycombs.");
                break;
            case 3:
                System.out.println("What do you call a bee teacher?");
                System.out.println("Honeycombs.");
                break;
            // If it's not part of the case list, it will say it's invalid
            default:
                System.out.println("Invalid menu option");
        }
    }
}
