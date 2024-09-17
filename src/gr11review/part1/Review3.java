package gr11review.part1;

/**
 * The Review3 contains 2 for loops, one printing the odd numbers from 20-100 and the other
 * counting backwards from 29-2.
 * 
 * @author: Julian Li
 */
public class Review3 {

    /**
     * Main method to execute the program logic.
     * 
     * @param args Command line arguments (not used)
     * @throws IOException If there is an error during input
     */
    public static void main(String[] args) throws Exception {
        // First for loop that goes from 20 to 100
        for (int i = 20; i <= 100; i++) {
            // Checks if number is odd
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        System.out.println();

        // Second for loop that counts backwards from 29 to 2
        for (int j = 29; j >= 2; j--) {
            System.out.println(j);
        }
    }
}
