package anudip;

public class Number_Pattern {

    public static void main(String[] args) {
        int i, j;

        // Outer loop controls the number of rows
        for (i = 5; i > 0; i--) {
            // Inner loop controls the number of columns (numbers per row)
            for (j = 1; j <= i; j++) {
                // Print the current value of 'j' followed by a space
                System.out.print(j + " ");
            }
            // Move to the next line after each row is printed
            System.out.println();
        }
    }

}
