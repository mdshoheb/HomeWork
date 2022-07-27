package hw3JavaVariables;

public class AboutMe {

	public String name; // Here variable is Declared.
	public String fullName = "Md Shoheb"; // Here variable is initialized.
	public byte myAge = 30;
	public short myYearlySalary = 32500;
	public int myYearlyMortgage = 95000;
	public long myBankBalance = 500000l;
	public float myHeight = 5.11f;
	public double myGrade = 3.56677;
	public char sex = 'M';
	public boolean usCitizen = true;

	public static void main(String[] args) {
		AboutMe aboutMe = new AboutMe();
		System.out.println("My Full Name: " + aboutMe.fullName + "\nMy Sex: " + aboutMe.sex + "\nMy Age: "
				+ aboutMe.myAge + "\nBank Balance: " + aboutMe.myBankBalance + "\nMy Height: " + aboutMe.myHeight);

	}
}
