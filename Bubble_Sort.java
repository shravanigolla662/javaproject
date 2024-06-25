package anudip;


public class Bubble_Sort {
    public static void main(String args[]) {
        // Array to be sorted
        int[] arr = {56, 89, 34, 27, 12};

        // Length of the array
        int n = arr.length;
        
        // Temporary variable for swapping
        int temp;

        // Iterating through the array
        for (int i = 0; i < n; i++) {
            // Inner loop for comparing and swapping elements
            for (int j = 0; j < n - 1; j++) {
                // Comparing adjacent elements
                if (arr[j] > arr[j + 1]) {
                    // Swapping the elements if they are in the wrong order
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Printing the sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++)
            System.out.println(arr[i]);
    }
}
