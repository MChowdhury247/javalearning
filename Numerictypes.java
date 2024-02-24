package Java.lab2;

// TASK #2 Add an import statement for the Scanner class
// TASK #2(Alternate)
// Add an import statement for the JOptionPane class
import javax.swing.JOptionPane; // Import JOptionPane class for user input

/**
 * This program demonstrates how numeric types and operators behave in Java.
 */
public class NumericTypes {
    public static void main(String[] args) {
        // TASK #2 Create a Scanner object here
        // Scanner input = new Scanner(System.in); // Scanner object for user input
        // TASK #2(Alternate)
        // JOptionPane pane = new JOptionPane(); // Create a JOptionPane object for user input

        // TASK #2(Alternate)
        // Prompt the user to enter his or her first name using a dialog box
        String firstName = JOptionPane.showInputDialog("Enter your first name:");

        // TASK #2(Alternate)
        // Prompt the user to enter his or her last name using a dialog box
        String lastName = JOptionPane.showInputDialog("Enter your last name:");

        // Concatenate the first and last names
        String fullName = firstName + " " + lastName;

        // Display the full name using a message dialog box
        JOptionPane.showMessageDialog(null, "Your full name is: " + fullName);

        // TASK #3 Working with Strings
        // Get the first character from the user's first name
        char firstInitial = firstName.charAt(0);

        // Print out the user's first initial
        System.out.println("User's first initial: " + firstInitial);

        // Convert the fullName to uppercase
        fullName = fullName.toUpperCase();

        // Print out the fullName and its length
        System.out.println("Full name in uppercase: " + fullName);
        System.out.println("Length of the full name: " + fullName.length());

        // TASK #4 Using Predefined Math Functions
        // Prompt the user to enter the diameter of a sphere
        double diameter = Double.parseDouble(JOptionPane.showInputDialog("Enter the diameter of a sphere:"));

        // Calculate the radius
        double radius = diameter / 2;

        // Calculate the volume of the sphere
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        // Print the results
        System.out.println("Volume of the sphere: " + volume);
    }
}
