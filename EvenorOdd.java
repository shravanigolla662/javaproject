package anudip;

import java.util.Scanner;

public class EvenorOdd {

    public static void main(String args[]) {
        int num; // Variable to hold the input number

        System.out.println("Enter a number:"); // Prompting the user to enter a number

        Scanner sc = new Scanner(System.in); // Creating Scanner object for input
        num = sc.nextInt(); // Reading integer input from user

        // Checking if the number is even or odd
        if (num % 2 == 0) { // If the number is divisible by 2 with no remainder
            System.out.println("It is an even number"); // Print message for even number
        } else {
            System.out.println("It is an odd number"); // Print message for odd number
        }

        sc.close(); // Closing Scanner object to release resources
    }

}
