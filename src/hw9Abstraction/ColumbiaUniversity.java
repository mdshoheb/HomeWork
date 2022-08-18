package hw9Abstraction;

/*
  1.One keyword "extends" is used to inherit a regular Class.
  2.A regular class can inherit only one regular class or one abstract class by extends keyword
  3.A regular class can't inherit an Interface by extends keyword
  4.Only one inheritance is possible in a regular class
 */

public class ColumbiaUniversity extends MedicalSchool {
	public ColumbiaUniversity() {

	}

//	abstract method cannot be declared inside the Class.
//	public abstract void chemistry(); 

	public void biology() {
		System.out.println("This non abstract method from ColumbiaUniversity Class ");
	}

	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hygiene() {
		// TODO Auto-generated method stub

	}

}
