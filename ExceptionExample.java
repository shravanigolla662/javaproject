package anudip;

import java.util.TreeSet;

public class ExceptionExample {

    public static void main(String args[]) {
        int arr[] = { 10, 20, 30 };

        // First try block to handle ArrayIndexOutOfBoundsException
        try {
            // Accessing elements beyond array length to provoke ArrayIndexOutOfBoundsException
            for (int i = 0; i <= 3; i++) {
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException ae) {
            // Catch block for ArrayIndexOutOfBoundsException
            System.out.println("Array Index Out of Bounds Exception Caught");
        }

        // Second try block to handle NullPointerException
        try {
            TreeSet<Integer> t = new TreeSet<Integer>();
            t.add(null); // Trying to add null to a TreeSet, which will throw NullPointerException
        } catch (NullPointerException e) {
            // Catch block for NullPointerException
            System.out.println("NullPointerException Caught: TreeSet does not allow null elements");
        } catch (Exception e) {
            // General catch block to handle any other exceptions
            System.out.println(e);
        } finally {
            // Finally block always executes, regardless of whether an exception occurred or not
            System.out.println("Finally");
        }
    }
}
