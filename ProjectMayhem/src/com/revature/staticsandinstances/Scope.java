package com.revature.staticsandinstances;

import com.revature.classtypes.Mammal;

public class Scope extends Mammal {
	int baby;
	int doll;
	
	public Scope() {
		System.out.println("I am no-args");

	}
	
	 public Scope(int baby,int doll) {
			System.out.println("I am param block");

		 this.baby=baby;
		 this.doll=doll;
	 }
	 //static
	static {
		System.out.println("I am static block");
	}
	//instance
	 {
			System.out.println("I am instance block");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scope s1 = new Scope();

		Scope s = new Scope(4,5);
	}
	
	@Override
	public String toString() {
		return "Scope [baby=" + baby + ", doll=" + doll + "]";
	}

	@Override
	public void findPrey() {
		System.out.println("I go to whole foods and buy sweet potatoes!");
		
	}

	@Override
	public void breathe() {
		System.out.println(" I breathe fresh air from the city!");

}
}