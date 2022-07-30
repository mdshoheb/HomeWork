package hw05Q2Constructor;

public class Computer {
	public String compBrand;
	public String compModel;
	public String compOperatingSystem;
	public int compPrice;
	public char compGrade;
	public boolean madeInUsa;

	public Computer() {
		System.out.println("This is from default Constuctor of Computer class.");
	}

	public Computer(String compBrand, String compModel, String compOperatingSystem, int compPrice, char compGrade,
			boolean madeInUsa) {
		this.compBrand = compBrand;
		this.compModel = compModel;
		this.compOperatingSystem = compOperatingSystem;
		this.compPrice = compPrice;
		this.compGrade = compGrade;
		this.madeInUsa = madeInUsa;
		System.out.println("My brand: " + compBrand + ", Model: " + compModel + ", Operating System: " + compOperatingSystem
						+ ", Price: " + compPrice + ", Grade: " + compGrade + ", And Made in USA? Ans: " + madeInUsa);

	}

	public Computer(String compBrand, String compOperatingSystem, String compModel, char compGrade, int compPrice,
			boolean madeInUsa) {
		this.compBrand = compBrand;
		this.compOperatingSystem = compOperatingSystem;
		this.compModel = compModel;
		this.compGrade = compGrade;
		this.compPrice = compPrice;
		this.madeInUsa = madeInUsa;
		System.out.println("My brand: " + compBrand + ", Model: " + compModel + ", Operating System: " + compOperatingSystem
						+ ", Price: " + compPrice + ", Grade: " + compGrade + ", And Made in USA? Ans: " + madeInUsa);

	}

}
