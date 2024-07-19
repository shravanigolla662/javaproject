package anudip;

import java.util.Scanner;
public class Sort_Array {

	public static void main(String[] args) {
		int size; // Variable to store the size of the array
		int temp; // Temporary variable for swapping

		// Create Scanner object to take input from user
		Scanner sc=new Scanner(System.in);
		
		// Asking user to input the size of the array
		System.out.println("Enter the size of the array:");
		size=sc.nextInt();  // Taking input from user
		
		int arr[]=new int[size]; // Creating an array of given size

		// Asking user to input elements of the array
		System.out.println("Enter the " +size+ " elements of an array:");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt(); // Taking input for each element of the array
		}
		 // Sorting the array
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size-1;j++)
			{
				if(arr[j]>arr[j+1]) // Comparing adjacent elements
				{
					temp = arr[j]; //swaping the number if one number is greater than other
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		// Displaying the sorted array
		System.out.println("Sorted Array:");
		for(int i=0;i<size;i++)
		{
		System.out.println(arr[i]+" "); // Printing each element of the sorted array
		}

	}

}
