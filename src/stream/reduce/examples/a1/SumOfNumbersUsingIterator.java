package stream.reduce.examples.a1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SumOfNumbersUsingIterator {
	// Write program using iterator to calculate
	// sum of numbers greater than 5
	// 1, 2, 3, 4, 5, 6, 7, 8
	// 6, 7, 8

	public static void main(String[] args) {
		List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		System.out.println(numberList);

		Integer total = 0;

		Iterator<Integer> iterator = numberList.iterator();

		while (iterator.hasNext()) {
			Integer number = iterator.next();

			if (number > 5) {
				total = total + number;
			}
		}

		System.out.println(total);

	}

}
