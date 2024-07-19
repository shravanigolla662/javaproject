package anudip;

import java.util.Scanner;

//Class Reverse for reversing a string
class Reverse {
 public static void main(String[] args) {
     // Declaring variables
     String str; // To store the input string
     Scanner sc = new Scanner(System.in); // Scanner object to take input from the user

     // Prompting the user to enter a string
     System.out.println("Enter your String:");

     // Taking input from the user
     str = sc.next();

     // Converting the string to a character array
     char arr[] = str.toCharArray();

     // Looping through the character array in reverse order and printing each character
     for (int i = str.length() - 1; i >= 0; i--) {
         System.out.print(arr[i]); // Printing each character
     }
 }
}
