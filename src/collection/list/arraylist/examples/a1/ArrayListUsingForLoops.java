package collection.list.arraylist.examples.a1;

import java.util.ArrayList;

public class ArrayListUsingForLoops {
	public static void main(String[] args) {
		ArrayList<String> subjectList = new ArrayList<>();
		System.out.println(subjectList);

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

		// size()
		// returns the number of elements in this list
		int size = subjectList.size();
		System.out.println(size);

		// accessing the elements from the start using for loops
		for (int i = 0; i < size; i++) {
			String element = subjectList.get(i);
			System.out.print(element + ", ");
		}

		// accessing the elements from the last using for loops
		for (int index = size - 1; index > -1; index--) {
			String element = subjectList.get(index);
			System.out.print(element + ", ");

		}
	}
}
