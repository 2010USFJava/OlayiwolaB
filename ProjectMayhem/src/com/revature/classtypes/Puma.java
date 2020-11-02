package com.revature.classtypes;

public class Puma extends Mammal {
	private boolean isCapableOfMurderingPeople;
	@Override
	public void breathe() {
		System.out.println("i breathe through my nose");		
	}
	public Puma() {
		
	}
	public Puma(boolean isCapableOfMurderingPeople) {
		this.isCapableOfMurderingPeople =isCapableOfMurderingPeople;
	}
	public void findPrey() {
		System.out.println("i stalk things in forest");
	}
	@Override
	public String toString() {
		return "Puma [isCapableOfMurderingPeople=" + isCapableOfMurderingPeople + "]";
	}
}
