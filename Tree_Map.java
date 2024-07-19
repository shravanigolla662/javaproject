package anudip;


import java.util.TreeMap;

public class Tree_Map {

	public static void main(String[] args) {
	// Create a TreeMap with Integer keys and String values
	 TreeMap<Integer,String> tmap= new TreeMap<Integer,String>();
	 
	 // Adding key-value pairs to the TreeMap
	 tmap.put(22, "Shravani");
	 tmap.put(32, "Abhishek");
	 tmap.put(33, "Mounika");
	 tmap.put(40, "Venu");
	 tmap.put(39, "Anjali");
	 tmap.put(35, "Manasa");
	 tmap.put(27, "Jagan");
	 tmap.put(130, "Sai Dheeraj");
	 
	 // Print the TreeMap (it will print in ascending order of keys)
	 System.out.println("TreeMap contents: "+tmap);

	 // Print the size of the TreeMap (number of key-value mappings)
	 System.out.println("Size of TreeMap: " +tmap.size());
	 

     // Print the first (smallest) key in the TreeMap
     System.out.println("First key in TreeMap: " + tmap.firstKey());
	
     // Get the keys in descending order using descendingKeySet() method
     System.out.println("Keys in descending order: "+tmap.descendingKeySet());
     
	}
	
}