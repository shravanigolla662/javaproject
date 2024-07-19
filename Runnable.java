package anudip;

//Define a class ThreadDemo that implements the Runnable interface
class ThreadDemo implements Runnable {
	
	// Override the run() method defined in the Runnable interface
	@Override
	public void run() {
		// Print the name of the current thread
		System.out.println("Thread Name:"+Thread.currentThread().getName());
		 // Print the priority of the current thread
		System.out.println(Thread.currentThread().getPriority());
		
	}
	
	// Main class that demonstrates the usage of Runnable and Thread
	public class Runnable{
		public static void main(String[] args) {
			 // Print the name of the main thread (thread that runs main method)
			System.out.println(Thread.currentThread().getName());
			
			 // Create an instance of ThreadDemo
			ThreadDemo td=new ThreadDemo();
			
			 // Create a new Thread with td (which implements Runnable) as the target and "Demo one" as the thread name
			Thread t=new Thread(td,"Demo one");
			
			// Start the thread
			t.start();
		}

		
	}
	
}

