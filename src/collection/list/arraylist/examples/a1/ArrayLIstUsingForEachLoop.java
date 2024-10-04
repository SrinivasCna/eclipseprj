package collection.list.arraylist.examples.a1;

import java.util.ArrayList;

public class ArrayLIstUsingForEachLoop {
	public static void main(String[] args) {
		ArrayList<String> subjectList = new ArrayList<>();
		// System.out.println(subjectList);

		// add(element)
		// adds the specified elements to the end of the list
		// returns true
		subjectList.add(null);
		subjectList.add("java");
		subjectList.add("SQL");
		subjectList.add("ai");
		subjectList.add("python");
		subjectList.add("machine learning");
		subjectList.add("java");

		System.out.println(subjectList);

		System.out.print("[");
		// accessing the elements from the start using for each loop
//		for (String subject : subjectList) {
//			System.out.print(subject + ", ");
//		}
		System.out.print(subjectList.size());
		for (int i = 0; i < subjectList.size(); i++) {
			System.out.print(subjectList.get(i));
			if (i == subjectList.size() - 1) {
				System.out.print(".");
			} else {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}
}
