package com.revature.classtypes;

import com.revature.staticsandinstances.Scope;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Puma p = new Puma();
		System.out.println(p);

		Animal p1 = new Puma();
		System.out.println(p1);
		
		Animal p2 = new Scope();
		System.out.println(p2);


	}

}
