package com.revature.drive;

import com.revature.beans.Vegetable;
import com.revature.menu.Menu;
import com.revature.util.FileObj;

public class Driver {
	
	static {
		FileObj.readVegetableFile();//before we do any operation, run this
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vegetable recipe = new Vegetable("Spinach", "Green", "Habenero Pepper", 20);
		
		//System.out.println(Kitchen.vegetableList.toString());
		
		Menu.newRecipe();
	}

}
