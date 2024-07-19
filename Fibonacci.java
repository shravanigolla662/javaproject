package anudip;

import java.util.Scanner;
public class Fibonacci {
	public static void main(String args[])
	{
		/*declaring the 3 numbers and the range till how many numbers to do you want
		to print*/
		
		int number1,number2,number3,range;
		
		//enter the required range
		System.out.println("Enter the range:");
		Scanner sc=new Scanner(System.in);
		range=sc.nextInt();
		
		//initializing the number1 as 0 & number2 as 1
		number1=0;
		number2=1;
		
		//printing the values of number1 and number2
		System.out.print(number1+" ");
		System.out.print(number2+" ");
		
		//using for loop to add the previous numbers in the series upto the given range
		for(int i=3;i<=range;i++)
		{
			//adding previous two numbers
			number3=number1+number2;
			
			//printing the sum of two numbers
			System.out.print(number3+" ");
			//reassigning the values
			number1=number2;
			number2=number3;
			
		}
		
	}
	

}
