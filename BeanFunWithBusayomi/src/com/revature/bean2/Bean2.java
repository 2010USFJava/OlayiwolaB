package com.revature.bean2;

public class Bean2 {
	public String name;
	public String month;
	

	
	public String getName() {
		return name;
	}
	public Bean2(String name, String month) {
		this.name=name;
		this.month=month;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public Bean2() {
		this.name="V12 WOO";
	}
	
	@Override
	public String toString() {
		return "Bean2 [name=" + name + ", month=" + month + "]";
	}
	
}
