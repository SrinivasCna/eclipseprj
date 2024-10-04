package practice;

import java.util.Scanner;

public class FindLargestNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the size of the array");
		int size = sc.nextInt();

		int[] numbers = new int[size];

		System.out.println("enter the elements of the array");

		for (int i = 0; i < size; i++) {
			numbers[i] = sc.nextInt();
		}

		System.out.println("entered elements are");
		for (int num : numbers) {
			System.out.println(num);

		}
		int largesttt = largest(numbers);
		System.out.println(largesttt);
	}

	public static int largest(int[] numbers) {
		int largest = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > largest) {
				largest = numbers[i];
			}
		}
		return largest;
	}
}
