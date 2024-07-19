package anudip;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		        // Create an ArrayList of integers
		        ArrayList<Integer> alist = new ArrayList<Integer>();

		        // Inserting integer values into ArrayList
		        alist.add(10);
		        alist.add(20);
		        alist.add(30);
		        alist.add(40);
		        alist.add(50);

		        // Retrieving values from ArrayList
		        System.out.println("Values in ArrayList:");
		        for (int i = 0; i <alist.size(); i++) {
		            System.out.println("Index " + i + ": " + alist.get(i));
		        }

		        // Get index of a specific value
		        System.out.println("\nIndex of specific value is: " + alist.indexOf(30));

		        // Get the last index of a specific value
		   
		        System.out.println("Last index of is: " + alist.lastIndexOf(50));
		        
		        Iterator itr=alist.iterator();
		        while(itr.hasNext()) {
		        	System.out.println(itr.next());
		        }


	}

}
