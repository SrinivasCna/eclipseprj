package stream.sorted.examples.a1;

import java.util.Arrays;
import java.util.List;

public class SortedWithIntegerExample {

	public static void main(String[] args) {
		List<Integer> numberList = Arrays.asList(3, 2, 0, -1);
		numberList.stream().sorted().forEach(System.out::println);

	}

}
