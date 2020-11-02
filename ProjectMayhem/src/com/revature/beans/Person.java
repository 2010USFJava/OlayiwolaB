package com.revature.beans;

import java.io.Serializable;

import com.revature.classtypes.Mammal;
import com.revature.exceptions.IncreasedByNegativeNumberException;

/*
 * java is objected oriented language
 * objects have states and behaviour
 * class template of an object
 * makes instances by utilizing classes "constructor

 *pillar of OOP 
 *Polymorphysm
 *	-many forms
 * 	-method overriding and overloading
 * 		-overiding - same name and param diff behavior (between 2 classess)
 * 		-overloading - same name , diff params(same class)
 * 		- multiple - "is-a" relationships
 * 		-covariance
 * 
 * Encapsulation
 *		-wrapping and protecting data fields, preventing outside manipulation
 *		-concealling the internal state of the object
 *		such as using getters AND setters 
 *Abstraction
 *		-Hidding implementation details, exposing only functionality
 *		- what it does, not how it does it
 *Inheritance
 *		-programming language allows for hierarchy of objects
 *		- no multiple inheritance but with interfaces
 **/
public class Person extends Mammal implements Serializable {
	
	private static final long serialVersionUID = -126184544885282773L;

	/**BEANS
	 * 		Means representing some entity
	 * MAKE UP-
	 * 		private field
	 * 		no args constructor
	 * 		constructor with fields
	 * 		getters and setters
	 * 		override to string(), equals(), hashcode()
	 * 
	 * 
	 * 
	 * members of class
	 * instance variable - property of a specific object
	 * static variable property that belong tthe class aka to every object of that type
	 * instance method - behavior to the specific object
	 * sttatic method - behavior related to the entire class
	 * 
	 * Contructor
	 * 	- instantiate the class using the NEW keyword
	 * 
	 * */
	private String name;
	private int age;
	private int weight;
	static String homePlanet="earth";

	// no args constructor
	public Person() {
		//super(); constructor to the parent class reffering to the object
	}
	// constructor with field
	public Person(String name, int age, int weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	//getters and setters || mutator and accessor
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public static String getHomePlanet() {
		return homePlanet;
	}
	public static void setHomePlanet(String homePlanet) {
		Person.homePlanet = homePlanet;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", weight=" + weight + ",  homePlanet=" + homePlanet + "]";
	}

	public void increaseAgeBy(int x) throws IncreasedByNegativeNumberException {
		if(x<=0) {
			throw new IncreasedByNegativeNumberException();
		}
		this.age+=x;
	}
	@Override
	public void findPrey() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void breathe() {
		// TODO Auto-generated method stub
		
	}
}
