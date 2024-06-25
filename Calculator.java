package anudip;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;

        // Loop until the user chooses to exit
        do {
            System.out.println("Enter your calculation:");
            double num1 = scanner.nextDouble();
            char operator = scanner.next().charAt(0);
            double num2 = scanner.nextDouble();

            // Perform calculation and display result
            double result = calculate(num1, num2, operator);
            System.out.println("Result: " + result);

            // Ask user if they want to continue
            System.out.println("Do you want to continue? (Y/N)");
            choice = scanner.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');

        // Display closing message when calculator exits
        System.out.println("Calculator closed.");
    }

    // Method to perform calculation based on operator
    public static double calculate(double num1, double num2, char operator) {
        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                // Check for division by zero
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error! Division by zero.");
                }
                break;
            default:
                // Display error for invalid operator
                System.out.println("Error! Invalid operator.");
        }
        return result;
    }
}
