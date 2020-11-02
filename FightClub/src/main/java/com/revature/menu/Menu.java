package com.revature.menu;

import java.util.Scanner;

import com.revature.beans.Warrior;
import com.revature.service.Fight;
import com.revature.util.LogThis;
import com.revature.util.Roster;

public class Menu {
	static Scanner scan = new Scanner(System.in);
	
	
	//startmenu method consist of print statment that will be given to the users of choices available for use
	public static void startMenu() {
		System.out.println("Welcome to the game!");
		System.out.println("Please enter your choice:");
		System.out.println("\t[c]reate a new warrrior");
		System.out.println("\t[f]ight!");
		System.out.println("\t[q]uit the game");
		
		//create variable to grab the input
		String choice =scan.nextLine();
		
		//this switch case will based on chioce the users made////can be lowercase or uppercase letter
		
		switch(choice.toLowerCase()) {
			case "c":
				createMenu();
				break;
			case "f":
				fightMenu();
				break;
			case "q":
				System.out.println("BYE");
				break;
			default:
				System.out.println("Try again NERD");
				startMenu();//Return to startmenu if choice not match
				break;
		}
		
	}
	//method for createmenu
	public static void createMenu() {
		System.out.println("Create a new warrior!");
		System.out.println("Please enter a name for your warrior");
		//to take what the user typed in
		String warriorName=scan.nextLine();
		System.out.println("Please enter your warrior's HP");
		int warriorHP =Integer.parseInt(scan.nextLine());
		System.out.println("Please enter your warrior's attack power");
		int warriorAttackPower =Integer.parseInt(scan.nextLine());
		
		//to feed info in to constructor
		Warrior a= new Warrior(warriorName,warriorHP, warriorAttackPower);
		LogThis.LogIt("info", a.getName() + " was created!");// to log this
		System.out.println(Roster.warriorList.toString());
		
		//incase the need to creat warrior back to back
		System.out.println("would you like to  make a new warrior? (y/n)");
		
		//to pick there choice a created another variable for choice
		String choice=scan.nextLine();
		
		//if statement for the option choice
		if(choice.equalsIgnoreCase("y")) {
			//it will return back to create menu method
			createMenu();
		}else if(choice.equalsIgnoreCase("n")) {
			//it will return back to start menu method
			startMenu();
		}else {
			//incase choice not matches y/n
			System.out.println("Too bad, you are going back to main menu");
			startMenu();

		}
		}

		
	public static void fightMenu() {
		System.out.println("Please enter a name for your first warrior");
		String first=scan.nextLine();
		//find warrior by name //method found in "ROSTER CLASS"
		Warrior a = Roster.findWarriorByName(first);
		
		System.out.println("Please enter a name for your second warrior");
		String second =scan.nextLine();
		//find warrior by name
		Warrior b = Roster.findWarriorByName(second);
		
		System.out.println("LET THE BATTLE BEGIN!!!");
		
		Fight fight = new Fight();//CREATE AN INSTANCE FOR THE FIGHT
		
		fight.fightTime(a, b);//PASSING fight TO THE METHOD PASSING WARRIOR a and b
		
		LogThis.LogIt("info", a.getName() + " just punched "+b.getName()
		+" and it costs them " + a.getAttackPower()+ " points of damage");//to log the fight RESULT
		
		System.out.println(b.getName()+ " 's HP is now " + b.getHp());

		
	}
	}
