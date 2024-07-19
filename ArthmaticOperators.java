package anudip;

import java.io.*;
import java.util.Scanner;
//Defining the class
class ArthmaticOperators
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
        //ArthmaticOperators calculations
        System.out.println("Sum of a&b is:"+(a+b));
        System.out.println("Difference of a&b is:"+(a-b));
        System.out.println("Product of a&b is:"+(a*b));
        System.out.println("Division of a&b is:"+(a/b));
        System.out.println("Modulo of a&b is:"+(a%b));
        }
}

