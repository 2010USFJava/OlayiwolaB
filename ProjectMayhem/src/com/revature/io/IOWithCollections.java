package com.revature.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Persons;

public class IOWithCollections {

	//setting up the name of the file "personsFile"for both method
	private static final String personsFile="persons.txt";
	
	//arraylist of type persons
	public static List<Persons> personsList = new ArrayList<Persons>();
	
	//write arraylist to the file 
	public static void writePersonsFile() {
		try {
			//WE ARE ADDING OBJECT and putting a file
			//ObjectOutputStream to write object
		ObjectOutputStream objectOut =new ObjectOutputStream(new FileOutputStream(personsFile));
			//writing to the arraylist of person element
		objectOut.writeObject(personsList);
			//close the write method
		objectOut.close();
	}catch (IOException e) {
		e.printStackTrace();
	}
}  
	@SuppressWarnings("unchecked")
	
	//read info into an arraylist
	public static void readPersonsFile() {
		try {
			//ObjectInputStream to read object
			ObjectInputStream objectIn =new ObjectInputStream(new FileInputStream(personsFile));
				//reading the object persons  and format it  arraylist and set it to "personsList"
			personsList=(ArrayList<Persons>)objectIn.readObject();
				//close
			objectIn.close();
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
			//the person not found catch
		}catch (ClassNotFoundException e){
			e.printStackTrace();
		}
				
	}
}
