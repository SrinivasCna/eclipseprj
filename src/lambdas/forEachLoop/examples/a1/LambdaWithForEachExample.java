package lambdas.forEachLoop.examples.a1;

import java.util.ArrayList;

public class LambdaWithForEachExample {

	public static void main(String[] args) {
		ArrayList<String> subjectList = new ArrayList<>();
		subjectList.add("java");
		subjectList.add("python");
		subjectList.add("sql");
		subjectList.add("html");
		subjectList.add("c++");
		System.out.println(subjectList);

		// access elements of array list using for each loop
		// normal code using " for each loop "
		for (String subject : subjectList) {
			System.out.println("Subject: " + subject);
		}

		// access elements of array list using for each loop
		// lambda expression using " for each loop "
		subjectList.forEach((s) -> {
			System.out.println("Subject: " + s);

		});

		// access elements of array list using for each loop
		// lambda expression using " for each loop "
		subjectList.forEach((s) -> System.out.println("Subject: " + s));

	}
}
