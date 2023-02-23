/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project1;
import java.util.Scanner;//importing scanner package
import java.util.ArrayList;//inmporting Arraylist package




class Check{//class containing all methods
    /*variables and declarations*/
    double depositAmount;
    double withdrawAmount;
    double balance = 0.0;
    ArrayList<Double> balanceArray = new ArrayList<>();
//end of variables and declarations
	void selection(){ //selection method
		String option = null; //option variable and declaration
		System.out.println("*****************************************");
		System.out.println("Welcome to CheckBook Application.");
		System.out.println("*****************************************\n");
		Scanner scan1 = new Scanner(System.in);//scanner declaration for user string input
		Scanner scan2 = new Scanner(System.in); //scanner declaration for user number input
		do{
			System.out.println("1. To deposit, Enter 'deposit'\n2. To withdraw, Enter 'withdraw'");
			System.out.println("Enter 'exit' to Terminate.\n");
			option = scan1.nextLine().toLowerCase(); //input for string
			if(option.equals("deposit") || option.equals("withdraw") || option.equals("exit")){
				switch(option){ //switch statement
				case"deposit": //case for deposit method
					System.out.println("Enter deposit amount:");
					depositAmount = scan2.nextDouble();
					System.out.println("");
					deposit();
					balanceArray.add(balance);
					break;
				case"withdraw": //case for withdraw method
					System.out.println("Enter withdraw amount:");
					withdrawAmount = scan2.nextDouble();
					System.out.println("");
					withdraw();
					balanceArray.add(balance);
					break;
				case"exit": // case for exit method
					break;
				}   //end of switch case
			}
			else{
				System.out.println("Invalid Input! Please Try Again.\n\n");
			}
		}while(!"exit".equals(option));// end of do-while loop
		
		for(int i = 0; i < balanceArray.size(); i++){ //for loop for arraylist
		System.out.println("Balance: " + balanceArray.get(i));
		}
	}
	
	void deposit(){ //deposit method 
		if(depositAmount > 0){
			balance += depositAmount;
		}
		else{
			System.out.println("You cannot deposit less than 0!");
		}
	}//end of deposit method
	
	void withdraw(){ //withdrawal method
		if(withdrawAmount <= balance && withdrawAmount != 0){
			balance -= withdrawAmount;
		}else{
			System.out.println("Insuffient funds!");
		}
	}//end of withdrawal method
	
}//end of class Check
/**
 *
 * @author Hp
 */
public class checkbook {
    public static void main(String[] args){ //main method
        Check obj1 = new Check(); 
        obj1.selection();
    } //end of main method
}


