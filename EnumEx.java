package anudip;

//Define an enumeration named Department to represent different departments in a company
enum Department {
 Accounts, // Department for accounting tasks
 Devops,   // Department for development operations
 Testing,  // Department for software testing
 HR        // Department for human resources management
}

//Main class EnumEx to demonstrate the usage of the Department enumeration
public class EnumEx {
 public static void main(String args[]) {
     // Declare and initialize two Department variables
     Department d = Department.Testing; // Initialize d with Testing department
     Department d1 = Department.HR;      // Initialize d1 with HR department
     
     // Print the values of d and d1
     System.out.println(d);   // Output: Testing
     System.out.println(d1);  // Output: HR
     
     // Compare the ordinal values of d and d1 (ordinal values indicate the position of an enum constant in its declaration, starting from 0)
     System.out.println(d.compareTo(d1)); // Output: -2 (Testing has a lower ordinal value than HR)
     
     // Check if d and d1 are equal
     System.out.println(d.equals(d1));    // Output: false (Testing and HR are different departments)
 }
}