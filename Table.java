package anudip;

import java.util.Scanner;

//Table class to print multiplication table for a given number
public class Table {
 
 public static void main(String args[]) {
     int n, i; // Variables to hold the input number and loop counter
     Scanner sc = new Scanner(System.in); // Scanner object to read input
     
     System.out.println("Enter the table value:"); // Prompt user to enter a number
     n = sc.nextInt(); // Read the number entered by the user
     
     // Loop to calculate and print the multiplication table
     for (i = 1; i <= 10; i++) {
         // Print the multiplication expression and result
         System.out.println(n + " * " + i + " = " + (n * i));
     }
     
 }

}
