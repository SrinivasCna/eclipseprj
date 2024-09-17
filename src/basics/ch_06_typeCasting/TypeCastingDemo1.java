package basics.ch_06_typeCasting;

public class TypeCastingDemo1 {

	public static void main(String[] args) {
		// == >int to double
		int intNumber = 10;
		System.out.println(intNumber);

		double doubleNumber = intNumber;
		System.out.println(doubleNumber);

		// ==> double to int

		doubleNumber = 1.123456789012345;
		System.out.println(doubleNumber);

		int number = (int) doubleNumber; // or (int) 1.23456;
		System.out.println(number);

		// ==> double to float
		float floatNumber = (float) doubleNumber;
		System.out.println(floatNumber); // 1.1234568

		long longNumber = (long) doubleNumber;
		System.out.println(longNumber);

		char character = (char) doubleNumber;
		System.out.println(character);

		short shortNumber = (short) doubleNumber;
		System.out.println(shortNumber);

		byte byteNumber = (byte) doubleNumber;
		System.out.println(byteNumber);

		longNumber = 1_234_567_890_123_456L;
		intNumber = (int) longNumber;
		System.out.println(intNumber);

		String stringNumber = "20";
		// number = (int) stringNumber; // this is not allowed

		stringNumber = stringNumber + 10;
		System.out.println(stringNumber); // 2010
		System.out.println(stringNumber + 15 + 10); // 20101510
		System.out.println(stringNumber + (15 + 10)); // 201025

		int digit = Integer.parseInt(stringNumber);
		System.out.println(digit); //2010
		System.out.println(digit + 10); //2010 +10 => 2020

	}

}
