package Java.lab2;

import java.util.Scanner;
//task 5
public class Mileage {
    public static void main(String[] args) {
        // Print a line indicating this program will calculate mileage
        System.out.println("This program will calculate mileage.");

        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Print prompt to user asking for miles driven
        System.out.print("Enter miles driven: ");
        // Read in miles driven
        double milesDriven = scanner.nextDouble();

        // Print prompt to user asking for gallons used
        System.out.print("Enter gallons used: ");
        // Read in gallons used
        double gallonsUsed = scanner.nextDouble();

        // Calculate miles per gallon
        double milesPerGallon = milesDriven / gallonsUsed;

        // Print miles per gallon along with appropriate labels
        System.out.println("Miles per gallon: " + milesPerGallon);

        // Close the scanner
        scanner.close();
    }
}
