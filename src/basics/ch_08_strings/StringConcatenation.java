package basics.ch_08_strings;

public class StringConcatenation {

	public static void main(String[] args) {
		// joining or combining characters /string is
		// referred as Concatenation

		// join String + String => String
		System.out.println("sun" + "shine"); // sunshine

		// joining String +int => String
		System.out.println("java" + 10); // java10

		// 14=> "14"
		String number = 14 + "";
		System.out.println(number); // "14" /it is a String

		String subject = "java";
		String text = subject + " " + 10;
		System.out.println(text); // java 10

		// concat()
		System.out.println("java".concat("programming")); // javaprogramming
		System.out.println(subject.concat("programming")); // javaprogramming
		System.out.println("java".concat(" programming")); // java programming
		System.out.println(subject.concat(" " + "programming")); // java programming

		text = "programming";
		String course = subject + " : " + text;
		System.out.println(course); // java : programming
		System.out.println(subject.concat(" " + text)); // java programming
	}

}
