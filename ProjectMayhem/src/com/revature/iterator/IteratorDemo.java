package com.revature.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create an arraylist
		List<String> a1= new ArrayList<String>();
		//create and add elements
		a1.add("A");
		a1.add("B");
		a1.add("C");
		a1.add("D");
		a1.add("E");
		a1.add("F");
		a1.add("G");
		
		//USE ITERATOR to display content of a1
		System.out.println("Original content of a1:");
		Iterator<String> itr =a1.iterator();
		while(itr.hasNext()) {
			String element =itr.next();
			System.out.print(element + " ");
		}
			//LIST ITERATOR
			//modifify obect being itrate
			ListIterator<String> litr =a1.listIterator();
			while(litr.hasNext()) {
				String bettyWhite =litr.next();
				litr.set(bettyWhite + "+");//SET every element in bettywhit to print
				
		}
			System.out.println("\nmodified content of a1:");
			itr =a1.iterator();
			while(itr.hasNext()) {
				String element =itr.next();
				System.out.print(element + " ");
				
	}
			//display the modified list backward
			System.out.println("\nmodified list backwards:");
			while(litr.hasPrevious()) {
				String element =litr.previous();
				System.out.print(element + " ");


			}

	}}
