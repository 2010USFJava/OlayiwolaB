package com.revature.string;

public class FunWithStrings {

	/***String a ="dog"; same as reference as a
	 * a = a + "house";
	 * String API has utility methods
	 * 
	 * String - String pool, Immutable, thread safe, fast
	 * String Builder- No string pool- Mutable - NOT thread safe, fast
	 * String Buffer- No string pool- Mutable - thread safe, SLOW
	 * 
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "dog";
		String a = "dog";
		
		System.out.println(s.hashCode());
		System.out.println(a.hashCode());
		
		
		a = a + "house";
		System.out.println(a.hashCode());
		System.out.println(a);
		System.out.println(a.charAt(2));

		
		StringBuilder sb = new StringBuilder("Roll Tide");
		StringBuilder sb2 = new StringBuilder("Roll Tide");
		System.out.println(sb.hashCode());
		System.out.println(sb2.hashCode());
		
		sb = sb.append("w");

		System.out.println(sb.hashCode());
		System.out.println(sb);

		StringBuffer sf = new StringBuffer("Roll gide");
		StringBuffer sf2 = new StringBuffer("Roll gide");
		System.out.println(sf.hashCode());
		System.out.println(sf2.hashCode());
		
		sf = sf.append("w");

		System.out.println(sf.hashCode());
		System.out.println(sf);
		
	}

}