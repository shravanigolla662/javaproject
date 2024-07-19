package anudip;

public class Factorial_Synchronisation {

		// This method calculates the factorial of a given number and prints the result.It is synchronized
		synchronized  void factorial(int num) {
			int fact = 1; // Initialize factorial variable

			// Calculate factorial using a for loop
			for (int i = 1; i <= num; i++) {
				fact = fact * i;
				System.out.println(i);
			}

			try {
				// Thread to sleep for 500 milliseconds
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			// Print the calculated factorial
			System.out.println("Factorial: " + fact);
		}
}

