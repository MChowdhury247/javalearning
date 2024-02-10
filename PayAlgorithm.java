package Java.Lab1;

import java.util.Scanner;

public class PayAlgorithm {
    public static void main(String[] args) {
        // Create a Scanner object to read from the keyboard
        Scanner keyboard = new Scanner(System.in);

        // Step 1: Display "How many hours did you work?"
        System.out.print("How many hours did you work? ");

        // Step 2: Input hours
        double hours = keyboard.nextDouble();

        // Step 3: Display "How much are you paid per hour?"
        System.out.print("How much are you paid per hour? ");

        // Step 4: Input rate
        double rate = keyboard.nextDouble();

        // Step 5: Perform the calculation
        double pay;
        if (hours <= 40) {
            // If hours is less than or equal to 40
            pay = hours * rate;
        } else {
            // If hours is greater than 40
            pay = (hours - 40) * (1.5 * rate) + 40 * rate;
        }

        // Step 6: Display the value in the pay variable
        System.out.println("You earned $" + pay);

        // Close the Scanner object
        keyboard.close();
    }
}
