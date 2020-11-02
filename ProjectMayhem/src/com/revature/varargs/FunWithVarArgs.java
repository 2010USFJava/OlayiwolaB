package com.revature.varargs;

/**
 * method overloading
 * creating methods with the same name but different method signature
 * -exact match
 * -conversion --primitives/object casting to other types
 * ------------primitive to primitive or object to object
 * -boxing- primitive object will undergoes auto boxing/unBoxing
 * -varargs - arguments wrapped into an array
 * */

public class FunWithVarArgs {

	/*
	 * method that will  take in a variable number of argument
	 * automate and hide the process of creating and saving values into an array
	 * prior to invoking the method
	 * VALARGS MUST BE Last parameter
	 * can be of anytype*****/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	vaTest(10);
		//vaTest(10,5,7,8,9,2,4);
		//vaTest();
		
	}
	static void  vaTest(int ... v ) {//varargs must be last args, and args can be of anytype
		System.out.println("Number of args is : " +  v.length  + " contents:");
		for(int x: v) {
			System.out.println(x);
		}}
		
}
