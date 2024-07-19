package anudip;

public class Rotating_Array {
	public static void main(String args[])
	{
		int[] arr= {1,3,5,7,9,11};  //declaring the array
		int n=arr.length; // Storing the length of the array
		int temp;  // Temporary variable for storing the last element
		
		temp=arr[n-1]; // Storing the last element of the array
		
		// Shifting elements to the right
		for(int i=n-1;i>0;i--) {
			arr[i]=arr[i-1];
		}
		
		arr[0]=temp; // Moving the last element to the first position
		
		// Printing the rotated array
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);
			
	}

}
