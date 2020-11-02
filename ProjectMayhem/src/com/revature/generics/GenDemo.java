package com.revature.generics;

public class GenDemo {

	public static void main(String[] args) {
		
		// create a Gen1 reference for integer
		Gen1<Integer> i;
		i= new Gen1<Integer>(88);// constructor giving the value
		//show the type of i
		i.showType();
		//get the type of i
		int v =i.getObject();
		System.out.println("Value: "+ v);
		
		//type string
		Gen1<String> s = new Gen1<String>("Generics Test");
		s.showType();
		String str = s.getObject();
		System.out.println("Value: "+ str);

	}

}