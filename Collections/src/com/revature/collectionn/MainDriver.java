package com.revature.collectionn;

public class MainDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] arrayString; // declaration
		
		//String[] arrayString = {"hi","hello","baby","girl"};// array literal
		
		//String[] arrayString= new String [3];// declaring and instantiating array
		
		String[] arrayString; 
		arrayString= new String [3];
		arrayString[0] = "Hi there";
		arrayString[1] = "Hi baby";
		arrayString[2] = "Hi girl";
		System.out.println(arrayString[0]);// to print array string
		System.out.println("arrayString");// to print array string literal
		System.out.println(arrayString);// it will print memory location number
		
		/**arrayString= new String [10];// it will print null 10times 
		because array can not be resized you will have to create new values for size 10 array*/
		
		
		for(String x: arrayString) {
			System.out.println(x);
		}
		
		
		
			
	}

}