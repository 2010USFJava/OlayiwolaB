package com.revature.maps;

import java.util.HashMap;
import java.util.Map;

public class DriverMaps {

	public static void main(String[] args) {
		
		
		
		/**MAPS
		 * map is a dictionary in other language
		 * Is an object that map unique to value is also known as dictionary in other languages
		 * each key has to be unique and can be mapped to only one value, cannot be mapped to duplicate values
		 * 
		 * map is an interface
		 * MAP CHILD CLASSES ARE -
		 * 				HashMap 
		 * 					Allows duplicate value not key
		 * 					allow single null key and multiple null values
		 * 					does not guarantee order
		 * 				TreeMap
		 * 					does not allow null keys but allow null values
		 * 					it sorted according the natural ordering of the keys
		 * 			LinkedHashMap
		 * 					very similar hashmap , but it maintain insertion order
		 * 
		 * 	**/
		
		Map<String,String> myMap = new HashMap<>();// string is the data type
		
		myMap.put("Apples", "A red or green thing");//add value with two defination in this map
		myMap.put("Earth", "A blue thing");
		myMap.put("Earth", "FILLED WITH WATER"); //KEY HAVE TO BE UNIQUE THIS OVERIDE THE FIRST KEY "EARTH"
		myMap.put("grapes", "A red or green thing");// value can be thesame
		
		System.out.println(myMap);
		System.out.println(myMap.get("Apples"));//get value base on the key "apples"

		
		
		Map<Key,String> specialMap = new HashMap<>();//PASSING OBJECT directly
		Key myKey = new Key("Mercury");
		
		myKey =null;
		
		specialMap.put(myKey, "My key to Mercury");
		System.out.println(specialMap.get(myKey));
		
		
		System.out.println(myMap.keySet());//to get myMAP key
		System.out.println(myMap.values());// to get myMap values in string format
		System.out.println(myMap.entrySet());//to get myMap values and key in string format
		
		for(String s:myMap.keySet()) {
			System.out.println(myMap.get(s));//to get myMAP VALUES

		}
	}

}
