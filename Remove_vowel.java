package anudip;

import java.util.Scanner;

public class Remove_vowel {

    public static void main(String[] args) {
        String str; // Declare a String variable to hold user input
        Scanner sc = new Scanner(System.in); // Create Scanner object for input
        
        // Prompt user to enter a string
        System.out.println("Enter your String:");
        str = sc.nextLine(); // Read user input as a String
        str = str.toLowerCase(); // Convert the input String to lowercase
        char arr[] = str.toCharArray(); // Convert the String to a char array
        StringBuilder result = new StringBuilder(); // StringBuilder to store the result
        
        // Iterate through each character in the input String
        for (int i = 0; i < str.length(); i++) {
            char ch = arr[i]; // Get current character
            
            // Check if the character is not a vowel (a, e, i, o, u)
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                result.append(ch); // Append the character to the result StringBuilder
            }
        }
        
        // Print the final result after removing vowels
        System.out.println("String after removing vowels:");
        System.out.println(result.toString()); // Convert StringBuilder to String and print
    }

}
