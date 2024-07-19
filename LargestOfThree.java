package anudip;

import java.util.Scanner;
public class LargestOfThree {
	public static void main(String args[])
	{
		 // Declare variables to hold three numbers
		int a,b,c;
		
		// Create a Scanner object to read input from the user
		Scanner sc=new Scanner(System.in);
		
		// Prompt the user to enter three numbers
        System.out.println("Enter three numbers:");
        
        // Read the three integers from the user input
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		// Compare the three numbers to find the greatest one
		if((a>b)&&(a>c))
			// If 'a' is greater than both 'b' and 'c', print that 'a' is the greatest
			System.out.println(a +"is the greatest number");
		else if((b>c)&&(b>a))
			// If 'b' is greater than both 'a' and 'c', print that 'b' is the greatest
			System.out.println(b +"is the greatest number");
		else
			// Otherwise, 'c' must be the greatest number
			System.out.println(c +"is the greatest number");
		
	}

}
