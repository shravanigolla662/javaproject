package anudip;

import java.util.HashMap;
//Class Declaration
public class Hash_Map {
  //Main Method
	public static void main(String[] args) {
		// Creating a HashMap to store country names with their keys
		HashMap<String , Integer> country = new HashMap<String, Integer>();

		// Adding key-value pairs to the HashMap
		country.put("India",1);
		country.put("USA",2);
		country.put("UK",3);
		country.put("Australia",4);
		country.put("Japan",5);

		// Printing the entire HashMap
		System.out.println(country);

		// Printing the entry set of the HashMap
		System.out.println(country.entrySet());

		// Printing the set of keys in the HashMap
		System.out.println(country.keySet());

		// Removing the entry with key 4 from the HashMap and printing the removed value
		System.out.println(country.remove(4));

		// Printing the HashMap after removing the entry with key 4
		System.out.println(country);
		// adding key 4 with value pair
		country.putIfAbsent("Bangladesh",4);
		// Printing the HashMap after adding key 4
		System.out.println(country);

	}

}