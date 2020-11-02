package com.revature.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IO {

	
	//WRITE METHOD
	public void writeOutputStreamContents(String contents) {
		OutputStream os = null;//setup output stream and set it to null
		File file = new File("output.txt");//file we are writing to, it will generate itself automatically
		
		try {
			os= new FileOutputStream(file, true);// false will overide, true will append to the end
			
			os.write(contents.getBytes());//get content in byte
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(os!=null) {
			try {
				os.close();
				}catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
	//READ METHOD
	public String readInputStreamContents() {
		InputStream is = null;
		File file = new File("input.txt");
		StringBuilder s = new StringBuilder();//not stuck the string pull
		
		try {
			is = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int b=0;
		try {
			while((b=is.read())!=-1) {//-1 means end of the file
				char c =(char)b;//read the file in char and stored to string builder
				s.append(c);
			}
			
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(is!=null) {
			try {
				is.close();
				}catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		return s.toString();
	}
}
