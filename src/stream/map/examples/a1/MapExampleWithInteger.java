package stream.map.examples.a1;

import java.util.Arrays;
import java.util.List;

public class MapExampleWithInteger {

	public static void main(String[] args) {
		List<Integer> numberList = Arrays.asList(1, 2, 3, 4);
		numberList.stream().map(number -> number * 2).forEach(System.out::println);
		
	}

}
