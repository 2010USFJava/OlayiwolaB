package com.revature.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ListinArraylist {
	/**LIST
	 * 		List is an interface 
	 *		 like all interface, it does not have a constructor
	 *		It can not be instantiated directly, it can be borrowed from child class
	 *
	 *		arraylist is dynamic we dont need to plan ahead for the size*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//List<String> stringList ; declared
		
		List<String> stringList = new ArrayList<>();//arraylist is dynamic we dont need to plan ahead for the size
		stringList.add("Hi Lady");					//keep track of insertion order
		stringList.add("Hi baby");					//print is easy  in arraylist than array "we dont need to loop"
		stringList.add(0,"The stars");				//how to push to the index you want	
		stringList.add(2, "Hi baby");
		stringList.add(1, "Hi abby");
		System.out.println(stringList);
		System.out.println(stringList.get(3));

	}

}