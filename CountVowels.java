package anudip;

import java.util.Scanner;
import java.util.StringTokenizer;

public class CountVowels {

    public static void main(String[] args) {
        String str; // Declaring a variable to hold the input string
        int vcount = 0; // Initializing counter for vowels
        int ccount = 0; // Initializing counter for consonants
        int wcount = 0; // Initializing counter for words
        Scanner sc = new Scanner(System.in); // Creating a Scanner object for input
        System.out.println("Enter your String:"); // Prompting the user to enter a string
        str = sc.nextLine(); // Reading the input string from the user
        str = str.toLowerCase(); // Converting the string to lowercase (for case-insensitive comparison)
        char arr[] = str.toCharArray(); // Converting the string to a character array
        
        StringTokenizer st = new StringTokenizer(str, " "); // Tokenizing the string based on spaces to count words
        wcount = st.countTokens(); // Counting the number of tokens (words)

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = arr[i]; // Get the current character
            // Check if the character is a vowel (assuming English vowels)
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vcount++; // Increment vowel count if the character is a vowel
            } else {
                ccount++; // Increment consonant count if the character is not a vowel
            }
        }
        
        // Output the results
        System.out.println("Number of vowels in the string: " + vcount);
        System.out.println("Number of consonants in the string: " + ccount);
        System.out.println("Number of words in the string: " + wcount);

        sc.close(); // Closing the Scanner object
    }
}
