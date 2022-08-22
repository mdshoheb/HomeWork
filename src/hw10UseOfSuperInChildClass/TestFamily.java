package hw10UseOfSuperInChildClass;

public class TestFamily {

	public static void main(String[] args) {
		Daughter daughter = new Daughter();
		System.out.println("\n-----------------------------------\n");
		Daughter daughter01 = new Daughter("August", 1);
		System.out.println("\n-----------------------------------\n");
		daughter01.daughter();
		System.out.println("\n-----------------------------------\n");
		daughter01.daughterInfo("August", 1);
		System.out.println("\n-----------------------------------\n");
		Father father = new Father();
		System.out.println("\n-----------------------------------\n");
		Father father1 = new Father("Ibrahim", 63, 'M', false);
		System.out.println("\n-----------------------------------\n");
		father1.father();
		System.out.println("\n-----------------------------------\n");
		father1.fatherInfo("Ibrahim", 63, 'M', false);

	}

}
