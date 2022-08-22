package hw10Abstraction;

public interface Hospital {
	public void emergencyRoom();
	public void surgeryRoom();
	public void cafeteria();
	
	public default void morgue() {
		System.out.println("This default method morgue from Hospital Interface");
	}
	
	public static void pharmacy() {
		System.out.println("This static method pharmacy from Hospital interface");
	}

}
