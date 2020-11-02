package com.revature.util;

import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Warrior;
import com.revature.menu.Menu;

public class Roster {
	//it will always be called with classname because it static
	public static List<Warrior> warriorList = new ArrayList<Warrior>();//list of type warrior
	
	
	public static Warrior findWarriorByName(String inputName) {
		
		for (int i = 0; i < warriorList.size(); i++) {
			String name = warriorList.get(i).getName();//i is the index
			if(inputName.equals(name)) {
				return warriorList.get(i);
			}
		}
		
		System.out.println("warrior not found");
		Menu.startMenu();
		return null;
		
	}
}
