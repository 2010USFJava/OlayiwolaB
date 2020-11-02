package com.revature.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Warrior;

public class FileStuff {
	
	//setting up the name of the file "warriorFile"for both method
	public static final String warriorFile="warriorList.txt";
	
	//write method USING
	//List of type persons
	public static void writeWarriorFile(List<Warrior> wList) {
		try {
			//WE ARE ADDING OBJECT and putting a file
			//ObjectOutputStream to write object
			ObjectOutputStream objectOut = new ObjectOutputStream(new FileOutputStream(warriorFile));
			//writing to the list of WARRIOR element
			objectOut.writeObject(wList);
			objectOut.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//read method
	public static void readWarriorFile() {
		try {
			ObjectInputStream objectIn = new ObjectInputStream(new FileInputStream(warriorFile));
			//reading the object WARRIOR  and format it  arraylist and set it to "Roster.warriorList"CALLING IT FROM ROASTER
			//save them roaster, read from list
			Roster.warriorList=(ArrayList<Warrior>)objectIn.readObject();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ClassNotFoundException e){
			e.printStackTrace();
		}

	}
}
