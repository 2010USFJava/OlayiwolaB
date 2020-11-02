package com.revature.driver;

import com.revature.beans.Person;
import com.revature.exceptions.IncreasedByNegativeNumberException;
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person a = new Person("Busayomi", 37, 6666);
		System.out.println(a);
		/**System.out.println(a.toString());
		
		Person b = new Person();
		System.out.println(b);
		
		Person.setHomePlanet("Jupiter");
		System.out.println(a);
		System.out.println(b);
		a.setHomePlanet("venus");
		System.out.println(b);*/
		try {
		a.increaseAgeBy(20);
		System.out.println(a);
		}catch(IncreasedByNegativeNumberException e) {
			e.printStackTrace();
		}
		try {
			a.increaseAgeBy(-20);
			System.out.println(a);
			}catch(IncreasedByNegativeNumberException e) {
				e.printStackTrace();
			}
	}

}