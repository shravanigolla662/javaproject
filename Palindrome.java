package anudip;

import java.util.Scanner;
public class Palindrome {
	public static void main(String args[])
	{
		//declaring the required variables 
		int num,original_num,reverse_num=0,remainder;
		
		//user enters the number
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number:");
		num=sc.nextInt();
		
		//storing the user entered number into original number variable
		original_num=num;
		
		//when user entered number is not equal to zero the loop will execute
		while(num!=0)
		{
			/*get the remainder of the number by performing modulo operation and 
			store the value in remainder value in remainder variable */
			remainder=num%10;
			
			//multiply reverse number by 10 and add the remainder and store the value 
			reverse_num=reverse_num*10+remainder;
			
			//divide number by 10
			num=num/10;
		}
	/*if original and reverse numbers are same then it is a palindrome number otherwise
		not a palindrome number*/
		if(original_num==reverse_num)
			System.out.println(original_num  + "is a palindrome");
		else
			System.out.println(original_num  + "is not a palindrome");
	}

}
