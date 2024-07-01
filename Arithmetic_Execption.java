package anudip;

public class Arithmetic_Execption {

	public static void main(String[] args) {
		int a,b,c;
		a=10;
		b=0;
		System.out.println("Start of the program");
		try {
			c=a/b;
			System.out.println("c="+c);
			//System.out.println("End of the program");
			
			/*int arr[]= {1,2,3,4,5};
			System.out.print(arr[5]);*/
		}catch(ArithmeticException ae) {
			System.out.println("Arithmetic Execption Caught");
		}
		try {
			int arr[]= {1,2,3,4,5};
			System.out.print(arr[5]);
			}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("Array Execption Caught");
		}
		finally {
			System.out.println("End of the program");
		}

	}

}
