package com.revature.io;

import com.revature.beans.Persons;

public class SerialDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//IO io = new IO();
		//String a ="banana";
	//	io.writeOutputStreamContents("Actually, Lady Gaga is not a " + a);
		//System.out.println(io.readInputStreamContents());
		/***
		 * if the output.txt does not exist, it will create it
		 * if does not exist run it and then referesh the project
		 * you can also go the file explorer to see it in where your project is been stored
		 * */
		
		
		
		
		Persons p1 = new Persons("matt", 34, 275);
		Persons p2 = new Persons("chris", 21, 175);
		Persons p3 = new Persons("siera", 5, -0);
		Persons p4 = new Persons("The Huntress", 28, 160);
		
		IOWithCollections.personsList.add(p1);
		IOWithCollections.personsList.add(p2);
		IOWithCollections.personsList.add(p3);
		IOWithCollections.personsList.add(p4);
	
		//write first to a file
		//IOWithCollections.writePersonsFile();

		//secondly read to file
		//IOWithCollections.readPersonsFile();
		//print out the read file
		//System.out.println(IOWithCollections.personsList.toString());
		

	}

}
