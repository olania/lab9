package lab9;

import java.util.Date;

enum EyeColor {
	blue, black, brown;
	public static EyeColor fromString(String s) {
		s = s.toLowerCase().trim();
		switch (s) {
		case "blue":
			return blue;
		case "black":
			return black;
		case "brown":
			return brown;
		default:
			return blue;

		}

	}
}

class DefaultValues {
	static int idNumber = 999999;
	static String lastName = "Student";
	static EyeColor eyeColor = EyeColor.blue;
	static int height = 180;
}
private static final String[] LASTNAMES = {
Elza Goetsch
Lani Risinger
Vernie Hemsley
Soraya Desjardin
Suzy Corpuz
Jewel Babineau
Luann Eilers
Rex Critelli
Brunilda Mascarenas
Carey Albaugh
Norah Tichenor
Rosalina Gram
Andre Eslinger
Asia Keesee
Kathlyn Pion
Nancee Bortle
Oralia Dick
Quinn Mantle
Garrett Heckel
Wendell Dollar
};

class Student {
	int idNumber;
	String lastName;
	EyeColor eyeColor;
	boolean isOK;
	int height;

	public Student(int i, String lastName, EyeColor ecolor, int height) {
		this.idNumber = i;
		if (lastName != "")
			this.lastName = lastName;
		else {
			isOK = false;
			this.lastName = DefaultValues.lastName;
		}
		this.eyeColor = ecolor;
		if (height >= 100 && height <= 220)
			this.height = height;
		else {
			isOK = false;
			this.height = DefaultValues.height;
		}

	}

	public static void main(String[] args) {
		Student st = new Student(1, "Ivanov", EyeColor.brown, 130);
		System.out.println(st.idNumber);
	}
}
