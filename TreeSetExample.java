package anudip;

import java.util.TreeSet;
public class TreeSetExample {
	  public static void main(String[] args) {
	        // Creating a TreeSet to store String values
	        TreeSet<String> country = new TreeSet<String>();

	        // Adding elements to the TreeSet
	        country.add("India");
	        country.add("China");
	        country.add("USA");
	        country.add("Nepal");

	        // Printing the TreeSet
	        System.out.println(country);

	        // Iterating over the TreeSet and printing each element
	        for (String s : country)
	            System.out.println(s);

	        // Adding another element to the TreeSet
	        country.add("Bhutan");
	        
	        // Printing the TreeSet after adding the new element
	        System.out.println(country);

	        // Removing an element from the TreeSet
	        country.remove("USA");

	        // Printing the TreeSet after removing the element
	        System.out.println(country);

	        // Printing the TreeSet in descending order
	        System.out.println(country.descendingSet());
	    }
}
