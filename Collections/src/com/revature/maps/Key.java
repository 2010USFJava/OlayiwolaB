package com.revature.maps;

public class Key {

	 String name;

	public Key() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Key(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Key [name=" + name + "]";
	}
}
