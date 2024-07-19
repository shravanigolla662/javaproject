package anudip;

// parent class is created
class Employee1 {
	//declaring all the required variables
	int id;
	String name;
	int salary;
	
	// Constructor to initialize Employee1 object
	public Employee1(int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	// Method to calculate and display total salary of an employee
	void total_salary()
	{
		System.out.println("Total salary of " + name + ": $" + salary);
	}
}

//Subclass Temporary_emloyee inheriting from Employee1
class Temporary_emloyee extends Employee1
{
	int duration; //declaring the variable duration
	
	// Constructor to initialize Temporary_emloyee object
	public Temporary_emloyee(int id, String name, int salary,int duration) 
	{
		super(id, name, salary);
		this.duration = duration;
	}
	
	// Overriding the total_salary method to calculate and display total salary for temporary employees
	@Override
	void total_salary()
	{
		int totalSalary = salary * duration;
        System.out.println("Total salary of Temporary Employee " + name + ": $" + totalSalary);
		
	}
}

//Subclass permanent_employee inheriting from Employee1
class permanent_emloyee extends Employee1
{
	int bonus; //declaring the variable bonus
	
	// Constructor to initialize permanent_emloyee object
	public permanent_emloyee(int id, String name, int salary)
	{
		super(id, name, salary);
		this.bonus=bonus;
	}

	// Overriding the total_salary method to calculate and display total salary for permanent employees
    @Override
	void total_salary()
	{
		int totalSalary = salary + bonus;
        System.out.println("Total salary of Temporary Employee " + name + ": $" + totalSalary);
	}
	
}
public class Method_Over
{

	public static void main(String args[])
	{
		// Creating an object of the employee1 class 
        Employee1 emp=new Employee1(103,"abhi",45000);
        emp.total_salary();// Calling the total_salary method for the  employee1 object

        // Creating an object of the temporary_employee class 
        Temporary_emloyee temEmp=new Temporary_emloyee(101,"anjali",65000,6);
        temEmp.total_salary();// Calling the total_salary method for the temporary employee object
        
         // Creating an object of the permanent_employee class 
         permanent_emloyee permEmp = new permanent_emloyee(102,"mouni",50000);
         permEmp.total_salary();// Calling the total_salary method for the permanent employee object
        
       
 
	}
}

