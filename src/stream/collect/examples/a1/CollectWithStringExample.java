package stream.collect.examples.a1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectWithStringExample {

	public static void main(String[] args) {
		List<String> subjectList = Arrays.asList("sql", "java", "python", "ai", "html");
		System.out.println(subjectList);

		List<String> sortedSubjectList = subjectList.stream()
				.sorted().collect(Collectors.toList());

		System.out.println(sortedSubjectList);

	}

}
