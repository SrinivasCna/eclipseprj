package basics.ch_07_operators.ternary;

public class TernaryOperatorDemo {

	public static void main(String[] args) {
		// Ternary Operator --- ?

		System.out.println(true ? "java" : "python"); // java
		System.out.println(false ? "java" : "python"); // python

		System.out.println(true ? 5 : 10); // 5
		System.out.println(false ? 5 : 10); // 10

		String subject;
		subject = true ? "SQL" : "machine learning";
		System.out.println(subject); // SQL

		subject = false ? "SQL" : "machine learning";
		System.out.println(subject);

		char character;
		character = true ? 'Z' : 'M';
		System.out.println(character); // Z

		byte byteNumber;
		byteNumber = false ? 124 : 125;
		System.out.println(byteNumber); // 125

		short shortNumber;
		shortNumber = true ? -32 : 32;
		System.out.println(shortNumber); // -32

		int intNumber;
		intNumber = false ? 124 : 147;
		System.out.println(intNumber); // 147

		long longNumber;
		longNumber = true ? 1_234_567L : 2_564_789L; // 1_234_567
		System.out.println(longNumber); // 1234567

		float floatNumber;
		floatNumber = true ? 1.02546F : 2.15483F;
		System.out.println(floatNumber); // 1.02546

		double doubleNumber;
		doubleNumber = true ? 1.201689742210 : 2.01545154512645;
		System.out.println(doubleNumber); // 1.20168974221

		boolean isTrueOrFalse;
		isTrueOrFalse = true ? false : true;
		System.out.println(isTrueOrFalse); // false

		isTrueOrFalse = false ? false : true;
		System.out.println(isTrueOrFalse); // true

	}

}
