package hw11Abstraction;

public interface College {
    public void commonRoom();
    public void laboratory();
    public void languageClub();
    public default void dorm() {
    	System.out.println("This default method dorm from College Interface");
    }
    public static void studyRoom() {
    	System.out.println("This static method StudyRoom from College Interface");
    }
}
    
    
    
    
