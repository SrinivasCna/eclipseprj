package stream.foreach.examples.a1;

import java.util.Arrays;
import java.util.List;

public class ForEachWithStringExample {

	public static void main(String[] args) {
		List<String> subjectList = Arrays.asList("java", "python", "sql", "ai", "html");
		subjectList.stream().forEach(System.out::println);
	}

}
