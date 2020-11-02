package com.revature.tryclasswork;


public class MethodOperationOrder {
	
	static int myInt =3;
	static int myInt2 =3;
	static Integer myInteger =5;
	static Integer myInteger2 =5;
	static Double myDouble = 40.93;
	
	public static int overload(int a, int b, int c, int d) {//
		return a+b+c+d;
	}
	public static int overload(int a, int b, int c) {//
		return a+b+c;
	}
	
	public static int  overload(int ... v ) {//varargs must be last args, and args can be of anytype
		int g=0;
		for(int x: v) {
			g+=x;//System.out.println(x);
		}return g;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result1 =overload(myInt,myInt, myInt, myInt);//exact match
		int result2 =overload(myInt,myInt2, myInteger, myInteger2);//wrapper form W to P
		int result3=overload(myInt, myInteger2, myInt2, myDouble.intValue());//by adding utility int method "conversion"
		int result4 =overload(myInt, myInteger2, myInt2);//wrapper form W to P
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);

		
		System.out.println(overload(10,6,7));
	
		
	}
	
	
	}
	


