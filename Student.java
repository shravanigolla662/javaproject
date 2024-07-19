package anudip;

import java.io.*;
import java.util.Scanner;
//Defining the class Student
class Student
{
	//declaring the required variables for student i.e roll_no,name,phn_num,course_id,course_name
    int roll_no;
    String name;
    int phn_num;
    int course_id;
    String course_name;
    //defining the method as student details
    void StudentDetails(int roll_no,String name,int phn_num,int course_id,String course_name)
    {
    	System.out.println("student rollnumber:"+roll_no);
        System.out.println("student name:"+name);
        System.out.println("student phonenumber:"+phn_num);
        System.out.println("student couse_id:"+course_id);
        System.out.println("student course_name:"+course_name);
    }
//main class declaration
    public static void main(String args[])
    {
    	//creating the object
        Student S= new Student();
        //Entering Student details
        S.StudentDetails(101,"mouni",1234567890,502,"MCA");
        System.out.println("****************************");
        S.StudentDetails(102,"abhi",189065670,670,"MBA");
        System.out.println("****************************");
        S.StudentDetails(103,"anjali",1243457890,450,"BBA");
      }
}


