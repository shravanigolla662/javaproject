package anudip;

import java.util.Scanner;

//preparing a parent class Transport
class Transport
{
	String transport_name; //declaring the variable for name of the transport
	
	// Constructor with parameter to set the transport name
	 public Transport(String name)
	 {
	        transport_name = name;
	 }
	 
	// Default constructor
	 public Transport()
	 {
		// Print a message indicating the object creation
		 System.out.println("Transport object created");
	 }

	// Method to display the type of transportation
	public void displayType()
	 {
		    // Print the transport name
	        System.out.println("Type of Transportation:" + transport_name);
	 }
	
	
	
}
class Road_Transport extends Transport {
	String vechicle_name; //declaring the variable as vechicle name
	
	// Method to display the name of the vehicle
	public void display_vechiclename()
	{
		// Print the vehicle name
		System.out.println("Type of vechicle:" + vechicle_name);
	}
	
		
	}
class Four_wheeler extends Road_Transport{
	int no_of_wheels; // Number of wheels of the four-wheeler
	String fuel; // Type of fuel used
	int seat_capacity; // Maximum number of seats in the vehicle
	String Engine_quantity; // Engine capacity in litres
	
	// Method to display the characteristics of the vehicle
	public void display_characters()
	{
		System.out.println("Features of vechicle is:" +"\nNumber Of Wheels:"+no_of_wheels+
				"\nFuel Type:"+fuel+"\nSeat Capacity:"+seat_capacity+"\nEngine Quantity:"+Engine_quantity);
	}
}
	
public class Multi_level_inheritance{
	
	public static void main(String[] args)
	{
		Four_wheeler fw=new Four_wheeler();// Create a Four_wheeler object
		fw.no_of_wheels=4; // Set the number of wheels
		fw.fuel="diseal"; // Set the type of fuel
		fw.seat_capacity=4;  // Set the seat capacity
		fw.Engine_quantity="4litres"; // Set the engine quantity
		fw.transport_name="road transport"; // Set the transport name
		fw.displayType(); // Display the type of transportation
		fw.vechicle_name="car"; // Set the vehicle name
		fw.display_vechiclename(); // Display the vehicle name
		fw.display_characters(); // Display the vehicle characteristics
	}
	
}	                