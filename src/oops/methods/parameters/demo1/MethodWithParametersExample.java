package oops.methods.parameters.demo1;

public class MethodWithParametersExample {

	public static void main(String[] args) {

		printCat("BOb", 8);
		printChar('A');
		printString("python");
		printString("JAVA");

	}

	private static void printCat(String name, int age) {
		Cat myCat = new Cat();
		myCat.name = name;
		myCat.age = age;
		System.out.println(myCat.name);
		System.out.println(myCat.age);
	}

	private static void printChar(char character) {

		System.out.println(character);
	}

	private static void printString(String text) {
		System.out.println(text);
	}

	/*
	 * private static void printInt() {
	 * 
	 * int number = 145; System.out.println(number); }
	 * 
	 * private static void printByte() {
	 * 
	 * byte ByteNumber = 21; System.out.println(ByteNumber);
	 * 
	 */

}
