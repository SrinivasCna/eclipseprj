package functionalProgramming.examples.a1;

import java.util.List;

// Functional Programming
// Problem: Print  each element from the list on its own line 
// [12, 9, 13, 4, 6, 2, 4, 12, 15]

public class FP01Functional {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		printAllNumbersInListFunctional(numbers);

	}

	private static void print(int number) {
		System.out.println(number);
	}

	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		// lIst of numbers: [12, 9, 13, 4, 6, 2, 4, 12, 15]
		// convert to stream of numbers or sequence of numbers
		// 12
		// 9
		// 13
		// ......

		// Functional Programming
		// What to do

		numbers.stream()

				// print method will be executed
				// here we do not want to execute the print method but we want to define the
				// print method
				// here we want to define the what to do when we get the number
				// e.g, 12 . To define the behavior, we use Method Reference
				// Name of the class followed by:: followed by name of the method
				// .forEach(print(5));

				.forEach(FP01Functional::print); // Method Reference

//	Structured Programming
//	How to loop the numbers
//	once decided hoe to loop
//	then print each number
//
//		for (int number : numbers) {
//			System.out.println(number);
//		}

	}

}
