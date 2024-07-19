package anudip;

import java.util.Scanner;

public class Duplicate_Values {

    public static void main(String[] args) {
        String str; // Variable to hold the input string
        int count = 0; // Counter for duplicate characters
        int i, j; // Loop variables

        Scanner sc = new Scanner(System.in); // Creating Scanner object for input
        System.out.println("Enter your String:");
        str = sc.next(); // Reading input string from user
        char arr[] = str.toCharArray(); // Converting string to character array

        // Nested loops to compare each character with every other character
        for (i = 0; i < str.length(); i++) {
            for (j = i + 1; j < str.length(); j++) {
                if (arr[i] == arr[j]) { // If duplicate characters are found
                    count++; // Increment count for duplicate characters
                    // Printing duplicate characters (optional)
                    System.out.println(arr[j]);
                }
            }
        }
        
        System.out.println("The number of duplicate values is: " + count); // Printing total count of duplicate characters
        
        sc.close(); // Closing Scanner object to release resources
    }

}
