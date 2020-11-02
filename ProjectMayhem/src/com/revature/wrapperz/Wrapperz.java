package com.revature.wrapperz;

public class Wrapperz {
/**
 * All wraper classes inherit from number class can be used when we need object
 * utility method, constant
 * 
 * Character char
 * Boolean boolean
 * Integer int
 * Byte byte
 * Long long
 * Float float
 * Double double
 * Short = short
 * 
 * AUTO BOXING
 * -boxing - implicit conversion from primitive to wraper class
 * -unboxing - implicit conversion from wrapper to primitive 

 * */
	
	
	
	static int myInt =3;
	static Integer myInteger =5;
	static Double myDouble = 45.93;
	
	public static int addEmup(int a, int b) {
		return a+b;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int result =addEmup(myInt, myInteger);
		int result =addEmup(myInt, myDouble.intValue());//by adding utility int method
		System.out.println(result);
		
		//maximum value we can have for int
		Integer i =0;
		i = i.MAX_VALUE;
		System.out.println(i);
		
	}

}
