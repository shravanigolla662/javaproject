package anudip;

import java.util.Scanner;
public class Bank_Application {

	public static void main(String[] args) 
	{
		//declaring the required variables in the bank application
		int Account_balance=34540,withdraw,deposit,choice;
		
	    //user input method
		Scanner sc= new Scanner(System.in);
		
		//displaying all the required options for the user
		while(true)
		{
			System.out.println("WELCOME TO ATM");
			System.out.println("\n 1.Withdraw Money");
			System.out.println("\n 2.Deposit Money");
			System.out.println("\n 3.Check Balance");
			System.out.println("\n 4.Exit");
			System.out.println("\n Enter your choice");
			choice=sc.nextInt();
			
			//User can choose different cases according to their requirements
			switch(choice)
			{
			//Block to withdraw the amount 
			case 1:
				System.out.println("Enter amount to be withdraw:");
				withdraw=sc.nextInt();
				/*if Withdrawn amount is greater than account balance then it is insufficient 
				balance*/
				if(withdraw>Account_balance)
				{
					System.out.println("Insufficient Amount");
				}
				/*if withdrawn amount is lesser than account balance then amount necessary 
				action to be performed*/
				else
				{
					Account_balance=Account_balance-withdraw;
					System.out.println("Amount withdraw "+ withdraw);
					System.out.println("Do you want to print a receipt? \n1. Yes, \n2. No");
                    int receiptChoice = sc.nextInt();
                    if (receiptChoice == 1) 
                    {
                    	System.out.println("Printing receipt...");
                        // receipt message
                        System.out.println("Date: 2024-05-15");
                        System.out.println("Amount withdrawn: " + withdraw);
                        System.out.println("Remaining balance: " + Account_balance);
				     }
                    // Ask if the user wants to display remaining balance or exit
                    System.out.println("1. Display remaining balance");
                    System.out.println("2. Exit");
                    int remainingBalanceChoice = sc.nextInt();
                    if (remainingBalanceChoice == 1) 
                    {
                        System.out.println("Your remaining balance: " + Account_balance);
                    } else
                    {
                        System.out.println("Thank you for using Demo ATM.....");
                        return;
                    }
                }
                break;
                //Enter amount to be deposit
			 case 2:
                 System.out.println("Enter amount to deposit: ");
                 int depositAmount = sc.nextInt();
                 Account_balance += depositAmount;
                 System.out.println("Amount deposited: " + depositAmount);
                 break;
              //It displays the account balance
             case 3:
                 System.out.println("Your account balance: " +  Account_balance);
                 break;
             //Message after completing  the ATM application 
             case 4:
                 System.out.println("Thank you for using Demo ATM.... :-)");
                 
             //If user enters invalid option it will display this message
             default:
                 System.out.println("Invalid choice! Please enter a valid option.");	
					
			}
			
		}

	}

}
