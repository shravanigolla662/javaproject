package anudip;

import java.util.Scanner;

public class Command_Line_Argument { // Class definition
    public static void main(String args[]) { // Main method, entry point of the program
        Scanner sc = new Scanner(System.in); // Creating a Scanner object for user input
        
        System.out.println("Enter Your Marks:"); // Prompting user to enter marks
        int marks = sc.nextInt(); // Reading an integer input from the user
        
        if (marks >= 50) { // Checking if marks are greater than or equal to 50
            System.out.println("You have passed the exam!"); // Printing message for passing
            System.out.println("Enter your User Name:"); // Prompting user to enter username
        } else {
            System.out.println("Enter your User Name:"); // Printing message for entering username
        }
        
        sc.close(); // Closing the Scanner object to free resources
    }
}