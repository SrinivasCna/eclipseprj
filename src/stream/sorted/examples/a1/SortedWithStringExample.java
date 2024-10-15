package stream.sorted.examples.a1;

import java.util.Arrays;
import java.util.List;

public class SortedWithStringExample {

	public static void main(String[] args) {
		List<String> subjectList = Arrays.asList("java", "python", "html", "sql", "ai");
		subjectList.stream().sorted().forEach(System.out::println);

	}

}
