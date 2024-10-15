package stream.foreach.examples.a1;

import java.util.Arrays;
import java.util.List;

public class ForEachWithIntegerExample {

	public static void main(String[] args) {
		List<Integer> numberList = Arrays.asList(2, 4, 6, 8, 10);
		numberList.stream().forEach(n -> System.out.println(n));
		// OR
		// numberList.stream().forEach(System.out::println);
	}

}
