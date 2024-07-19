package anudip;

import java.util.Scanner;

public class DaysInaMonth {

    // Method to determine the number of days in a given month
    void month(int m) {
        switch(m) {
            // Cases for months with 31 days
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 Days");
                break;
            // Cases for months with 30 days
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 Days");
                break;
            // Case for February, handling leap years
            case 2:
                System.out.println("28/29 Days");
                break;
            // Default case for invalid month numbers
            default:
                System.out.println("Invalid Month");
                break;
        }
    }

    public static void main(String args[]) {
        int monthno;
        Scanner sc = new Scanner(System.in); // Creating Scanner object for input
        System.out.println("Enter Month Number:");
        monthno = sc.nextInt(); // Reading month number from user input
        
        DaysInaMonth obj = new DaysInaMonth(); // Creating object of DaysInaMonth class
        obj.month(monthno); // Calling month() method to determine days in the month
        
        sc.close(); // Closing Scanner object to release resources
    }
}
