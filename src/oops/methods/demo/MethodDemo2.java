package oops.methods.demo;

public class MethodDemo2 {

	public static void main(String[] args) {
		printCat();
		printChar();
		printString();
		printByte();
		printShort();
		printInt();
		printLong();
		printFloat();
		printDouble();
		printBoolean();
	}

	public static void printCat() {
		Cat myCat = new Cat();
		myCat.name = "Stella";
		myCat.age = 3;
		System.out.println(myCat.name);
		System.out.println(myCat.age);
	}

	public static void printChar() {
		char character = 'Z';
		System.out.println(character);
	}

	public static void printString() {
		String text = "java";
		System.out.println(text);
	}

	public static void printByte() {
		byte number = 127;
		System.out.println(number);
	}

	public static void printShort() {
		short number = 32767;
		System.out.println(number);
	}

	public static void printInt() {
		int number = 127;
		System.out.println(number);
	}

	public static void printLong() {
		long number = 1234567890123L;
		System.out.println(number);
	}

	public static void printFloat() {
		float number = 100.50F;
		System.out.println(number);
	}

	public static void printDouble() {
		double number = 1.1234567890;
		System.out.println(number);
	}

	public static void printBoolean() {
		boolean flag = true;
		System.out.println(flag);
	}

}

