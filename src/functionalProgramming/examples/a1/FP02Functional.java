package functionalProgramming.examples.a1;

import java.util.List;

// Functional Programming
// Problem: Print  each element from the list on its own line 
// [12, 9, 13, 4, 6, 2, 4, 12, 15]

public class FP02Functional {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		printAllNumbersInListFunctional(numbers);

	}

//	private static void print(int number) {
//		System.out.println(number);
//	}

	private static void printAllNumbersInListFunctional(List<Integer> numbers) {

		numbers.stream()

				.forEach(System.out::println); // Method Reference

	}

}
