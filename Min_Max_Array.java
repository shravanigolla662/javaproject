package anudip;

public class Min_Max_Array {

	public static void main(String[] args) {
		// Array initialization
		int arr[]= {78,90,34,56,23,10};
		
		// Initialize variables to store minimum and maximum values
		int min=arr[0];  // Assume the first element is the minimum
		int max=arr[0];  // Assume the first element is the maximum
		
		// Iterate through the array to find minimum and maximum values
		for(int i=0;i<arr.length;i++)
		{
			 // Check if the current element is less than the current minimum
			if(min>arr[i]) 
				// Update min if the current element is smaller
				min=arr[i];
			
			// Check if the current element is greater than the current maximum
			if(max<arr[i])
				// Update max if the current element is greater
				max=arr[i];
		}
		
		// Print the maximum and minimum numbers
		System.out.println("Maximum number is:"+max);
		System.out.println("Manimum number is:"+min);

	}

}
