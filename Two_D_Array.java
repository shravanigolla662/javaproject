package anudip;

//Two_D_Array class to demonstrate 2D array operations
public class Two_D_Array {
 
 public static void main(String args[]) {
     // Creating a 2D array 'arr' with dimensions 2x2
     int[][] arr = new int[2][2];
     
     // Assigning values to elements of 'arr'
     arr[0][0] = 10;
     arr[0][1] = 20;
     arr[1][0] = 30;
     arr[1][1] = 40;
     
     // Printing elements of 'arr' using nested loops
     System.out.println("Printing arr:");
     int i, j;
     for (i = 0; i < 2; i++) {
         for (j = 0; j < 2; j++) {
             System.out.print(arr[i][j] + " "); // Print each element followed by space
         }
         System.out.println(); // Move to the next line after printing each row
     }
     
     // Creating a 2D array 'arr1' using initialization syntax
     int[][] arr1 = { {1, 2, 3}, {4, 5, 6} };
     
     // Printing number of rows and columns in 'arr1'
     System.out.println("\nPrinting arr1:");
     System.out.println("Number of rows: " + arr1.length); // Length of arr1 gives number of rows
     System.out.println("Number of columns in first row: " + arr1[0].length); // Length of arr1[0] gives number of columns in the first row
 }
}
