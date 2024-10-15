package stream.reduce.examples.a1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ReduceWithIntegerExample {

	// return sum of numbers which are greater than 5
	public static void main(String[] args) {
		// sum of numbers greater than 5using Iterator(normal code)
		List<Integer> numberList = Arrays.asList(4, 5, 6, 7, 8);
		System.out.println(numberList);

		Iterator<Integer> itr = numberList.iterator();
		Integer normalResult = 0;

		while (itr.hasNext()) {
			Integer number = itr.next();

			if (number > 5) {
				normalResult = normalResult + number;
			}
		}
		System.out.println("sum without using stream: " + normalResult);

		// sum of numbers greater than 5 using stream
		Integer streamResult = numberList.stream()

				.filter(n -> n > 5)

				.mapToInt(n -> n)

				.sum();
		System.out.println("sum using stream reduce: " + streamResult);

	}

}
