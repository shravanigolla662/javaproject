package anudip;
//Define a class named Details to demonstrate the usage of Employees objects
public class Details {

 // Main method to create and display Employees objects
 public static void main(String[] args) {
     // Create an array to hold Employees objects
     Employees[] emp = new Employees[5];
		
     // Initialize each element of the array with Employees objects
     emp[0] = new Employees(101, "shravani", 22, 50000); // Initialize the first employee
     emp[1] = new Employees(2, "Manasa", 33, 45000);      // Initialize the second employee
     emp[2] = new Employees(3, "Anjali", 39, 60000);      // Initialize the third employee
     emp[3] = new Employees(4, "Mouni", 35, 78000);       // Initialize the fourth employee
     emp[4] = new Employees(5, "Abhi", 32, 55000);        // Initialize the fifth employee
	
     // Iterate through the array and print details of each employee
		int i;
		for(i = 0; i < 5; i++) {
			System.out.println(emp[i]);
		}
	}
}
