package hw11Abstraction;

/*
  1.Two keywords "extends" and "implements" is used to inherit in an Abstract Class.
  2.An abstract class can inherit other abstract class or regular class by extends keyword
  3.An abstract class can inherit an Interface by implements keyword
  4.Only one inheritance is possible in Abstract Class with "extends"(Abstract and Regular class)keyword.
  5.More than one inheritance is possible to inherit an Interface with "implements" keyword
 */

public abstract class MedicalSchool extends NursingSchool implements LawSchool {
	public MedicalSchool() {
	}

	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("This non-abstract method from MedicalSchool Class");
	}
    public static void microbiology() {
		System.out.println("This static type method from Medical School Abstract class");
	}
//  Default methods are allowed only in interfaces.  
//  public default void pathology() {
//    }

}
