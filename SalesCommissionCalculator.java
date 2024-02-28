import java.util.Scanner;

public class SalesCommissionCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Initialize variables for base salary and commission rate
        double baseSalary = 200.0;
        double commissionRate = 0.09;

        // Prompt the user to enter sales in dollars
        while (true) {
            System.out.print("Enter sales in dollars (-1 to end): ");
            double sales = scanner.nextDouble();

            // Check if the user wants to end the program
            if (sales == -1) {
                System.out.println("Program ended. Goodbye!");
                break;
            }

            // Calculate salary using commission rate
            double salary = baseSalary + (commissionRate * sales);

            // Display the salary with spaces for better readability
            System.out.println("Salary is: $" + salary + "\n");
        }

        // Add a blank line for separation 
        System.out.println(); // Blank line for separation

        // Close the scanner
        scanner.close();
    }
}
