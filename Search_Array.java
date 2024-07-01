package anudip;

import java.util.Scanner;
public class Search_Array {
	public static void main(String args[])
	{
		// Array declaration and initialization
		int arr[]= {30,56,20,98,76,34,13};
		int search_num; // Variable to store the number to search 
		boolean found=false; // Variable to check if any element is not found
		
		// Create Scanner object to take input from user
		Scanner sc=new Scanner(System.in);
		
		 // User will enter the number of subjects
		System.out.println("Enter your searching element:");
		search_num=sc.nextInt(); // Read the number to search from the user
		
		// Loop for the array to search for the number
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==search_num) {
				found=true;  // Set res to true if element is found
				System.out.println("number found:"+arr[i]);
				break; // Exit the loop if element is found
				
			}
				
		}
		//  if the number is found and print the message
		if(found==false)
			System.out.println("number is not found");
		
	}

}
