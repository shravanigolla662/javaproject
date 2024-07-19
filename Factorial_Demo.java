package anudip;

//Class representing a thread that calculates factorial using Factorial_Synchronisation
public class Factorial_Demo extends Thread {
	 // Instance variable to hold the Factorial_Synchronisation object
	Factorial_Synchronisation fse=new Factorial_Synchronisation() ;
	
	// Constructor to initialize the thread with a Factorial_Synchronisation object
	public Factorial_Demo(Factorial_Synchronisation fse) {
		super();
		this.fse = fse;
		}
	
	// Overriding run method to perform factorial calculation when thread starts
	public void run() {
		fse.factorial(6); // Calculate factorial of 6
		}
	
	// Main method to demonstrate usage of the Factorial_Demo thread
	public static void main(String[] args) {
		 // Creating an instance of Factorial_Synchronisation
		Factorial_Synchronisation fs = new Factorial_Synchronisation();

		// Creating multiple instances of Factorial_Demo threads with the same Factorial_Synchronisation object	
		Factorial_Demo sfd = new Factorial_Demo(fs);
		sfd.start(); // Starting the first thread
		
        Factorial_Demo sfd1 = new Factorial_Demo(fs);
		sfd1.start();// Starting the second thread
		
		Factorial_Demo sfd2 = new Factorial_Demo(fs);
		sfd2.start();// Starting the third thread
		}
}
