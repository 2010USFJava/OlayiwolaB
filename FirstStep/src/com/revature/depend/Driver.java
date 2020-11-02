package com.revature.depend;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car(1234,"4runner","toyota","blueen",new Engine());
		 String engineName;
		 engineName = car.engine.name;
		 System.out.println(engineName);
		 
		 
		 Engine myEngine = new Engine("Hemi Deluxe");
		 Car car1 = new Car(5678,"sunfire","hunda","pink",myEngine);
		 String engineName1;
		 engineName1 = car1.engine.name;
		 System.out.println(engineName1);
		 
		
	}

}
