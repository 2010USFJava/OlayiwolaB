package com.revature.generics;
/*
 * Generics
 * 	- using a type as parameter
 * write a code  that can handle different types of objects
 * use angle bracket<> to denote that something is a generic
 * allows us to ensure type safety
 * add stability and reusability to our code
 * placeholder(T,E,?, ETC) - use instead of an explicit**/
//public class Gen1 <T extends Number>{
	public class Gen1 <T>{
	//DECLARE OBJECT OF TYPE T
	T object;
	
	//pass a constructor referencing to object of type T
	Gen1(T objectParameter){
		object = objectParameter;
		
	}
	//return object
	T getObject(){
		return object;
	}
	//SHOW THE TYPE OF t
	void showType() {
		System.out.println("Type of T is : "+object.getClass().getName()); //object from the class
	}
}