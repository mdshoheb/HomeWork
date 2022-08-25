package hw8Abstraction;

public abstract class MedicalSchool {
	public MedicalSchool() {
	}
		
	public abstract void anatomyLab();
	public void biochemistryLab() {
		System.out.println("This non-abstract method from MedicalSchool Class");
	}
	
}


