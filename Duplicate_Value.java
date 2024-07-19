package anudip;

public class Duplicate_Value {
    public static void main(String args[]) {
        // Array declaration and initialization
        int arr[] = {10,20,30,56,87,56,10,20};
        int count = 0;

        System.out.println("Duplicate values are:");
        // Loop to check the array for duplicate values
        for (int i=0; i<arr.length; i++) {
            // Nested loop to compare each element with subsequent elements
            for (int j =i+1; j<arr.length; j++) {
                // Check if current element is equal to any subsequent element
                if (arr[i] == arr[j]) {
                    // If duplicate found, print the duplicate value
                    System.out.println(arr[j]);
                    count++;
                }
            }
        }
       //Printing the no.of.duplications
        System.out.println("Total number of duplicates: " + count);
    }
}
