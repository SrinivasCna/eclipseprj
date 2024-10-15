package stream.filter.examples.a1;

import java.util.stream.Stream;

public class FilterWithStringExample {

	public static void main(String[] args) {
		Stream<String> subjectStream = Stream.of("java", "python", "sql", "html", "ai");
		subjectStream.filter(s -> s.contains("a")).forEach(System.out::println);
	}

}
