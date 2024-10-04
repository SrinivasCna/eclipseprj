package practice;

import java.util.Arrays;

public class Try {
	
	public static boolean Anagram(String str1, String str2) {

		str1 = str1.replace("\\s", "").toLowerCase();
		str2 = str2.replace("\\s", "").toLowerCase();
		if (str1.length() != str2.length()) {
			return false;
		}
		
		char[] array1 = str1.toCharArray();
		char[] array2 = str2.toCharArray();

		Arrays.sort(array1);
		Arrays.sort(array2);
		
		return Arrays.equals(array1, array2);
		
	}

	public static void main() {
		
		String str1 = "Silent";
		String str2 = "Listen";

		if (Anagram(str1, str2)) {
			System.out.println(str1 + "and" + str2 + " are   anagram");
		} else {
			System.out.println(str1 + "and" + str2 + " are not an anagram");
		}
		
	}
}
