package anudip;

public class Fizz_Buzz {
    
    public static void main(String args[]) {
        for(int i = 1; i <= 50; i++) { // Loop through numbers 1 to 50
            if(i % 4 == 0 && i % 5 == 0) // Check if number is divisible by both 4 and 5
                System.out.println("Fizz Buzz"); // Print "Fizz Buzz" if true
            else if(i % 5 == 0) // Check if number is divisible by 5
                System.out.println("Buzz"); // Print "Buzz" if true
            else if(i % 4 == 0) // Check if number is divisible by 4
                System.out.println("Fizz"); // Print "Fizz" if true
            else
                System.out.println(i); // Print the number if none of the conditions are true
        }
    }

}
