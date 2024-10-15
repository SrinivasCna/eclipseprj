package functionalProgramming.examples.a1;

import java.util.List;

// Traditional Approach - Structured Programming
// Problem: Print  each element from the list on its own line 
// [12, 9, 13, 4, 6, 2, 4, 12, 15]

public class FP01Structured {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		printAllNumbersInListStructured(numbers);

	}

	private static void printAllNumbersInListStructured(List<Integer> numbers) {
		// Structured Programming
		// How to loop the numbers
		// once decided hoe to loop
		// then print each number

		for (int number : numbers) {
			System.out.println(number);
		}

	}

}
