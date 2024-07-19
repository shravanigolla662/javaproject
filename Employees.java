package anudip;

//Define a class named Employees to represent information about employees
public class Employees {
 // Instance variables to store employee details
 int id;         // Employee ID
 String name;    // Employee name
 int age;        // Employee age
 int salary;     // Employee salary

 // Constructor to initialize an Employees object with provided parameters
 public Employees(int id, String name, int age, int salary) {
     super(); // Call to superclass constructor 
     this.id = id;
     this.name = name;
     this.age = age;
     this.salary = salary;
 }

 // Override the toString method to provide a string representation of the Employees object
 @Override
 public String toString() {
     return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
 }
}
