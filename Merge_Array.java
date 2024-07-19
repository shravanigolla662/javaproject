package anudip;

public class Merge_Array {
    public static void main(String args[]) {
        // First array
        int[] arr1 = {2, 4, 6, 8, 10};
        // Second array
        int[] arr2 = {1, 3, 5, 7, 9};
        
        // Calculate the size of the merged array
        int size = arr1.length + arr2.length;
        
        // Create an array to store the merged elements
        int merge[] = new int[size];
        
        // Copy elements from arr1 to merge array
        for (int i = 0; i < arr1.length; i++) {
            merge[i] = arr1[i];
        }
        
        // Copy elements from arr2 to merge array starting from the position after the last element of arr1
        for (int i = 0; i < arr2.length; i++) {
            merge[arr1.length + i] = arr2[i];
        }
        
        // Print the merged array
        System.out.print("Merged array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(merge[i] + " ");
        }
    }
}
