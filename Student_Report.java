package anudip;

import java.util.Scanner;
public class Student_Report {
	public static void main(String args[])
	{
		// Declaring variables
		int size;  // Variable to store the number of subjects
		double total=0; // Variable to store the total marks
		double percentage; // Variable to store the percentage
		boolean res=false; // Variable to check if any subject is failed
		
		// Create Scanner object to take input from user
		Scanner sc=new Scanner(System.in);
		
		 // User will enter the number of subjects
		System.out.println("Enter the number of subjects:");
		size = sc.nextInt(); // Read the input from user
		
		// Creating an array to store marks of each subject
		int arr[]=new int[size];
		
		// User will enter  the marks for each subject
		System.out.println("Enter the marks for "+size+" subjects:");
		
		// Loop to read marks of each subject
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();// Read marks from user
			total=total+arr[i]; // Calculate total marks
			
			// Check if marks of current subject is less than 35
			if(arr[i]<35)
				res=true; // Set res to true if any subject is failed
		}
		
		 if (res)  // Check if any subject is failed
	            System.out.println("You are FAIL"); // Print message if failed
		 else
		 {
			// Calculate percentage if all subjects are passed
			 percentage =(total/600)*100;
			 
			// Print congratulations message along with total marks and percentage
			 System.out.println("CONGRATULATIONS! You Are Passed");
			 System.out.println("TOTAL MARKS:"+total);
			 System.out.println("PERCENTAGE:"+percentage);
			 
		 }
    }
}
