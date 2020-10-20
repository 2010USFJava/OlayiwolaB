package com.revature.bean1;

import com.revature.bean2.Bean2;

public class Bean1 {
	int vin;
	String model;
	String make;
	String color;
	Bean2 bean2;
	
	
	public Bean1() {
	}


	public Bean1(int vin, String model, String make, String color, Bean2 bean2) {
		this.vin = vin;
		this.model = model;
		this.make = make;
		this.color = color;
		this.bean2 = bean2;
	}


	public int getVin() {
		return vin;
	}


	public void setVin(int vin) {
		this.vin = vin;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public Bean2 getBean2() {
		return bean2;
	}


	public void setBean2(Bean2 bean2) {
		this.bean2 = bean2;
	}


	@Override
	public String toString() {
		return "Bean1 [vin=" + vin + ", model=" + model + ", make=" + make + ", color=" + color + ", bean2=" + bean2
				+ "]";
	}
	
}
