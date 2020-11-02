package com.revature.service;

import com.revature.beans.Warrior;
import com.revature.util.FileStuff;
import com.revature.util.Roster;

public class Fight {
	
			public void fightTime(Warrior a, Warrior b) {
				
				//a is going to hit b
				//set variable to get 
				int firstAttackPower = a.getAttackPower();
				int secondHp = b.getHp();
				
				//and to set
				b.setHp(secondHp - firstAttackPower);
				FileStuff.writeWarriorFile(Roster.warriorList);// we write to the roster arraylist at desame time

				
			}
}
