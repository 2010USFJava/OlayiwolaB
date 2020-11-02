package com.revature.challenge;


public class Bag {

	private int tagNumber;
	private int price;
	private String colour;
	private String shape;
	private String name;
	private String size;
	
	public Bag() {
		this(666);
	}
	

	public Bag(int tagNumber) {
		this(tagNumber, 200);
	}


	public Bag(int tagNumber, int price) {
		
		this(tagNumber, price, "blue");

	}


	public Bag(int tagNumber, int price, String colour) {
		
		this(tagNumber, price, colour, "round");

	}


	public Bag(int tagNumber, int price, String colour, String shape) {
		
		this(tagNumber, price, colour, shape, "Gucci");

	}


	public Bag(int tagNumber, int price, String colour, String shape, String name) {
		
		this(tagNumber, price, colour, shape,name, "Medium");

	}


	public Bag(int tagNumber, int price, String colour, String shape, String name, String size) {
		this.tagNumber = tagNumber;
		this.price = price;
		this.colour = colour;
		this.shape = shape;
		this.name = name;
		this.size = size;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Bag b2 = new Bag(555,350,"red","oval","fossil","large");
		Bag b = new Bag();
		System.out.println(b);

	}


	@Override
	public String toString() {
		return "Bag [tagNumber=" + tagNumber + ", price=" + price + ", colour=" + colour + ", shape=" + shape
				+ ", name=" + name + ", size=" + size + "]";
	}

}
