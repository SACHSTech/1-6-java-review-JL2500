package gr11review.part1;
import java.io.*;

/**
 * The Review7 class prompts the user to input a string, and outputs the amount
 * of characters, the amount of spaces, and the amount of times 'a' appears. It
 * also prints a dash for each odd character.
 * 
 * This program uses multiple for loops and if loops to go through the entire
 * string.
 * 
 * @author: Julian Li
 */
public class Review7 {

    /**
     * Main method to execute the program logic.
     * 
     * @param args Command line arguments (not used)
     * @throws IOException If there is an error during input
     */
    public static void main(String[] args) throws IOException {
        // Variable declaration
        String phrase;
        int count = 0;
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        // User input
        System.out.println("");
        phrase = keyboard.readLine();

        // Number of characters
        System.out.println("There are " + phrase.length() + " characters in the sentence.");

        // Counting number of spaces
        for (int i = 0; i < phrase.length(); i++) {
            // Adds 1 to the count if it finds a space in the substring
            if (phrase.substring(i, i+1).equals(" ")) {
                count++;
            }
        }
        // Prints and resets the count 
        System.out.println("There are " + count + " spaces in the sentence.");
        count = 0;

        // Counting number of 'a's
        for (int j = 0; j < phrase.length(); j++) {
            // Adds 1 to the count if it finds an 'a' in the substring
            if (phrase.substring(j, j+1).equals("a")) {
                count++;
            }
        }
        System.out.println("There are " + count + " letter a in the sentence.");

        // For loop that goes through the entire string
        for (int k = 0; k < phrase.length(); k++) {
            // If the character position is odd, a dash is printed
            if ((k + 1) % 2 == 1) {
                System.out.print("-");
            }
        }
    }
}
