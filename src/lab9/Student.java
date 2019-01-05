package lab9;

import java.util.Date;
import java.util.Vector;
import java.util.concurrent.ThreadLocalRandom;

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

class Student {
	private static final String[] LASTNAMES = { "Goetsch", "Risinger", "Hemsley", "Desjardin", "Corpuz", "Babineau",
			"Eilers", "Critelli", "Mascarenas", "Albaugh", "Tichelour", "Gram", "Eslinger", "Keesee", "Pion", "Bortle",
			"Dick", "Mantle", "Heckel", "Dollar" };

	int idNumber;
	String lastName;
	EyeColor eyeColor;
	boolean isOK = true;
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

	public static int randomValue(int min, int max) {
		return ThreadLocalRandom.current().nextInt(min, max);
	}

	public static void main(String[] args) {
		Vector studentVector = new Vector();
		System.out.println("Filling Vector with:");
		for (int i = 0; i < 20; i++) {
			Student st = new Student(randomValue(0, 200), LASTNAMES[randomValue(0, 20)], EyeColor.brown,
					randomValue(80, 260));
			System.out.print(i + "Student #" + st.idNumber + " name: " + st.lastName + ", Eye Color: " + st.eyeColor + " height: " + st.height + " isOK: ");
			System.out.println(st.isOK);

			if (st.isOK)
				studentVector.add(st);
		}
		// System.out.println(LASTNAMES[randomValue(0,20)]);
		// System.out.println(LASTNAMES[randomValue(0,20)]);
		// System.out.println(LASTNAMES[randomValue(0,20)]);
		// System.out.println();
		for (int i = 0; i < studentVector.size(); i++) {
			Student st = (Student) studentVector.get(i);
			System.out.println("Student #" + st.idNumber + " name: " + st.lastName + " height: " + st.height);
		}
		// System.out.println((String) ((Student)
		// studentVector.get(randomValue(0, 20))).lastName);
	}
}
