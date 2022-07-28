package hw4JavaVariables;

public class AboutMeTest {
	
	public static void main(String[] args) {
		AboutMe shoheb = new AboutMe();// Constructor Initialized
		shoheb.name = "Md Shoheb";
		shoheb.myAge = 30;
		shoheb.myYearlyCarPayment = 32000;// Variables Initialized
		shoheb.myYearlyIncome = 25000;
		shoheb.myBankBalance = 1000000l;
		shoheb.myHeight = 5.11f;
		shoheb.myWeight = 72.234;
		shoheb.sex = 'M';
		shoheb.usCitizen = true;
		shoheb.aboutMe();// Method Initialized

		System.out.println("\n-----------------------------------\n");
		AboutMe alex = new AboutMe();// Constructor Initialized
		alex.name = "Alex Fergi";
		alex.myAge = 77;
		alex.myYearlyCarPayment = 32000;
		alex.myYearlyIncome = 2000000;
		alex.myBankBalance = 3000020000l;
		alex.myHeight = 5.8f;
		alex.myWeight = 108.234;
		alex.sex = 'M';
		alex.usCitizen = false;
		alex.aboutMe();// Method Initialized

	}
}
