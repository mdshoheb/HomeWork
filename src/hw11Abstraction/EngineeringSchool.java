package hw11Abstraction;

public abstract class EngineeringSchool extends NYUniversity {
	public abstract void mechanicalLab();
    public void computerLab() {
		System.out.println("This non-abstract method from EngineeringSchool Class");
	}

}