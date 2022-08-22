package hw10Abstraction;

/*
  1.Two keywords "extends"and "implements" is used to inherit a regular Class.
  2.A regular class can inherit only one regular class or one abstract class by extends keyword
  3.A regular class can inherit an Interface by implements keyword
  4.Only one inheritance is possible in a regular class by extends keyword
  5.More than one inheritance is possible to inherit an Interface with "implements" keyword 
 */

public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool{
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

	@Override
	public void lawInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void commonRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void laboratory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void languageClub() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void emergencyRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void surgeryRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cafeteria() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void vocationalInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void classSize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playGround() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void teacher() {
		// TODO Auto-generated method stub
		
	}

}
