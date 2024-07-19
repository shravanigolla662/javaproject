package anudip;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {
	// Main Method
		public static void main(String[] args) {
			// Creating a LinkedHashSet to store String values
			LinkedHashSet<String> abc = new LinkedHashSet<String>();

			// Adding elements to the LinkedHashSet
			abc.add("Manasa");
			abc.add("Mounika");
			abc.add("Shravani");
			abc.add("Pravalika");
			abc.add(null); // Adding a null element

			// Iterating over the LinkedHashSet and printing each element
			for (String s : abc)
				System.out.println(s);

			// Removing the null element from the LinkedHashSet
			abc.remove(null);

			// Printing the LinkedHashSet 
			System.out.println(abc);

			// Printing the size of the LinkedHashSet
			System.out.println(abc.size());
		}
}
