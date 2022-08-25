package hw11Abstraction;

/*
  1.Two keywords "extends"and "implements" is used to inherit a regular Class.
  2.A regular class can inherit only one regular class or one abstract class by extends keyword
  3.A regular class can inherit an Interface by implements keyword
  4.Only one inheritance is possible in a regular class by extends keyword
  5.More than one inheritance is possible to inherit an Interface with "implements" keyword 
*/

public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool {
	public ColumbiaUniversity() {
	}

//	abstract method cannot be declared inside the Class.
//	because regular class can only contain implemented method.
//	public abstract void chemistry(); 
	public void biology() {
		System.out.println("This non abstract method from ColumbiaUniversity Class ");
	}
	public static void computerScience() {
		System.out.println("This static method from ColumbiaUniversity Class");
	}
//	Default methods are allowed only in interfaces.
//	public default void civiEng() {
//	}

	@Override
	public void anatomyLab() {
		System.out.println("anatomy method from MedicalSchool abstract class");
	}

	@Override
	public void hygiene() {
		System.out.println("hygiene method from NursingSchool abstract class");
	}

	@Override
	public void lawInfo() {
		System.out.println("lawSchool method from LawSchool Inerface");
    }

	@Override
	public void commonRoom() {
		System.out.println("commonRoom method from College Interface");
	}

	@Override
	public void laboratory() {
		System.out.println("laboratory method from College Interface");
	}

	@Override
	public void languageClub() {
		System.out.println("languageClub method from College Interface");
	}

	@Override
	public void emergencyRoom() {
		System.out.println("emergencyRoom method from Hospital Interface");
	}

	@Override
	public void surgeryRoom() {
		System.out.println("surgeryRoom method from Hospital Interface");
	}
	@Override
	public void cafeteria() {
		System.out.println("cafeteria method from Hospital Interface");
	}
	@Override
	public void vocationalInfo() {
		System.out.println("vocationalInfo method from VocationalSchool Interface");
	}
	@Override
	public void classSize() {
		System.out.println("classSize method from University Interface");
	}
	@Override
	public void playGround() {
		System.out.println("playGround method from University Interface");
	}
	@Override
	public void teacher() {
		System.out.println("teacher method from University Interface");
	}
}
		










