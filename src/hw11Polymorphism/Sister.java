package hw11Polymorphism;
/*
 When different methods exist with the same method name but 
 with different parameters or signature, it is called method overloading.
*/

public class Sister {
	public void sister(int age1, int age2, int age3, String age4, int age5, int age6) {
		int total1 = age1 + age2 + age3 + Integer.parseInt(age4) + age5 + age6;
		System.out.println("Total age from Sister " + total1);
	}
	public int sister(int age1, int age2, int age3,int age5) {
		int total2 = age1 + age2 + age3 + age5;
		System.out.println("Total age from Sister " + total2);
		return total2;
	}
	public static int sister(int age1, int age2, int age4, int age5, int age6) {
		int total3 = age1 + age2 + age4 + age5 + age6;
		System.out.println("Total age from Sister " + total3);
		return total3;
	}
	public final void sister(int age1, int age2, String age4, int age5) {
		int total4 = age1 + age2 + Integer.parseInt(age4) + age5;
		System.out.println("Total age from Sister " + total4);
	}
	
}
		
		
	
	
	
		
