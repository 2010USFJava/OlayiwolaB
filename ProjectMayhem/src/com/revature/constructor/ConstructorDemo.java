package com.revature.constructor;

public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
	}

}
class A{
	A(){
		System.out.println("Inside A's Constructor");
	}
}

class B extends A{
	B(){
		System.out.println("Inside B's Constructor");
	}
}
class  C extends B{
	C(){
		System.out.println("Inside C's Constructor");
	}
}