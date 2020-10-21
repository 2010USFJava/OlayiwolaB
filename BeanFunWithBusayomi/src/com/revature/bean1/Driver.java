package com.revature.bean1;
import com.revature.bean2.Bean2;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bean1 bean1 = new Bean1(1234,"4runner","toyota","blueen",new Bean2());
		String bean2Name;
		bean2Name = bean1.bean2.name;//change the visiblity to public(name) in bean2 class
		 System.out.println(bean2Name);
		 
		 
		 Bean2 mybean2 = new Bean2("volve", "december");// put value directly to the object
		 Bean1 mybean1 = new Bean1(5678,"sunfire","hunda","pink",mybean2);
		 String  bean2Name2;
		 bean2Name2 =mybean1.bean2.name;
		 System.out.println(bean2Name2);

			
		 Bean1 b1 = new Bean1();
		 System.out.println(b1);
		 System.out.println(b1.toString());
			
		 Bean2 ba =new Bean2("volvo", "December");
		 Bean1 b333 = new Bean1(5678,"jaguar","hunda","pink",ba);
		 System.out.println(b333.toString());

	}

}
