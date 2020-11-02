package com.revature.driver;

import com.revature.beans.Vacation;
import com.revature.enums.Day;


public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vacation myVacation = new Vacation("Swimming", 2, Day.FRIDAY, Day.SATURDAY);
		System.out.print(myVacation);
	}

}
