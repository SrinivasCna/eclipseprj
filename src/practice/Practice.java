package practice;

import java.util.Arrays;

public class Practice {

	// Method to sort the alphanumeric characters in the string
	public static String sortString(String input) {
		// Convert the input string to a character array
		char[] chars = input.toCharArray();

		// Extract alphanumeric characters
		StringBuilder alphanumeric = new StringBuilder();
		for (char c : chars) {
			if (Character.isLetterOrDigit(c)) {
				alphanumeric.append(c);
			}
		}

		// Sort alphanumeric characters
		char[] sortedAlphanumeric = alphanumeric.toString().toCharArray();
		Arrays.sort(sortedAlphanumeric);

		// Build the result with sorted alphanumeric characters in place
		StringBuilder result = new StringBuilder();
		int index = 0;
		for (char c : chars) {
			if (Character.isLetterOrDigit(c)) {
				result.append(sortedAlphanumeric[index++]);
			} else {
				result.append(c);
			}
		}

		return result.toString();
	}

	public static void main(String[] args) {
		// Test case
		String input = "cd,br&d.$e";
		String output = sortString(input);
		System.out.println("Input:  \"" + input + "\"");
		System.out.println("Output: \"" + output + "\"");
	}
}