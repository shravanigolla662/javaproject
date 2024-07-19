package anudip;

public class Star_Pattern {

    public static void main(String[] args) {
        int i, j; // Declare variables i and j for loop control
        
        // Outer loop to iterate over rows (5 rows in total)
        for (i = 5; i > 0; i--) {
            // Inner loop to print stars in each row
            for (j = 0; j < i; j++) {
                System.out.print("* "); // Print a star followed by a space
            }
            System.out.println(); // Move to the next line after each row is printed
        }
    }

}
