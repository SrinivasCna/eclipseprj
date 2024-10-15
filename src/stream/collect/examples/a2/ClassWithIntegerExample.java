package stream.collect.examples.a2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ClassWithIntegerExample {

	public static void main(String[] args) {
		List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println(numberList);

		List<Integer> squareList = numberList.stream()
				.map(n -> n * n).collect(Collectors.toList());
		
		System.out.println(squareList);

	}

}
