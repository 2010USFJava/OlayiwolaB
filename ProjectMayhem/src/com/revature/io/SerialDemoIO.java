package com.revature.io;

public class SerialDemoIO {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IO io = new IO();
		String a ="banana";
	//	io.writeOutputStreamContents("Actually, Lady Gaga is not a " + a);
		System.out.println(io.readInputStreamContents());
}
}