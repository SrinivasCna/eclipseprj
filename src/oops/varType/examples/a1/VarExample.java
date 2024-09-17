package oops.varType.examples.a1;

public class VarExample {

	public static void main(String[] args) {
		// byte
		var byteNumber = 127;
		System.out.println(byteNumber);

		// short
		var shortNumber = 32767;
		System.out.println(shortNumber);

		// int
		var intNumber = 100;
		System.out.println(intNumber);

		// long
		var longNumber = 1_234_567_890_123L;
		System.out.println(longNumber);

		// double
		var doubleNumber = 1.90;
		System.out.println(doubleNumber);

		// char
		var character = 'a';
		System.out.println(character);

		// String
		var text = "kaushik K R";
		System.out.println(text);

		// Cat
		var myCat = new Cat("Zoro", 1);
		System.out.println(myCat.getName() + " " + myCat.getAge());

		printCat(new Cat("Luna", 2));
		// System.out.println(new Cat("Luna", 2));

	} // end of main method()

	public static void printCat(Cat cat) {
		System.out.println(cat.getName() + "  " + cat.getAge());
	}

}
