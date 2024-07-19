package anudip;

public class Fibonacci1 {
    static int n1 = 0, n2 = 1, n3; // Static variables to hold Fibonacci sequence elements
    static int range; // Static variable to store the range of Fibonacci sequence

    // Constructor to initialize the instance variables
    public Fibonacci1(int n1, int n2, int n3, int range) {
        this.n1 = n1; // Initializing n1
        this.n2 = n2; // Initializing n2
        this.n3 = n3; // Initializing n3
        this.range = range; // Initializing range
    }

    // Method to calculate Fibonacci sequence and print the sum of elements
    synchronized static void sumOfElements() {
        int sum = 0; // Variable to store the sum of Fibonacci sequence

        // Loop to calculate Fibonacci sequence from 3rd to the specified range
        for (int i = 3; i <= range; i++) {
            n3 = n1 + n2; // Calculating the next Fibonacci number
            try {
                Thread.sleep(500); // Adding a delay for demonstration purposes
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(n3 + " "); // Printing the Fibonacci number
            n1 = n2; // Moving n2 to n1 for the next iteration
            n2 = n3; // Moving n3 to n2 for the next iteration
        }
    }
}
