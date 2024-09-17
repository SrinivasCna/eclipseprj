package oops.methods.returnDatatype.demo;

public class MethodWithReturnDatatypeExample {

	public static void main(String[] args) {
		// String text = printString();
		String text = getString();
		System.out.println(text);
		System.out.println(text.toUpperCase());

		char character = getChar();
		System.out.println(character);
		int i = getInt();
		System.out.println(i);
		string();

	}

	public static void printString() {
		String text = "java";
		System.out.println(text);
	}

	public static String getString() {
		String text = "java";
		return text;
	}

	public static char getChar() {
		char character = 'B';
		return character;

	}

	public static int getInt() {
		int i = 12;
		return i;
	}

	public static void string() {
		String s = "java";
		System.out.println(s);
	}

}
