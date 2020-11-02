package com.revature.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Vegetable;


public class FileObj {


	public static final String vegetableFile="vegetableList.txt";
	
	public static void writeVegetableFile(List<Vegetable> vList) {
		try {
			
			ObjectOutputStream objectOut = new ObjectOutputStream(new FileOutputStream(vegetableFile));
			objectOut.writeObject(vList);
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
	@SuppressWarnings("unchecked")
	public static void readVegetableFile() {
		try {
			ObjectInputStream objectIn = new ObjectInputStream(new FileInputStream(vegetableFile));
			
			Kitchen.vegetableList=(ArrayList<Vegetable>)objectIn.readObject();
			objectIn.close();

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


