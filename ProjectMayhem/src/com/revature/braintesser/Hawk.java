package com.revature.braintesser;

class Bird{
	{ System.out.println("b1"); }
	Bird(){
		System.out.println("b2");
	}
	static {
		System.out.println("b3");
	}
}

	class Raptor extends Bird{
		static	{ System.out.println("r1");	}
		
		Raptor(){
			System.out.println("r2");
		}
		{System.out.println("r3");
		
		}
		static {System.out.println("r3");
		}
	}

public class Hawk extends Raptor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("init");
		new Hawk();
		System.out.println("hawk");
	}
public Hawk() {
	}
}

