package hw11Polymorphism;

public class Test_family {

	public static void main(String[] args) {
		System.out.println("\n--------------- sister----------");
		Sister sis = new Sister();
		sis.sister(45, 35, 18, "10", 6, 2);
		sis.sister(15, 20, 60, 85);
		sis.sister(55, 65, "25", 81);
		Sister.sister(16, 29, 31, 75, 2);
		System.out.println("\n--------------- Niece----------");
		Niece niece = new Niece();
		niece.sister(18, 25, 34, 57);
		niece.sister(11, 55, 38, "89", 23, 5);

	}

}
