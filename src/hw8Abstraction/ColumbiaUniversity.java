package hw8Abstraction;

public class ColumbiaUniversity {
	public ColumbiaUniversity() {
    }
//	abstract method cannot be declared inside the Class.
//	because regular class only contain implemented method.
//	public abstract void chemistry(); 
    public void biology() {
		System.out.println("This non abstract method from ColumbiaUniversity Class ");
	}

}
