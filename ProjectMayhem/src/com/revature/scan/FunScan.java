package com.revature.scan;

import java.util.Scanner;

public class FunScan {

	public static Scanner sc = new Scanner(System.in);
	
	public static void printMe() {
		String contents;
		System.out.println("what would you like to print");
		contents=sc.nextLine();
		System.out.println(contents);
		System.out.println("what else would you like to print");
		String moreContents=sc.nextLine();
		System.out.println(moreContents);
	//	System.out.println("what number would you like to print");
		//int myNumb =sc.nextInt();
		//int myNum = Integer.parseInt(num);
		//System.out.println(myNumb+4);
		System.out.println("what next number would you like to print");
		String num =sc.nextLine();
		int myNum = Integer.parseInt(num);
		System.out.println(myNum+4);

		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMe();
	}

}
