package com.bus.driver;

import com.bus.beans.Persons;
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persons a = new Persons("Busayomi", 37, 6666);
		/**System.out.println(a);
		System.out.println(a.toString());
		
		Persons b = new Persons();
		System.out.println(b);
		
		Persons.setHomePlanet("Jupiter");
		System.out.println(a);
		System.out.println(b);
		a.setHomePlanet("venus");
		System.out.println(b);*/
		a.increaseAgeBy(1);
		System.out.println(a);
	}

}
