package anudip;

import java.io.*;
import java.util.Scanner;
//Defining the class
class RelationalOperators
{
	public static void main(String args[])
	{
		//Declaring the variables
		int a,b;
		System.out.println("Enter the value of a and b:");
		Scanner sc=new Scanner(System.in);
		//Initialising the variables
		a=sc.nextInt();
		b=sc.nextInt();
		//Relational operators conditions
		System.out.println("values of a&b are equal : "+(a==b));
	    System.out.println("values of a&b are notequal : "+(a!=b));
	    System.out.println("a is lessthan b : "+(a<b));
	    System.out.println("a is greater than b : "+(a>b));
	    System.out.println("a is lessthan orequal to b :  "+(a<=b));
	    System.out.println("a is lessthan orequal to b : "+(a>=b)) ;
	  }
}
