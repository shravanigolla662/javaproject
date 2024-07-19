package anudip;

import java.util.Scanner;

public class SumOfRange {

    // Method to calculate the sum of numbers from 1 to n
    void sum(int n) {
        int i = 1; // Initialize loop counter
        int sum = 0; // Initialize sum variable to store the cumulative sum
        
        // Loop to iterate from 1 to n
        while (i <= n) {
            sum += i; // Add current value of i to sum
            i++; // Increment i for the next iteration
        }
        
        // Print the final sum
        System.out.println("Sum of numbers from 1 to " + n + " is: " + sum);
    }
    
    // Main method where the program execution starts
    public static void main(String args[]) {
        int num; // Declare variable to hold user input
        SumOfRange s = new SumOfRange(); // Create an instance of SumOfRange class
        
        // Prompt user to enter a number
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in); // Create Scanner object to read input
        num = sc.nextInt(); // Read the integer input
        
        // Call the sum method of SumOfRange instance to calculate and print the sum
        s.sum(num);
    }

}
