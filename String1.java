package anudip;

import java.util.Scanner;

public class String1 {

    public static void main(String[] args) {
        // Declare variables to hold original and modified strings
        String originalString;
        String modifiedString;
        
        // Create a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.println("Enter a string:");
        
        // Read the input string from the user
        originalString = sc.next();
        
        // Call the method to modify the string
        modifiedString = replaceWithX(originalString);
        
        // Display the modified string
        System.out.println("Modified string: " + modifiedString);
    }
    
    // Method to replace all characters in the input string except the last 4 with 'X'
    public static String replaceWithX(String input) {
        // Create a StringBuilder object to build the modified string
        StringBuilder sb = new StringBuilder();
        
        // Iterate over the characters of the input string, leaving the last 4 characters unchanged
        for (int i = 0; i < input.length() - 4; i++) {
            // Replace each character with 'X'
            sb.append('X');
        }
        
        // Append the last 4 characters of the input string without modification
        sb.append(input.substring(input.length() - 4));
        
        // Convert the StringBuilder object to a string and return it
        return sb.toString();
    }
}
