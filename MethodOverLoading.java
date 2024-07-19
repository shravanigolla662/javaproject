package anudip;

public class MethodOverLoading {

    // Method to calculate average of two numbers
    double avg(int a, int b) {
        double avg = (a + b) / 2.0; // Calculate average
        return avg; // Return the average
    }
    
    // Method to calculate average of three numbers
    double avg(int a, int b, int c) {
        double avg = (a + b + c) / 3.0; // Calculate average
        return avg; // Return the average
    }

    // Method to calculate average of four numbers
    double avg(int a, int b, int c, int d) {
        double avg = (a + b + c + d) / 4.0; // Calculate average
        return avg; // Return the average
    }

    public static void main(String args[]) {
        MethodOverLoading mvl = new MethodOverLoading(); // Create an instance of MethodOverLoading

        // Call and print average of two numbers
        System.out.println("Average of 2 numbers: " + mvl.avg(2, 4));

        // Call and print average of three numbers
        System.out.println("Average of 3 numbers: " + mvl.avg(2, 4, 8));

        // Call and print average of four numbers
        System.out.println("Average of 4 numbers: " + mvl.avg(2, 4, 10, 25));
    }

}
