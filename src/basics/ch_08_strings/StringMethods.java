package basics.ch_08_strings;

public class StringMethods {

	public static void main(String[] args) {
		// String subject="java";
		String subject = new String("JavA");
		System.out.println(subject);

		String text;
		// toUpperCase()
		// converts stings to upper case letters
		// returns a string converted to Uppercase
		// text = "java".toUpperCase();
		text = subject.toUpperCase();
		System.out.println(subject); // java //because strings are immutable
		System.out.println(text); // JAVA

		// toLowerCase()
		// converts stings to lower case letters
		// returns a string converted to lowercase
		text = subject.toLowerCase();
		System.out.println(text); // java

		boolean isTrueOrFalse;
		// contains("value")
		// check whether a string contains a sequence of characters
		// returns true or false
		isTrueOrFalse = subject.contains("j");
		System.out.println(isTrueOrFalse); // false

		// equals("string")
		// compares two strings
		// returns true if the strings are equal, and false if not equal
		isTrueOrFalse = "JavA".equals("java");
		System.out.println(isTrueOrFalse); // false

		isTrueOrFalse = "java".equals("java");
		System.out.println(isTrueOrFalse); // true

		// equalsIgnoreCase
		// compares two strings ignoring case considerations
		// returns true if the strings are equal, and false if not
		isTrueOrFalse = "SQL".equalsIgnoreCase("sql");
		System.out.println(isTrueOrFalse); // true

		// replaceAll("oldText", "newText")
		// replaces each substring of the string that matches the given
		// regular expression with the given replacement
		// returns the resulting string
		text = subject.replaceAll(subject, "ma");
		System.out.println(text); // ma
		System.out.println(subject); // JavA

		int index;
		// indexOf('character')
		// returns the index or position of the first occurrence of
		// the specified character in a string
		// returns -1 if the character is not there
		index = subject.indexOf('J');
		System.out.println(index); // 0

		index = subject.indexOf("as");
		System.out.println(index); // -1

		char character;
		// charAT(index)
		// returns the character values at the specified index or positions
		character = subject.charAt(2);
		System.out.println(character); // v

		int size;
		// length()
		// returns the length of a specified string
		// returns the total count of character in the specified string
		size = subject.length();
		System.out.println(size); // 4

		// isEmpty()
		// checks whether the string is empty or not
		// returns true is the length is 0 otherwise false
		isTrueOrFalse = " ".isEmpty();
		System.out.println(isTrueOrFalse); // false

		isTrueOrFalse = "".isEmpty();
		System.out.println(isTrueOrFalse); // true

		// lastIndexOf('character')
		// returns the position or index of last found occurrence
		// specified characters in a string
		// returns -1 if the character is not found
		index = subject.lastIndexOf('A');
		System.out.println(index); // 3

		// endsWith("text")
		// tests if this string ends with specified suffix
		// checks whether a string ends with the specified character(s)
		// returns true or false
		isTrueOrFalse = subject.endsWith("vA");
		System.out.println(isTrueOrFalse); // true

		// startsWith("text")
		// checks whether a string starts with the specified character(s)
		// returns true or false
		isTrueOrFalse = subject.startsWith("Ja");
		System.out.println(isTrueOrFalse); // true

		// trim()
		// removes whitespace from both ends of a string
		// returns the resulting string
		text = "                        sun shine       ".trim();
		System.out.println(text);

		// isBlank()
		// returns true if the string is blank
		// or contains only white space otherwise, false
		isTrueOrFalse = "    ".isBlank();
		System.out.println(isTrueOrFalse); // true

	}

}
