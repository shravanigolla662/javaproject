package anudip;

import java.util.Scanner;

public class GreatestNumber {
    
    public static void main(String args[]) {
        int a, b; // Declaring variables to hold two numbers
        
        System.out.println("Enter two numbers:"); // Prompting the user to enter two numbers
        
        Scanner sc = new Scanner(System.in); // Creating Scanner object for input
        a = sc.nextInt(); // Reading first number from user
        b = sc.nextInt(); // Reading second number from user
        
        GreatestNumber n = new GreatestNumber(); // Creating an instance of GreatestNumber class
        n.number(a, b); // Calling the number method to find the greatest number
    }
    
    void number(int a, int b) {
        if (a > b)
            System.out.println("Greater number is: " + a); // Printing the greater number if 'a' is greater than 'b'
        else
            System.out.println("Greater number is: " + b); // Printing the greater number if 'b' is greater than or equal to 'a'
    }

}
