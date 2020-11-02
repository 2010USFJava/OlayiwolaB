package com.revature.classtypes;
/**
 * ABSTRACT
 * 		must have atleast one abstract Method have to be abstract
 * 		can have concrete method
 * Contract based - abstract methods must be oveeriden in subclass
 * cannot be instantiated
 * **/
public  abstract class Animal implements Hunt {// abstract class
	private int eyes;
	
	public abstract void breathe();
}