package com.revature.driver;

import com.revature.beans.Warrior;
import com.revature.menu.Menu;
import com.revature.util.FileStuff;
import com.revature.util.Roster;

public class Driver {
	
	static {
		FileStuff.readWarriorFile();//before we do any operation, run this
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//FileStuff.readWarriorFile();
		
		/***NOTE "warrior mikey" is stored in the heap we can not access it when commented out
		but this object element"("mikey", 200,4)" can be access because it saved in the  
		next element in arraylist not the reference "mikey"
		----i commented the new warrior object out purposely to read to the file written*/
	/***	
		//Warrior mikey = new Warrior("mikey", 200,4);//creating new warrior object
		//Warrior steven = new Warrior("steven", 200,4);
		
		//created after log4j add to the project 
		Warrior mikey = new Warrior("Jimbo", 200,4);
		Warrior steven = new Warrior("Sir Cranston", 200,4);
		
		System.out.println(Roster.warriorList.toString());
		
		//System.out.println(Roster.warriorList.get(0).toString());// to get the index object save to the arraylist
*/
		
			Menu.startMenu();
	}

}
