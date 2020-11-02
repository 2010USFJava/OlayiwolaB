package com.revature.menu;

import java.util.Scanner;

public class Menu {
	
 static Scanner scan = new Scanner(System.in);
	
	
	public static void startMenu() {
		System.out.println("Welcome to the Kitchen!");
		System.out.println("Please enter your choice:");
		System.out.println("\t[d]o your want create a new Recipe");
		System.out.println("\t[c]ook!");
		System.out.println("\t[q]uit");
		
		String choice =scan.nextLine(); 
		
		switch(choice.toLowerCase()) {
		case "d":
			newRecipe();
			break;
		case "c":
			cook();
			break;
		case "q":
			System.out.println("BYE");
			break;
		default:
			System.out.println("Chef Try Again");
			startMenu();//Return to startmenu if choice not match
			break;
	}
	
}


	public static void cook() {
		// TODO Auto-generated method stub
		
	}


	public static void newRecipe() {
	
				System.out.println("Create a new recipe!");
				
				System.out.println("Please enter the name your Vegetable");
				String name=scan.nextLine();
				
				System.out.println("Please color of your vegetable");
				String color=scan.nextLine();
				
				System.out.println("Please spicy of your vegetable");
				String spicy=scan.nextLine();

				System.out.println("Please weight of the vegetable");
				int weight =Integer.parseInt(scan.nextLine());
				
			
				System.out.println("would you like to  suggest more recipe? (y/n)");
				
				
				String choice=scan.nextLine();
				
				if(choice.equalsIgnoreCase("y")) {
					newRecipe();
					
				}else if(choice.equalsIgnoreCase("n")) {
					startMenu();
					
				}else {
					System.out.println("Main menu to choose correct option");
					startMenu();

				}
				}
	}

