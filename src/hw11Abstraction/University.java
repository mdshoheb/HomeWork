package hw11Abstraction;

/*
 1.One keyword "extends" is used to inherit an Interface.
 2.An Interface can not inherit a regular class or an abstract class by extends or implements keywords.
 3.An Interface can not inherit another interface by implements keyword.
 3.An Interface can inherit more than one Interface by extends keyword.
 */

public interface University extends College, Hospital {
//	Interfaces cannot have constructors,
//	because Interface can contain only abstract method and non-abstract method(default,static)
//	public University() {
//	}

	public void classSize();
	public void playGround();
	public void teacher();
	public default void gymnasium() {
		System.out.println("This default method gymnasium from University Interface");
	}
	public static void library() {
		System.out.println("This static method library from University Interface");
	}
	
}




