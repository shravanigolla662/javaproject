package anudip;

import java.util.Scanner;

public class StudentEnroll {
    // Method to enroll a student based on income and degree completion status
    void enroll(int income, String status) {
        try {
            // Check if income exceeds 500000
            if (income > 500000) {
                throw new ArithmeticException(); // Throw ArithmeticException if income is too high
            } else if (status.equalsIgnoreCase("no")) {
                throw new NullPointerException(); // Throw NullPointerException if status is "no"
            }
            // If no exceptions are thrown, print enrollment success message
            System.out.println("Student Enrolled into the batch");
        } catch (Exception e) {
            // Catch any exception that might occur during enrollment
            System.out.println("Failed to enroll"); // Print failure message
        } 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt and read annual income
        System.out.println("Enter your annual income:");
        int income = sc.nextInt();

        // Prompt and read degree completion status
        System.out.println("Your Degree is completed (yes/no) :");
        String status = sc.next();

        // Create instance of StudentEnroll and call enroll method
        StudentEnroll se = new StudentEnroll();
        se.enroll(income, status);

    }
}
