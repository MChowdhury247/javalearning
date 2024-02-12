package javalearning.javalearning;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class intro {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        // Get user information
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the number of hours you worked: ");
        int hoursWorked = scanner.nextInt();

        System.out.print("Enter your hourly rate: ");
        double hourlyRate = scanner.nextDouble();

        // Calculate regular pay and overtime pay
        double regularPay = Math.min(hoursWorked, 40) * hourlyRate;
        double overtimePay = Math.max(0, hoursWorked - 40) * hourlyRate * 1.5;

        // Calculate total pay
        double totalPay = regularPay + overtimePay;

        // Store data in text file
        File file = new File("storeData.txt");
        FileWriter writer = new FileWriter(file);
        writer.write("Name: " + name + "\n");
        writer.write("Hours Worked: " + hoursWorked + "\n");
        writer.write("Hourly Rate: $" + hourlyRate + "\n");
        writer.write("Regular Pay: $" + regularPay + "\n");
        writer.write("Overtime Pay: $" + overtimePay + "\n");
        writer.write("Total Pay: $" + totalPay + "\n");
        writer.close();

        // Inform user
        System.out.println("Employee information and pay details have been saved to storeData.txt");
    }
}