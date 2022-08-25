package hw11Abstraction;

public class TestInstitute {

	public static void main(String[] args) {
		System.out.println("\n--------------------- Regular class ColumbiaUniversity ------------------------\n");
		ColumbiaUniversity columbiaUniversity = new ColumbiaUniversity();
		columbiaUniversity.biology();
		ColumbiaUniversity.computerScience();// Static method called by ColumbiaUniversity class
		columbiaUniversity.anatomyLab();
		columbiaUniversity.hygiene();
		columbiaUniversity.lawInfo();
		columbiaUniversity.commonRoom();
		columbiaUniversity.laboratory();
		columbiaUniversity.languageClub();
		columbiaUniversity.emergencyRoom();
		columbiaUniversity.surgeryRoom();
		columbiaUniversity.cafeteria();
		columbiaUniversity.vocationalInfo();
		columbiaUniversity.classSize();
		columbiaUniversity.playGround();
		columbiaUniversity.teacher();
		columbiaUniversity.biochemistryLab();
		ColumbiaUniversity.microbiology();//// Static method called by ColumbiaUniversity class
		columbiaUniversity.caring();
		columbiaUniversity.maths();
		columbiaUniversity.mechanicalLab();
		columbiaUniversity.computerLab();
		columbiaUniversity.anthropology();
		columbiaUniversity.aeronauticalInfo();
		columbiaUniversity.lawInfo();
		columbiaUniversity.gymnasium();
//     columbiaUniversity.library(); ----static method of Interface can't be call by object of a regular class
		columbiaUniversity.dorm();
//		columbiaUniversity.studyRoom();---static method of Interface can't be call by object of a regular class
		columbiaUniversity.morgue();
//		columbiaUniversity.pharmacy();------static method of Interface can't be call by object of a regular class
		
		System.out.println("\n--------------------- Interface University ------------------------\n");
		University university = new ColumbiaUniversity();
		university.classSize();
		university.playGround();
		university.teacher();
		university.gymnasium();
		University.library();// no need of an object, Interface/class can directly call static methods,
		university.commonRoom();
		university.laboratory();
		university.languageClub();
		university.dorm();
		College.studyRoom();
		university.emergencyRoom();
		university.surgeryRoom();
		university.cafeteria();
		university.morgue();
		Hospital.pharmacy();
		
		System.out.println("\n--------------------- Abstract class ElectricCar ------------------------\n");
		
		
		
		
		
		
	}

}
