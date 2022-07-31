package hw5Q3Constructor;

public class Student {
	public String stName;
	public int stId;
	public char sex;
	public float grade;
	public boolean isProgrammer;

	public Student() {
		System.out.println("This is from default Constructor of Student class.");
	}

	public Student(String stName, int stId, char sex, float grade, boolean isProgrammer) {
		super();
		this.stName = stName;
		this.stId = stId;
		this.sex = sex;
		this.grade = grade;
		this.isProgrammer = isProgrammer;
		System.out.println("Student Nmae: " + stName + ", ID: " + stId + ", Sex: " + sex + ", Grade: " + grade
				+ ", Java Programmer: " + isProgrammer);

	}

}
