package anudip;

public class Student1 {
    int rollNo;  // default variable to store Roll number
    public String name;  // Public variable to store name
   
    
    // Constructor to initialize instance variables
    public Student1() {
        this.rollNo = 101;  // Initializing Roll number to a default value
    }
    
    // Method to display student information
    void info() {
        System.out.println("STUDENT ROLLNUMBER: " + rollNo);
    }
    
    // Getter method to retrieve the name of the Student
    public String getName() {
        return this.name;
    }
    
    // Setter method to set the name of the Student
    public void setName(String name) {
        this.name = name;  // Setting name to the provided value
    }

    public static void main(String args[]) {
        Student1 s = new Student1();  // Creating an instance of Student1
        s.info();  // Displaying student information
        s.setName("Shravani");  // Setting student name
        System.out.println("STUDENT NAME: " + s.getName());  // Displaying student name
        
    }
}
