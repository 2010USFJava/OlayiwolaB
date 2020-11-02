package com.revature.menu;

import java.util.Scanner;

public class Menu {
static Scanner scan = new Scanner(System.in);
	
	
	//startmenu method consist of print statment that will be given to the users of choices available for use
	public static void startMenu() {
		System.out.println("Welcome to the BankApp!");
		System.out.println("Please enter your choice:");
		System.out.println("\t[c]reate a new Account");
		System.out.println("\t[l]ogin to Your Account!");
		System.out.println("\t[a]dmin Login");
		System.out.println("\t[e]mployee Login");
		System.out.println("\t[q]uite");
		
		//create variable to grab the input
		String choice =scan.nextLine();
		
		//this switch case will based on chioce the users made////can be lowercase or uppercase letter
		
		switch(choice.toLowerCase()) {
			case "c":
				createNewAccount();
				break;
			case "l":
				loginToAccount();
				break;
			case "a":
				adminlogin();
				break;
			case "e":
				employeelogin();
				break;
			case "q":
				System.out.println("BYE");
				break;
			default:
				System.out.println("Try again");
				startMenu();//Return to startmenu if choice not match
				break;
		}
		
	}


	private static void employeelogin() {
		// TODO Auto-generated method stub
		
	}


	private static void adminlogin() {
		// TODO Auto-generated method stub
		
	}


	private static void loginToAccount() {
		// TODO Auto-generated method stub
		System.out.println("Please enter your Address : ");
		String userName=scan.nextLine();
		System.out.println("Please enter your Password : ");
		String password=scan.nextLine();
	}


	private static void createNewAccount() {
		System.out.println("Create a new Account!");
		System.out.println("Please enter your First name : ");
		//to take what the user typed in
		String firstName=scan.nextLine();
		System.out.println("Please enter your Last name : ");
		System.out.println("Please enter your Address : ");
		String address=scan.nextLine();
		String lastName=scan.nextLine();
		System.out.println("Please enter your Username : ");
		String username=scan.nextLine();
		System.out.println("Please enter your Password : ");
		String password=scan.nextLine();
		System.out.println("Please enter your Driver License : ");
		String driverLicense=scan.nextLine();
		
		System.out.println("Thanks for Registering");
		startMenu();
		
	}
}
