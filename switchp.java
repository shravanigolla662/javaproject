package anudip;

/*import java.util.Scanner;
public class switchp {
	void day(int d)
	{
		switch(d) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Invalid number");
			break;
			
		
		}
			
			
	}
	public static void main(String args[])
	{
		int dayno;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Day Number:");
		dayno=sc.nextInt();
		switchp obj = new switchp();
        obj.day(dayno);
		
		
	}
	
}*/
import java.util.Scanner;
public class switchp
{
	public static void main(String args[])
	{
		int  n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Day Number:");
		n=sc.nextInt();
		switch(n) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Invalid number");
			break;
		}
		
		
	}
}