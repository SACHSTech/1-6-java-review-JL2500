package gr11review.part1;
import java.util.Random;
import java.io.*;

/**
 * The Review8 class simulates a slot machine and randomizes 3 digits from 0 to 8,
 * this repeats 1000 times and the amount of triples is printed at the end.
 * 
 * This program uses the random class and simulates the randomizing 1000 times
 * using a for loop.
 * 
 * @author: Julian Li
 */
public class Review8 {

    /**
     * Main method to execute the program logic.
     * 
     * @param args Command line arguments (not used)
     * @throws IOException If there is an error during input
     */
    public static void main(String[] args) throws IOException {
        // Variable declaration
        int tripleCount = 0;
        Random myRandom = new Random();

        // For loop to simulate the slot machine 1000 times
        for (int i = 0; i < 1000; i++) {
            // 3 randomized numbers from 0-8
            int num1 = myRandom.nextInt(9);
            int num2 = myRandom.nextInt(9);
            int num3 = myRandom.nextInt(9);
            // If all three numbers are equal, the triple count increases by one
            if (num1 == num2 && num2 == num3) {
                tripleCount++;
            }
            System.out.println(num1 + " " + num2 + " " + num3);
        }

        System.out.println(tripleCount);
    }
}
