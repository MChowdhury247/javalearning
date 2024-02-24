package Java.lab3; // Declares the package name where this class resides

import java.util.Random; // Needed for the Random class

/**
 * this class simulates rolling a pair of dice 10,000 times
 * and counts the number of times doubles of are rolled for
 * each different pair of doubles.
 *
 * explaination: This code pretends to roll two dice many times and
 * counts how often both dice show the same number.
 * Then, it tells you how many times each pair of numbers showed up the same on both dice.
 */
public class DiceSimulation {
    public static void main(String[] args) { // Main method, entry point of the program
        final int NUMBER = 10000; // Number of dice rolls

        // A random number generator used in
        // simulating the rolling of dice
        Random generator = new Random(); // Initializing Random object for generating random numbers

        int die1Value; // Value of the first die
        int die2Value; // Value of the second die
        int count = 0; // Total number of dice rolls
        int snakeEyes = 0; // Number of snake eyes rolls
        int twos = 0; // Number of double two rolls
        int threes = 0; // Number of double three rolls
        int fours = 0; // Number of double four rolls
        int fives = 0; // Number of double five rolls
        int sixes = 0; // Number of double six rolls

        // Roll the dice and count doubles
        while (count < NUMBER) { // Loop to simulate dice rolling 10,000 times
            die1Value = generator.nextInt(6) + 1; // Roll the first die
            die2Value = generator.nextInt(6) + 1; // Roll the second die

            // If the values are the same, increment the appropriate counter
            if (die1Value == die2Value) { // Check if the values of two dice are equal
                switch (die1Value) { // Switch statement based on the value of the first die
                    case 1:
                        snakeEyes++; // Increment snakeEyes if both dice are 1
                        break;
                    case 2:
                        twos++; // Increment twos if both dice are 2
                        break;
                    case 3:
                        threes++; // Increment threes if both dice are 3
                        break;
                    case 4:
                        fours++; // Increment fours if both dice are 4
                        break;
                    case 5:
                        fives++; // Increment fives if both dice are 5
                        break;
                    case 6:
                        sixes++; // Increment sixes if both dice are 6
                        break;
                }
            }

            count++; // Increment the number of rolls
        }

        // Display the results
        System.out.println("You rolled snake eyes " + snakeEyes + " out of " + count + " rolls.");
        System.out.println("You rolled double twos " + twos + " out of " + count + " rolls.");
        System.out.println("You rolled double threes " + threes + " out of " + count + " rolls.");
        System.out.println("You rolled double fours " + fours + " out of " + count + " rolls.");
        System.out.println("You rolled double fives " + fives + " out of " + count + " rolls.");
        System.out.println("You rolled double sixes " + sixes + " out of " + count + " rolls.");
    }
}
