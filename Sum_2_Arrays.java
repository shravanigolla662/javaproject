package anudip;

public class Sum_2_Arrays {

	public static void main(String[] args) {
		// Define two 2D arrays
		int[][] arr1= {{1,2,3},{3,4,5}}; // First 2D array
		int[][] arr2= {{5,6,7},{7,8,9}}; // Second 2D array
		int[][]	resarr=new int[2][3];     // Resultant 2D array to store the sum
		
		// Loop through each element of the arrays
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				// Calculate the sum of corresponding elements from arr1 and arr2
				resarr[i][j]=arr1[i][j]+arr2[i][j];
				// Print the sum
				System.out.print(resarr[i][j]+" ");
			}
			// Move to the next line after printing all elements of a row
			System.out.println();
		}
	}

}
