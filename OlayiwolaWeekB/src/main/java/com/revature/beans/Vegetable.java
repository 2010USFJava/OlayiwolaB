package com.revature.beans;

import java.io.Serializable;

import com.revature.util.FileObj;
import com.revature.util.Kitchen;
import com.revature.util.LogThis;

public class Vegetable  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4341980511227403186L;
	private String name;
	private String color;
	private String spicy;
	private int weight;
	
	public Vegetable() {
		super();
		Kitchen.vegetableList.add(this);
		FileObj.writeVegetableFile(Kitchen.vegetableList);
	}

	public Vegetable(String name, String color, String spicy, int weight) {
		super();
		this.name = name;
		this.color = color;
		this.spicy = spicy;
		this.weight = weight;
		Kitchen.vegetableList.add(this);
		FileObj.writeVegetableFile(Kitchen.vegetableList);
		LogThis.LogIt("info", "A new Recipe of, " + this.name +", is now available in my Kitchen");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSpicy() {
		return spicy;
	}

	public void setSpicy(String spicy) {
		this.spicy = spicy;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Vegetable [name=" + name + ", color=" + color + ", spicy=" + spicy + ", weight=" + weight + "]";
	}
}
