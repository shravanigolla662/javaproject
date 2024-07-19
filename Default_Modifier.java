package anudip;

class Default_Modifier {
	// Method to define an employee and print their ID and name
	void Employee()
	{
		// Local variables for employee ID and name
		int Emp_id=101;  // Employee ID
		String name="Akshaya"; // Employee Name
		
		// Printing employee ID and name
		System.out.println("Employee ID:" + Emp_id);
		System.out.println("Employee Name:" +name);
	}
	    //main method
		public static void main(String args[])
		{
			// Creating an instance of the Default_Modifier class
			Default_Modifier dm=new Default_Modifier();
			
			// Calling the Employee method to define and print employee details
			dm.Employee();
			
		}
		
	}
