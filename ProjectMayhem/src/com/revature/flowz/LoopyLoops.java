package com.revature.flowz;

public class LoopyLoops {

	/**
	 * if statement
	 * for decision making
	 * provides multiple paths of execution
	 * 
	 * if (condition){
	 * what to do if is true
	 * }else if(condition) {
		what to do
	}else {
	 * what to do if is false
	 * 
	 * 
	 * SWITCH CASES
	 * provides multiple pa"ths of execution based on
	 *  some value the "switch is based on  integer numeric, a string,
	 *  char, a boolean, enum
	 *  
	 *  FOR LOOP
	 * }*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ifMethod(3,8);
		//whatColor("green");
		forLoopFunness(10);
		
		//int[] myArray ={12,15,46,87,92,0,0,5,78};
		//forEachFun(myArray);

		//doWhileLoop(3);
	}
	public static void ifMethod(int a, int b) {
		if(a>b) {
			System.out.println("This is true!");
		}else if(a==6) {
			System.out.println("Roll Tide!!");
		}else if(b==8) {
			System.out.println("go Team!!");
		}else {
			System.out.println("This is false!!");
		}

	}

	public static void whatColor(String color) {
		switch(color) {
		case "green":
			System.out.println("you picked green!!");
			break;
		case "red":
			System.out.println("you picked red!!");
			break;
		case "blue":
			System.out.println("you picked blue!!");
			break;
		case "purple":
			System.out.println("you picked purple!!");
			break;
		default:
			System.out.println("you are dumb!!");
		}
	}
	
	
	public static void forLoopFunness(int p) {
		for(int i = 0; i <p; i++) {
			if(i==6) {
				//break;
				continue;
			}

			System.out.println("counter is at : " + i);
			

	}
		System.out.println("outside for loop");

			//System.out.println("checkin i....");
	}
	/**
	 * Enchanced for loop aka for each
	 * for(x: <array or collection>)(do thing)
	 * is good for moving through collections, arrays and other iterables
	 * more cpu efficient
	 * no issues with index out of bounds- not a size dependent
	 * good for access elements in one collection
	 * bad for adding and removing*/
public static void forEachFun(int [] a) {
	for(int i:a) {
		System.out.println(i+5);
		}
	/**for(int i = 0; i <a; i++) {
		System.out.println(a[i]+5);
	}*/
	
	}
/**
 * WhileLoop
 * while(condition)
 * {_<do something>}*/
public static void whileLoop(int i) {
	while(i<10) {
		//while(i++i<10) {
		System.out.println("Roll Tide in the while loop");
	++i;
	}
}
/**
 * D0WhileLoop
 * do{<do something>
 * while(condition)
 * }*/
public static void doWhileLoop(int i) {
	do {
		System.out.println("DoWhileLoop " + i);
		i++;
	}
	while(i<10) ;
		
	}
}
	

