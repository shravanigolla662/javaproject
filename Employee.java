package anudip;

public class Employee {
		int Emp_id;
		String Emp_name;
		int Emp_salary;
		//constructor with no arguments
		Employee()
		{
			System.out.println("Employee object created");
		}
		//constructor with arguments
		Employee(int id,String name,int salary)
		{
			Emp_id=id;
			Emp_name=name;
			Emp_salary=salary;
		}
		void empinfo()
		{
			System.out.println("Employee details are:\n"+"ID:"+Emp_id+"\n Name:"+Emp_name+
					"\n Salary:"+Emp_salary);
		}
		public static void main(String[] args) {
			Employee emp=new Employee();
			emp.Emp_id=101;
			emp.Emp_name="gayathri";
			emp.Emp_salary=78000;
			emp.empinfo();
			Employee emp2=new Employee(102,"akshaya",67000);
			emp2.empinfo();

	}

}
