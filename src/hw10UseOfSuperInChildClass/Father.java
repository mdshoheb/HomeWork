package hw10UseOfSuperInChildClass;

public class Father {
	public String name;
	public int age;
	public char sex;
	public boolean usCitizen;
	public String familyName;

	public Father() {
		System.out.println("This default constractor from Father Class");
	}

	public Father(String name, int age, char sex, boolean usCitizen) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("Father's Name: " + name + ",\nFather's age: " + age + ",\nFather's sex: " + sex
				+ ",\nFather's citizenship: " + usCitizen);
	}

	public void father() {
		System.out.println("This void type method from Father class");

	}

	public void fatherInfo(String name, int age, char sex, boolean usCitizen) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("Father's Name: " + name + ",\nFather's age: " + age + ",\nFather's sex: " + sex
				+ ",\nFather's citizenship: " + usCitizen);
	}

}
