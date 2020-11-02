package com.revature.sett;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Set<Double> mySet = new HashSet<>();
		
		mySet.add(100.0);
		mySet.add(200.0);
		mySet.add(300.0);
		mySet.add(400.0);
		mySet.add(500.0);
		mySet.add(600.0);
		mySet.add(700.0);
		mySet.add(700.0);
		

		
		System.out.println(mySet);
		System.out.println(mySet.add(500.0));

		System.out.println(mySet.add(800.0));
		
		
		/**for (Double num:mySet) {
			//System.out.println(num);
			
		/***	if(num == mySet) {
				System.out.println(num);

				
			}
		
		}*/
		
		Set<Double> myTreeSet = new TreeSet<>();

		myTreeSet.addAll(mySet);
		
		mySet.add(null);
		//myTreeSet.add(null);//treset doest not accept null value
		
		
		System.out.println(myTreeSet);
		System.out.println(mySet);

		
		Set<String> myLinkedSet = new LinkedHashSet<>();
		myLinkedSet.add("DragonFruit");
		myLinkedSet.add("watermelon");
		myLinkedSet.add("Coconut");
		
		System.out.println(myLinkedSet);
		
	}

}