package hw10UseOfSuperInChildClass;

public class Daughter extends Father {
	public String birthMonth;
	public int age;

	public Daughter() {
//		super(); we can use one super()in a constructor
		super("Ibrahim", 63, 'M', false);
		super.father();
		super.fatherInfo("Ibrahim", 63, 'M', false);
		super.familyName = "Mirza";
		System.out.println("Father family name is: " + familyName);
		System.out.println("This default constractor from Daughter Class");
	}

	public Daughter(String birthMonth, int age) {
		super();
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("Daughter Birth Month: " + birthMonth + ",\nDaughter age: " + age);
	}

	public void daughter() {
//		super();  we can't call constructor of super class inside a method of child class.
		super.father();
		super.fatherInfo("Ibrahim", 63, 'M', false);
		super.familyName = "Mirza";
		System.out.println("Father family name is: " + familyName);
		System.out.println("This void type method from Daughter Class");
	}

	public void daughterInfo(String birthMonth, int age) {
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("Daughter Birth Month: " + birthMonth + ",\nDaughter age: " + age);
	}

}
