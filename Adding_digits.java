package anudip;

import java.util.Scanner;

public class Adding_digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        
        // Calculate the sum until it becomes a single-digit number
        int result = SingleDigitSum(num);
        
        System.out.println("The sum of digits until it becomes a single-digit number: " + result);
    }
    
    // Function to calculate the sum until it becomes a single-digit number
    public static int SingleDigitSum(int num) {
        while (num > 9) {
            int sum = 0;
            while (num != 0) {
                sum =sum+num % 10;
                num =num/ 10;
            }
            num = sum;
        }
        return num;
    }
}
