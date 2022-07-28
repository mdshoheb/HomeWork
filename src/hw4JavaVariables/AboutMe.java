package hw4JavaVariables;

public class AboutMe {

	// Variable Declared
	public String name;
	public byte myAge;
	public short myYearlyCarPayment;
	public int myYearlyIncome;
	public long myBankBalance;
	public float myHeight;
	public double myWeight;
	public char sex;
	public boolean usCitizen;

	// Constructor Declared
	public AboutMe() {
		System.out.println("This is all about us :");
	}

	// Method Implemented
	public void aboutMe() {
		System.out.println("My name is : " + name + "\nMy age is : " + myAge + "\nMy yearly car payment: "
				+ myYearlyCarPayment + "\nMy yearly income : " + myYearlyIncome + "\nMy bank balance : " + myBankBalance
				+ "\nMy height : " + myHeight + "\nMy weight : " + myWeight + "\nMy gender : " + sex
				+ "\nMy citizenship status : " + usCitizen);
	}
}
