package stream.map.examples.a1;

import java.util.Arrays;
import java.util.List;

public class MapExampleWithString {

	public static void main(String[] args) {
		List<String> subjectList=Arrays.asList("java","python","sql","ai");
		subjectList.stream().map(subject -> subject.toUpperCase())
		
		.forEach(System.out::println);
	}

}
