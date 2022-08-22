package hw9Abstraction;

/*
  1.one keyword "extends" is used to inherit an Abstract Class.
  2.An abstract class can inherit other abstract class or regular class by extends keyword
  3.An abstract class can't inherit an Interface by extends keyword
  4.Only one inheritance is possible in an Abstract class
 */

public abstract class MedicalSchool extends NursingSchool {
	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("This non-abstract method from MedicalSchool Class");

	}

	public MedicalSchool() {

	}

	
}
