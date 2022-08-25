package hw11Abstraction;

public class RockefellerUniversity extends EngineeringSchool implements AeronauticalSchool{
	public void maths() {
		System.out.println("This non abstract method from RockefellerUniversity Class ");
	}
	@Override
	public void mechanicalLab() {
		System.out.println("mechanicalLab method from EngineeringSchool abstract class");
	}
	@Override
	public void aeronauticalInfo() {
		System.out.println("aeronauticalInfo method from AeronauticalSchool");
	}
}

		

		

