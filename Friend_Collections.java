package anudip;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class Friend_Collections {
	public static void main(String args[]) {
		// Create an ArrayList to store Friends objects
		List<Friends> list=new ArrayList<Friends>();
		
		// Adding Friends objects to the list
		list.add(new Friends(101,"Abhi","MCA"));
		list.add(new Friends(109,"Mouni","MBA"));
		list.add(new Friends(105,"Anjali","BSC"));
		list.add(new Friends(106,"Manasa","Bcom"));
		list.add(new Friends(104,"SaiDheeraj","Btech"));
		
		// Creating a new Friends object
		Friends f=new Friends(106,"jagan","BE");
		list.add(f); //Adding the new Friends object to the list
		
		 // Printing the list before sorting
		System.out.println("\nBefore Sorting :");
		for(Friends f1:list)
			System.out.println(f1);   // Uses overridden toString() method of Friends
		
		// Sorting the list using Collections.sort() which uses compareTo() method in Friends class
		Collections.sort(list);
		
		// Printing the list after sorting
		System.out.println("\nAfter Sorting according to Alphabetical Order:");
		for(Friends f1:list)
			System.out.println(f1);  // Uses overridden toString() method of Friends
		
	}
}
