package hw11Polymorphism;
/*
 When different methods exist with the same method name 
 with same parameters or signature but with different syntax or logic, 
 it is called method overriding.
 */

public class Niece extends Sister {
	@Override
	public void sister(int age1, int age2, int age3, String age4, int age5, int age6) {
		int total1 = age1 * 5+ age2 + age3 + Integer.parseInt(age4) + age5 + age6;
		System.out.println("Total age from Sister " + total1);
	}
	@Override
	public int sister(int age1, int age2, int age3, int age5) {
		int total2 = age1 + age2 + age3/2 + age5 + 5;
		System.out.println("Total age from Sister " + total2);
		return total2;
	}
	// The method sister can't override or implemented
	// because static method is a local member method of a class
	/*
	@Override
	public static int sister(int age1, int age2, int age4, int age5, int age6) {
		int total3 = age1 + age2 + age4 + age5 + age6;
		System.out.println("Total age from Sister " + total3);
		return total3;
	}
	 */
	//Final type method cannot be Overridden
	//because of Final keyword, it prevent us to override inside final method.
	/*
	@Override
	public final void sister(int age1, int age2, String age4, int age5) {
		int total4 = age1 + age2 + Integer.parseInt(age4) + age5;
		System.out.println("Total age from Sister " + total4);
	}
	 */
	
}

