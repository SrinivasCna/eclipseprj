package basics.ch_09_arrays.practice;

import java.util.Arrays;

public class Initialize {
	public static void main(String[] args) {

		int[] numbers1 = new int[3]; // Array for 3 int values, default value is 0
		int[] numbers2 = { 1, 2, 3 }; // Array literal of 3 int values
		int[] numbers3 = new int[] { 1, 2, 3 }; // Array of 3 int values initialized
		int[][] numbers4 = { { 1, 2 }, { 3, 4, 5 } }; // Jagged array literal
		int[][] numbers5 = new int[5][]; // Jagged array, one dimension 5 long
		int[][] numbers6 = new int[5][4]; // Multidimensional array: 5x4

		String[] array8 = new String[3];
		Arrays.fill(array8, "abc"); // { "abc", "abc", "abc" }
		Arrays.fill(array8, 1, 2, "abc");

		int[] array = new int[5];
		Arrays.setAll(array, i -> i); // The array becomes { 0, 1, 2, 3, 4 }

		int size = 42;
		int[] aaarray = new int[size];

		aaarray[32] = 20;
		System.out.println(aaarray.length);
		System.out.println(aaarray.length);

		int[][] table = { 
				{ 1, 2, 3 }, 
				{ 4, 5, 6 } 
		};
		
		String[] people = new String[] { "Carol", "Andy" };
		int index = 2;
		if (index >= 0 && index < people.length) {
		 System.out.println(people[index]);
		}
		Integer[] integerArray = {1, 2, 3};
		Number[] numberArray = integerArray; // valid
		Number firstElement = numberArray[0]; // valid
		numberArray[0] = 4; 


	}
}
