package stream.collect.examples.a1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectWithIntegerExample {

	public static void main(String[] args) {
		List<Integer> numberList = Arrays.asList(5, 4, 1, 2, 7, 6, 8);
		System.out.println(numberList);

		List<Integer> sortedNumberList = numberList.stream().sorted().collect(Collectors.toList());

		System.out.println(sortedNumberList);
	}

}
