package anudip;

public class Operators {
    public static void main(String args[]) {
        // Initializing variables
        int a = 20, b = 10, c = 30, result; // integers a, b, c and result
        char i = 'o'; // character variable i initialized with 'o'
        int h = 100; // integer variable h initialized with 100

        // Widening conversion from int to long
        long j = h; // j is now 100 (h is converted to long implicitly)

        // Narrowing conversion from int to char
        char g = (char) h; // g is now 'd' (corresponding to ASCII value 100)

        // Ternary operator nested to find the maximum among a, b, and c
        result = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c); 
        // result is assigned the maximum of a, b, and c using nested ternary operators

        // Printing results
        System.out.println(result); // Output: 30 (since c = 30 is the largest)
        System.out.println(i++);    // Output: 'o' (prints current value of i and then increments)
        System.out.println(j);      // Output: 100 (prints the value of j which is 100)
        System.out.println(g);      // Output: 'd' (prints the character corresponding to ASCII 100)
    }
}
